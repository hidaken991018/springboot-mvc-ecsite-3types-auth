package myapp.controller.html;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/buyer")
public class BuyerController {
    @GetMapping("catalog")
    public String catalog() {
    	return "buyer/catalog";
    }

}
