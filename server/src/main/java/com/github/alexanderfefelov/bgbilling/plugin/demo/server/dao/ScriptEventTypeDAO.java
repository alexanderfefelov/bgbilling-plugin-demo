package com.github.alexanderfefelov.bgbilling.plugin.demo.server.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.github.alexanderfefelov.bgbilling.plugin.demo.common.model.ScriptEventType;
import org.apache.log4j.Logger;

public class ScriptEventTypeDAO {

    public ScriptEventTypeDAO(Connection connection, Logger logger) {
        this.connection = connection;
        this.logger = logger;
    }

    public List<ScriptEventType> findAll() throws SQLException {
        List<ScriptEventType> list = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(QUERY_FIND_ALL);
            while (resultSet.next()) {
                ScriptEventType record = new ScriptEventType();
                record.setId(resultSet.getLong("id"));
                record.setModuleId(resultSet.getString("mid"));
                record.setEventMode(resultSet.getInt("event_mode"));
                record.setEventId(resultSet.getString("event_id"));
                record.setTitle(resultSet.getString("title"));
                list.add(record);
            }
            return list;
        } catch (SQLException sqle) {
            logger.error(sqle);
            throw sqle;
        }
    }

    public static final String QUERY_FIND_ALL = "select * from script_event_type";

    private Connection connection;
    private Logger logger;

}
