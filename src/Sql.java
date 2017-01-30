/**
 * Created by User on 30/01/2017.
 */

import java.sql.*;

public class Sql {




   public   Connection c = null;
    public Statement stmt = null;





    public static void InsertCustomer(Customers cust) {

        try

        {
            Connection c = null;
            Statement stmt = null;
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\User\\dbFinalProject.db");
            System.out.println("Opened database successfully");
        }

        catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }

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
