package controllers;

import play.*;
import play.mvc.*;
import play.data.*;

import views.html.users.*;

public class Users extends Controller {
    
    public static class User {
        public String firstname;
        public String lastname;
    }
    
    /**
     * /users
     */    
    public static Result index() {
        return ok(
            index.render()
        );
    }
    
    /**
     * /user/new
     */    
    public static Result newUser() {
        return ok(
            newUser.render(form(User.class))
        );
    }

    /**
     * /user/create
     */    
    public static Result create() {
        Form<User> user = form(User.class).bindFromRequest();
        if(user.hasErrors()) {
            return badRequest(newUser.render(user));
        } else {
          return redirect(
              routes.Users.index()
          );
        }
    }
}