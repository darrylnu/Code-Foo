package project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

/**
 * Created by darrylnunn on 4/15/17.
 */
@Controller
public class HomeController {

    @RequestMapping("/home")
    @ResponseBody
    public String getHomePage() {
        System.out.println("this is it");
        return "Hello man";
    }
}
