package cn.itcast.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.core.pojo.User;
import cn.itcast.core.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/insert.action")
	public String toList() {
		return "insert";
	}

	@RequestMapping("/list.action")
	public String insert(User user, Model model) {
		userService.save(user);
		List<User> list = userService.findAll();
		model.addAttribute("userList", list);
		return "list";
	}
}
