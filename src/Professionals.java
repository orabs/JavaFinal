import java.util.Date;

/**
 * Created by User on 30/01/2017.
 */
public class Professionals {


    int Id;
    String FirstName;
    String LastName;
    String BirthDate;
    String TelNum;
    String CellNum;
    String Mail;
    String City;
    String Street;
    int dep_num;



    public Professionals(){}

    public Professionals(int Id,String FirstName,String Lastname,String BirthDate,String TelNum,String CellNum,String Mail,String City,String Street,int dep_num){
        this.Id=Id;
        this.FirstName=FirstName;
        this.LastName=Lastname;
        this.BirthDate=BirthDate;
        this.TelNum=TelNum;
        this.CellNum=CellNum;
        this.Mail=Mail;
        this.City=City;
        this.Street=Street;
        this.dep_num=dep_num;
    }
    public void setId(int Id) {this.Id=Id;}
    public void setFirstName(String First){this.FirstName=First;}
    public void setLastName(String Last){this.FirstName=Last;}

    public void setBirthDate(String BirthDate){this.FirstName=BirthDate;}
    public void setCity(String City){this.FirstName=City;}
    public void setStreet(String Street){this.FirstName=Street;}
    public void setDep_num(String Dep){this.FirstName=Dep;}


    public int getId(){return this.Id;}
    public String getFirstName(){return this.FirstName;}
    public String getLastName(){return this.LastName;}
    public String getBirthDate(){return this.BirthDate;}
    public String getTelNum(){return this.TelNum;}
    public String getCellNum(){return this.CellNum;}
    public String getMail(){return this.Mail;}
    public String getCity(){return this.City;}
    public String getStreet(){return this.Street;}
    public int getDep_num(){return this.dep_num;}
}
