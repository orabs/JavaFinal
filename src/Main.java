import java.util.ArrayList;
import java.util.Date;

/**
 * Created by User on 24/01/2017.
 */
public class Main {

    public static void main( String args[] ){
Date temp=new Date(02,02,1988);

Customers cust=new Customers("1","1","dhd","2","2","safa@mail.com","jer","herzel",2);

//Sql.InsertCustomer(cust);
      ArrayList<Jobs> jobs = new ArrayList();
        jobs=Sql.SelectJobs();
        System.out.println(jobs);

    }

}
