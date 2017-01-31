

import java.sql.*;

public class Sql {

    public static boolean InsertCustomer(Customers cust) {

        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:dbFinalProject");
            con.setAutoCommit(false);
            System.out.println("Opened database successfully");

            String sql = "INSERT INTO Customers (firstname,lastname,birthdate,telephone,cellphone,mail,city,street,apartment) " +
            "VALUES (?, ?, ?, ? ,? ,? ,?, ?,? )";

            PreparedStatement statement = con.prepareStatement(sql);
     {

                 statement.setString(1, cust.getFirstName());
                 statement.setString(2,cust.getLastName());

                 statement.setString(3,cust.getBirthDate());
                 statement.setString(4,cust.getTelNum());
                 statement.setString(5,cust.getCellNum());
                 statement.setString(6,cust.getMail());
                 statement.setString(7,cust.getCity());
                 statement.setString(8,cust.getStreet());
                 statement.setInt(9,cust.getDep_num());
                statement.executeUpdate();
            }
            con.commit();
            con.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Records created successfully");
        return true;

    }

    public static boolean InsertProfessionals(Professionals prof) {
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:dbFinalProject");
            con.setAutoCommit(false);
            System.out.println("Opened database successfully");

            String sql = "INSERT INTO Professionals (firstname,lastname,birthdate,telephone,cellphone,mail,city,street,apartment) " +
                    "VALUES (?, ?, ?, ? ,? ,? ,?, ?,? )";

            PreparedStatement statement = con.prepareStatement(sql);
            {

                statement.setString(1, prof.getFirstName());
                statement.setString(2,prof.getLastName());
                statement.setString(3,  prof.getBirthDate());
                statement.setString(4,prof.getTelNum());
                statement.setString(5,prof.getCellNum());
                statement.setString(6,prof.getMail());
                statement.setString(7,prof.getCity());
                statement.setString(8,prof.getStreet());
                statement.setInt(9,prof.getDep_num());
                statement.executeUpdate();
            }
            con.commit();
            con.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Records created successfully");
        return true;

    }


    public static boolean InsertFeedBack(FeedBacks feed) {
        return true;
    }

    public static void RemoveCustomer(Customers cust) {

    }

    public static void RemoveProfessionals(Professionals prof) {

    }
    public static void RemoveFeedBack(FeedBacks feed) {

    }

    public static void UpdateCustomer(Customers cust,int custid) {

    }

    public static void UpdateProfessionals(Professionals prof,int proid) {

    }
    public static void UpdateFeedBack(FeedBacks feed,int feedid) {

    }

    public Users[] SelectUsers(){
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM Users;" );
            while ( rs.next() ) {
                int id = rs.getInt("id");
                int profid = rs.getInt("id");
                int id = rs.getInt("id");
                String  firstname = rs.getString("firstname");
                int age  = rs.getInt("age");
                String  address = rs.getString("address");
                float salary = rs.getFloat("salary");

            }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");


    }
}
