package user.example.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.reactive.function.client.WebClientCustomizer.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import user.example.entity.User;
import user.example.service.UserService;

@RequestMapping("/user")
@RestController
public class Controller {
 //org.springframework.web.reactive.function.client.WebClient

	
	 @Autowired 
	    private UserService userService; 

	    @Autowired
	    private RestTemplate restTemplate;
	    
	    @GetMapping("/home")
	    public String MainPage()
	    {
	    	return "It is Home page ";
	    }

//	    @Autowired
//	    public Controller(WebClient.Builder webClientBuilder) {
//	        this.webClient = webClientBuilder.baseUrl("http://example.com").build();
//	    }
	    
	    @GetMapping("/{userId}")
	    public User getUser(@PathVariable("userId") Long userId) {

	        User user = this.userService.getUser(userId);
//	        //http://localhost:9002/contact/user/1311 it is contact url for grtting contact 
//           http://localhost:1991/contact/view/1311
	        List contacts = this.restTemplate.getForObject("http://CONTACTUSER/contact/view/" + user.getUserId(), List.class);
// 
// 
	        user.setContacts(contacts);
	        return user;

	    }
	    
	    @GetMapping("/view")
	    public String check()
	    {
	    	return "Hello";
	    }
	
	
}
