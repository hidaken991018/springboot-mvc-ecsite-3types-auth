package myapp.Hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@Autowired
	private HelloService service;

	@GetMapping("/hello")
	public String getHello() {
		return "hello/index";
	}

	@GetMapping("/hello/response")
	public String postHello(@RequestParam("text1") String str, Model model) {

		model.addAttribute("sample", str);

		return "hello/response";

	}

	@PostMapping("/hello/db")
	public String postHelloDb(@RequestParam("text2") String id, Model model) {

		//１件検索
		Employee employee = service.getEmployee(id);

		//検索結果をModelに登録
		model.addAttribute("employee", employee);

		//db.htmlに画面遷移
		return "hello/db";
	}

}
