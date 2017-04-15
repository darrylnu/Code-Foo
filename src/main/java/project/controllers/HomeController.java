package project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import project.services.IgnVideoService;


@Controller
public class HomeController {

    @RequestMapping("/home")
    @ResponseBody
    public String getHomePage() {
        System.out.println("this is it");
        try {
            return new IgnVideoService().sendVideoRequest();
        } catch (Exception e) {
            //
        }
        return "";
    }
}
