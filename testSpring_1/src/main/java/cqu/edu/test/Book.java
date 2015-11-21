package cqu.edu.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/test")
public class Book {
	
	@RequestMapping("/success")
	public String success(){
		return "success";
	}
}
