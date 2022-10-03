package ir.maktab.util;

import java.sql.Connection;

public class ApplicationConstand {
    private static Connection connection = new DBHelper().connection();
    public static Connection getConnection() {
        return connection;
    }

}
