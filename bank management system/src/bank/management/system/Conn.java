package bank.management.system;

import java.sql.*;

public class Conn {
    // DECLARING VARIABLES FOR CONNECTION AND STATEMENT
    Connection c;
    Statement s;
    // CONSTRUCTOR TO ESTABLISH CONNECTION TO DATABASE
    public Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "5210");
            // CREATING A STATEMENT OBJECT TO EXECUTE SQL QUERIES
            s = c.createStatement();
        } catch (Exception e) {
             // PRINTING EXCEPTION DETAILS IF CONNECTION OR STATEMENT CREATION FAILS
            System.out.println(e);
        }

    }
}
