/**
 * Created by User on 30/01/2017.
 */
public class Jobs {

    int id;
    int custId;
    int profId;
    String place;
    String date;
    String price;
    String details;


    public Jobs(){};

    public Jobs(int id,int custid,int profid,String place,String date,String price,String details){
        this.id=id;
        this.custId=custid;
        this.profId=profid;
        this.place=place;
        this.date=date;
        this.price=price;
        this.details=details;


    }

    public void setId(int id){this.id=id;}
    public void setCustId(int id){this.custId=id;}
    public void setProfId(int id){this.profId=id;}
    public void setPlace(String place){this.place=place;}
    public void setPrice(String price){this.price=price;}
    public void setDate(String date){this.date=date;}
    public void setDetails(String details){this.details=details;}

    public int getId() {
        return id;
    }

    public int getCustId() {
        return custId;
    }

    public int getProfId() {
        return profId;
    }

    public String getPlace() {
        return place;
    }

    public String getDate() {
        return date;
    }

    public String getPrice() {
        return price;
    }

    public String getDetails() {
        return details;
    }
}
