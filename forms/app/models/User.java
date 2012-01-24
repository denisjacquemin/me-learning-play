package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

/**
 * User entity managed by Ebean
 */
@Entity 
public class User extends Model {

    @Id
    @Constraints.Required
    @Formats.NonEmpty
    public int id;
    
    @Constraints.Required
    @Formats.NonEmpty
    public String firstname;
    
    @Constraints.Required
    @Formats.NonEmpty
    public String lastname;
    
    // -- Queries
    
    public static Model.Finder<String,User> find = new Model.Finder(String.class, User.class);
    
    /**
     * Retrieve all users.
     */
    public static List<User> findAll() {
        return find.all();
    }
    
    // --
    
    public String toString() {
        return "User( id(" + id + ") " + firstname + " " + lastname + ")";
    }
}