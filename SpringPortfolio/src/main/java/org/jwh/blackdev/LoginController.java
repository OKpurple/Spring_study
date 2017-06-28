package org.jwh.blackdev;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping(value ="", method = RequestMethod.GET)
	public String login(HttpServletRequest req){
		if ( req.getQueryString() == null ){
		return "naverlogin";
		}else{
			String query_string = req.getQueryString(); 
			String querys[] = query_string.split("&");
			for(String i : querys){
				System.out.println( i );	
			}
			
			return "callback";
		}
	}
	
	@RequestMapping(value ="/callback", method = RequestMethod.GET)
	public String login1(){
		return "callback";
	}
}
