package myapp.controller.html;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CommonController {

	@GetMapping("login")
	public String login() {
		return "login";
	}

	@GetMapping("auth_select")
	public String auth_select() {
		return "auth_select";
	}

}
