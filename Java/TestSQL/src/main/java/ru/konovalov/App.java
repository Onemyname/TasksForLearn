package ru.konovalov;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App

{
    private static final String user = "root";
    private static final String pass = "Knopka9955!";

    private static final String url = "jdbc:mysql://localhost:3306/test";

    public static void main( String[] args ) throws SQLException {

        Connection connection = DriverManager.getConnection(url, user, pass);

        System.out.println( "Соединение с базой установлено!");

        Statement statement = connection.createStatement();

//        statement.executeUpdate("INSERT INTO employees VALUES(2 ,'Vadim', 'Konovalov', 1000)");

        ResultSet resultSet = statement.executeQuery("select * from employees");

        ResultSetMetaData metaData = resultSet.getMetaData();

        int columnCount = metaData.getColumnCount();

        for (int i = 1; i <= columnCount; i++) {
            System.out.print(metaData.getColumnLabel(i)+"\t");
        }
        System.out.println();
        while(resultSet.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(resultSet.getString(i) + "\t");
            }
            System.out.println();
        }


    }
}
