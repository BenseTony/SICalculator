package models;

import com.avaje.ebean.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person extends Model {

    //@Id
    //public String id;
    public String name;
    public int principal;
    public int period;
    public int rate;
    public float answer;
    public void testt()
    {
        answer = (principal*period*rate)/100;
    }

}
