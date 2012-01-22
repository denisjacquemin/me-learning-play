package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
      String message = "Hello World";
      return ok( index.render(message) );
  }
}