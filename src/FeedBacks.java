/**
 * Created by User on 30/01/2017.
 */
public class FeedBacks {

    int feedId;
    int ProfId;
    int CusId;
    Rating service;
    Rating reliability;
    Rating professional;
    Rating punctuality;
    Rating price;
    String comment;


public FeedBacks(){}

public FeedBacks(int pId,int cId,Rating service,Rating reliability,Rating professional,Rating punctuality,Rating price,String comment,int feedId){

    this.ProfId=pId;
    this.CusId=cId;
    this.service=service;
    this.reliability=reliability;
    this.professional=professional;
    this.punctuality=punctuality;
    this.price=price;
    this.comment=comment;
    this.feedId=feedId;



}

    public void setFeedId(int id){this.feedId=id;}
    public void setProfId(int id){this.ProfId=id;}
public void setCusId(int id){this.CusId=id;}
public void setService(Rating lvl){this.service=lvl;}
public void setReliability(Rating lvl){this.reliability=lvl;}
public void setProfessional(Rating lvl){this.professional=lvl;}
public void setPunctuality(Rating lvl){this.punctuality=lvl;}
public void setPrice(Rating lvl){this.price=lvl;}


public int getFeedId(){return this.feedId;}
public int getProfId(){return this.ProfId;}
public int getCusId(){return this.CusId;}
public Rating getService(){return this.service;}
public Rating getReliability(){return this.reliability;}
public Rating getProfessional(){return this.professional;}
public Rating getPunctuality(){return this.punctuality;}
public Rating getPrice(){return this.price;}
public String getComment(){return this.comment;}




public enum Rating {
   Lowest,Low,Moderate,Good,Excellent
}

}
