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
        List<ScriptEventType> result = new ArrayList<>();
        String query = "select * from script_event_type";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                ScriptEventType record = new ScriptEventType();
                record.setId(resultSet.getLong("id"));
                record.setModuleId(resultSet.getString("mid"));
                record.setEventMode(resultSet.getInt("event_mode"));
                record.setEventId(resultSet.getString("event_id"));
                record.setTitle(resultSet.getString("title"));
                result.add(record);
            }
            return result;
        } catch (SQLException sqle) {
            logger.error(sqle);
            throw sqle;
        }
    }

    private Connection connection;
    private Logger logger;

}