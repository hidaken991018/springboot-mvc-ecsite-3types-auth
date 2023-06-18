package myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ViewController {
    
    @GetMapping("/login")
    public String login () {
        return "login";
    }
    
    @GetMapping("/auth_select")
    public String auth_select() {
    	return "auth_select";
    }
}

