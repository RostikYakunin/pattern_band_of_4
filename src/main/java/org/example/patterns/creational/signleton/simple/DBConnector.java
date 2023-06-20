package org.example.patterns.creational.signleton.simple;

public class DBConnector {
    private static DBConnector dbConnector;

    private DBConnector(String DBName) {
    }

    public static DBConnector getInstance(String DBName) {
        if (dbConnector == null) {
            dbConnector = new DBConnector(DBName);
        }
        return dbConnector;
    }
}
