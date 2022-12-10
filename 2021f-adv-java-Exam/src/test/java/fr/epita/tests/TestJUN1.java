package fr.epita.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJUN1 {
    static {
        System.setProperty("conf.file", "src/test/resources/conf.properties");
    }
    private Connection connection;
    private static final String DB_DRIVER = "org.h2.Driver";
    private static final String DB_CONNECTION = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
    private static final String DB_USER = "username";
    private static final String DB_PASSWORD = "password";
    public static void main(String[] args) throws Exception {
        insertWithStatement();
    }
    private static void insertWithStatement() throws SQLException {
        Connection connection = getDBConnection();
        String string = new String();
        StringBuffer stringbuffer = new StringBuffer();
        try {
            //use of filereader to fetch the data from specific path
            FileReader filereader = new FileReader(new File("src/test/resources/create-facilities.sql"));
            //use of buffer to input from the specified file
            BufferedReader bufferReader = new BufferedReader(filereader);
            while (( string = bufferReader.readLine()) != null) {
                stringbuffer.append(string);
            }
            bufferReader.close();

            String[] tech = stringbuffer.toString().split(";");
            Statement statement = connection.createStatement();
            for (int j = 0; j < tech.length; j++) {
                if (!tech[j].trim().equals("")) {
                    statement.executeUpdate(tech[j]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }
    private static Connection getDBConnection() {
        Connection dbConnection = null;
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            return dbConnection;
        } catch (SQLException e) {
            //System.out.println(e.getMessage());
        }
        return dbConnection;
    }


}
