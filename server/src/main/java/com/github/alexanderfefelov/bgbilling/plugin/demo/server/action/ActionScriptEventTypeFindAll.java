package com.github.alexanderfefelov.bgbilling.plugin.demo.server.action;

import bitel.billing.server.ActionBase;
import com.github.alexanderfefelov.bgbilling.plugin.demo.common.model.ScriptEventType;
import com.github.alexanderfefelov.bgbilling.plugin.demo.server.dao.ScriptEventTypeDAO;
import org.w3c.dom.Element;

import java.sql.SQLException;
import java.util.List;

public class ActionScriptEventTypeFindAll extends ActionBase {

    @Override
    public void doAction() throws SQLException {
        ScriptEventTypeDAO dao = new ScriptEventTypeDAO(con, log);
        List<ScriptEventType> list = dao.findAll();
        Element xml = createElement(rootNode, "list");
        list.forEach(record -> createElementFromRecord(xml, record));
    }

    private Element createElementFromRecord(Element xml, ScriptEventType record) {
        Element element = createElement(xml, "record");
        element.setAttribute("id", record.getId().toString());
        element.setAttribute("moduleId", record.getModuleId());
        element.setAttribute("eventMode", record.getEventMode().toString());
        element.setAttribute("eventId", record.getEventId());
        element.setAttribute("title", record.getTitle());
        return element;
    }

}
