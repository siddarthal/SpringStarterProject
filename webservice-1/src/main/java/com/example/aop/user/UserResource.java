package com.example.aop.user;

import java.net.URI;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

@RestController
public class UserResource {
	@Autowired
	private UserDaoService service;
	@Autowired
	private MessageSource msgSource;
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return service.findAll();
	}
	@GetMapping("/users/{id}")
	public User getOneUser(@PathVariable int id){
		User user=service.findById(id);
		if(user==null) {
			throw new UserNotFoundException("id:"+id);
		}
		return service.findById(id);
	} 
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
		 User saved=service.save(user);
		 URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saved.getId()).toUri();
		return  ResponseEntity.created(location).build();
	}
	@DeleteMapping("/users/{id}")
	public void deleteUsers(@PathVariable int id){
		service.deleteById(id);
	
	} 
	
	@GetMapping(path = "hello-world")
	public String HelloWorld1() {
		Locale locale =LocaleContextHolder.getLocale() ;
		return msgSource.getMessage("good.morning.message", null, "Default Message", locale);
//		return "hello world";
	}
}

//- Example: `en` - English (Good Morning)
//- Example: `nl` - Dutch (Goedemorgen)
//- Example: `fr` - French (Bonjour)
//- Example: `de` - Deutsch (Guten Morgen)
