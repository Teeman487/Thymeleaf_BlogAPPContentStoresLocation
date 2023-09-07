package net.ummuaqibatulkhair.thymeleaf_blogappcontentstoreslocation.controller;

import net.ummuaqibatulkhair.thymeleaf_blogappcontentstoreslocation.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller

public class PersonController {
// 1. handler method to handle content-stores-variable-expression-request
// http://localhost:8080/content-stores-var-exp
    @GetMapping("/content-stores-var-exp")
    public String variableExpression(Model model) {
        Person person = new Person("Ogundimu Rofiat", "morenike4@gmail.com", "AgricExpert", "Female");
        model.addAttribute("person", person);
        return "content-stores-var-exp";
    }

    //2.  handler method to handle content-stores-selection-expression-request
    // http://localhost:8080/content-stores-sel-exp
    @GetMapping("/content-stores-sel-exp")
    public String selectionExpression(Model model) {
        Person person = new Person("Akinade Toheeb", "adebusoyeteeman@gmail.com", "Software Engineer", "Male");
        model.addAttribute("person", person );
        return "content-stores-sel-exp";
    }

    //3. handler method to handle content-stores-message-expressions request
    // http://localhost:8080/content-stores-mess-exp
    @GetMapping("/content-stores-mess-exp")
    public String messageExpression() {
        return "content-stores-mess-exp";

    }

    // 4. handleer method to handle content-stores-link expressions
    // http://localhost:8080/content-stores-link-exp
    @GetMapping("/content-stores-link-exp")
    public String linkExpression(Model model) {
        model.addAttribute("id", "1");
        return "content-stores-link-exp";
    }

    // 5. handler method to handle content-stores-fragment expression
    // http://localhost:8080/content-stores-fragment-exp
    @GetMapping("/content-stores-fragment-exp")
    public String fragmentExpression() {
        return "content-stores-fragment-exp";

    }
  // handler method to handle content-users Iteration  in Thymeleaf
  // http://localhost:8080/content-users
    @GetMapping("/content-users")
    public String users(Model model) {
        Person admin = new Person ("Rofiat", "morenike4@gmail.com", "AgricExpert", "Female");
        Person aqibat = new Person("Aqibat", "aqibat4@gmail.com", "WebDeveloper", "Female");
        Person shakira = new Person("shakira", "shakira2@gmail.com", "ElectricalEngineer", "Female");
        List<Person> person = new ArrayList<>();
        person.add(admin);
        person.add(aqibat);
        person.add(shakira);
        model.addAttribute("users", person);
        return "content-users";
    }

    // handler method to handle content-if-unless
    // http://localhost:8080/content-if-unless
   @GetMapping("/content-if-unless")
    public String ifUnless(Model model) {
       Person admin = new Person ("Rofiat", "morenike4@gmail.com", "AgricExpert", "Female");
       Person aqibat = new Person("Aqibat", "aqibat4@gmail.com", "WebDeveloper", "Female");
       Person shakira = new Person("shakira", "shakira2@gmail.com", "ElectricalEngineer", "Female");
       List<Person> person = new ArrayList<>();
       person.add(admin);
       person.add(aqibat);
       person.add(shakira);
       model.addAttribute("users", person);

        return "content-if-unless";
    }
    // handler method to handle content-switch-case
    // http://localhost:8080/content-switch-case
     @GetMapping("content-switch-case")
    public String switchCase(Model model) {
        Person newPer = new Person(
                "Aisha",
                "aisha56@gmail.com",
                "CATERER",
                "Female"
        );
        model.addAttribute("newUser", newPer);
        return "content-switch-case";
    }
}