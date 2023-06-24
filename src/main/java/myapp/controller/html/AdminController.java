package myapp.controller.html;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import myapp.model.response.admin.UserList;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
    @GetMapping("/user_list")
    public String user_list(Model mod) {
    	
    // 仮のデータとして配列を作成	
    List<UserList> users = new ArrayList<UserList>();
    
    //　値を生成し配列に追加
    for(int i = 1; i <= 8; i++ ) {
    	UserList user = new UserList();
    	user.setIndex(i);
    	user.setName("山田太郎");
    	user.setBirth("2000.10.10");
    	users.add(user);
    	
    }
    
    // 
    mod.addAttribute("users",users);
    
    	return "admin/user_list";
    }
    
}
