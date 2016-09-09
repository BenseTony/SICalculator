package controllers;

import com.avaje.ebean.Model;
import models.Person;
import play.data.Form;
import play.mvc.*;
import views.html.*;
import java.util.List;
import static play.libs.Json.toJson;

public class HomeController extends Controller {

    public  Result index() {
        return ok(index.render("Simple Interest Calculator"));
    }
    public  Result addPerson(){
        Person person = Form.form(Person.class).bindFromRequest().get();
        person.calculate();
        person.save();
        return redirect(routes.HomeController.index());
    }
    public Result getPersons(){
        List<Person> persons = new Model.Finder <String, Person>(Person.class).all();
        return ok(toJson(persons));
    }

}
