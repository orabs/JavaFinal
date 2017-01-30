

import java.sql.*;

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

    public static void InsertProffesionals(Proffesionals prof) {

    }
    public static void InsertFeedBack(FeedBacks feed) {

    }

    public static void RemoveCustomer(Customers cust) {

    }

    public static void RemoveProffesionals(Proffesionals prof) {

    }
    public static void RemoveFeedBack(FeedBacks feed) {

    }

    public static void UpdateCustomer(Customers cust,int custid) {

    }

    public static void UpdateProffesionals(Proffesionals prof,int proid) {

    }
    public static void UpdateFeedBack(FeedBacks feed,int feedid) {

    }
}
