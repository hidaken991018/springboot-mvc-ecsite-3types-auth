package myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/seller/")
public class SellerController {
    @GetMapping("my_catalog")
    public String my_catalog() {
    	return "seller/my_catalog";
    }
    @GetMapping("register")
    public String register() {
    	return "seller/register";
    }

}
