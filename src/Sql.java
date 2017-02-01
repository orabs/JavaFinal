

import java.sql.*;
import java.util.ArrayList;

public class Sql {





   public   Connection con = null;
    public Statement stmt = null;





    public static void InsertCustomer(Customers cust) {

        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:dbFinalProject");
            con.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = con.createStatement();

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
//            (cust.getFirstName(),cust.getLastName(),cust.getBirthDate(),cust.getTelNum(),cust.getCellNum(),cust.getMail());

            con.commit();
            con.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Records created successfully");

    }

    public static void InsertProffesionals(Professionals prof) {

    }
    public static void InsertFeedBack(FeedBacks feed) {

    }

    public static void RemoveCustomer(Customers cust) {

    }

    public static void RemoveProffesionals(Professionals prof) {

    }
    public static void RemoveFeedBack(FeedBacks feed) {

    }

    public static void UpdateCustomer(Customers cust,int custid) {

    }

    public static void UpdateProffesionals(Professionals prof,int proid) {

    }
    public static void UpdateFeedBack(FeedBacks feed,int feedid) {

    }

    public  ArrayList<Users> SelectUsers() {
        Connection c = null;
        Statement stmt = null;
        ArrayList<Users> users = new ArrayList<Users>();
        Users temp = new Users();
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:dbFinalProject");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Users;");
            while (rs.next()) {
                int id = rs.getInt("id");
                int profid = rs.getInt("profid");
                int custid = rs.getInt("custid");
                String username = rs.getString("username");
                String password = rs.getString("password");

            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");

return users;
    }


    public static ArrayList<Jobs> SelectJobs() {
        Connection c = null;
        Statement stmt = null;
        ArrayList<Jobs> jobs = new ArrayList();
        Jobs temp = new Jobs();
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:dbFinalProject");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Jobs;");
            while (rs.next()) {
                int id = rs.getInt("id");
                int profid = rs.getInt("profid");
                int custid = rs.getInt("custid");
                String place = rs.getString("place");
                String date = rs.getString("date");
                String price = rs.getString("price");
                String details = rs.getString("details");
            temp.setCustId(custid);
            temp.setProfId(profid);
            temp.setCustId(custid);
            temp.setPlace(place);
            temp.setDate(date);
            temp.setPrice(price);
            temp.setDetails(details);

            jobs.add(temp);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");

        return jobs;
    }

}

