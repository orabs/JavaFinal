/**
 * Created by User on 30/01/2017.
 */
public class Users {
    //    ?????
    private int Customerid;
    private int Proffesionalid;
    private String Mail;
    private String UserName;


    public Users(String mail, String userName) {

        Mail = mail;
        UserName = userName;
    }


    public int getCustomerid() {
        return Customerid;
    }

    public void setCustomerid(int customerid) {
        Customerid = customerid;
    }

    public int getProffesionalid() {
        return Proffesionalid;
    }

    public void setProffesionalid(int proffesionalid) {
        Proffesionalid = proffesionalid;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}
