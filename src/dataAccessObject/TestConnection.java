package dataAccessObject;

import java.sql.Connection;

/**
 *
 * @author Tiago Martins Vargas
 *
 */
public class TestConnection {

    public static void main(String[] args) throws Exception {
        Connection connection = new ConnectionFactory().getConnection();
        System.out.println("Connection Open!");
        connection.close();
    }
}
