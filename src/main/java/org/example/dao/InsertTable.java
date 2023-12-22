package org.example.dao;

import org.example.db.Database;

import java.sql.*;

public class InsertTable {
    Connection connection;

    public InsertTable() {
        connection = Database.getConnection();
    }

    public void addWorker(int ID, String NAME, String BIRTHDAY, String LEVEL, int SALARY) {
        String textSql = "INSERT INTO worker VALUES (?,?,?,?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(textSql);
            statement.setInt(1, ID);
            statement.setString(2, NAME);
            statement.setDate(3, java.sql.Date.valueOf(BIRTHDAY));
            statement.setString(4, LEVEL);
            statement.setInt(5, SALARY);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addClient(int ID, String NAME) {
        String textSql = "INSERT INTO client VALUES (?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(textSql);
            statement.setInt(1, ID);
            statement.setString(2, NAME);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addProject(int ID, int CLIENT_ID, String FINISH_DATE) {
        String textSql = "INSERT INTO project (ID,CLIENT_ID,FINISH_DATE) VALUES (?,?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(textSql);
            statement.setInt(1, ID);
            statement.setInt(2, CLIENT_ID);
            statement.setDate(3, java.sql.Date.valueOf(FINISH_DATE));
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addProjectWorker(int PROJECT_ID, int WORKER_ID) {
        String textSql = "INSERT INTO project_worker VALUES (?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(textSql);
            statement.setInt(1, PROJECT_ID);
            statement.setInt(2, WORKER_ID);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
