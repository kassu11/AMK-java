package object_oriented_programming.week_07.chapter_02.task_01.datasource;


import object_oriented_programming.week_07.chapter_02.task_01.controller.CurrencyController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDbConnection {

    private static Connection conn = null;
    private static CurrencyController controller;

    public static Connection getInstance(CurrencyController controllerVar) {
        controller = controllerVar;
        if (conn == null) {
            // connect if necessary
            try {
                conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/currencies?user=appuser&password=curPass123");
            } catch (SQLException e) {
                System.out.println("Connection failed.");
                controllerVar.setErrorLable("Connection failed.");
                e.printStackTrace();
            }
            return conn;
        }
        else {
            return conn;
        }
    }

    public static void terminate() {
        try {
            getInstance(controller).close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}