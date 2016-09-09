package models;

import com.avaje.ebean.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person extends Model {

    public int principal;
    public int num_years;
    public int rate_of_interest;
    public float interest_value;
    public void calculate()
    {
        interest_value = (principal*num_years*rate_of_interest)/100;
    }

}
