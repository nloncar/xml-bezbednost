package com.example.XML_BSEP.controller;

import com.example.XML_BSEP.model.*;
import com.example.XML_BSEP.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;


@RestController
public class UserController {

    @Autowired 
    private UserService userService;
   // @Autowired
    //private MailSlanje mailSlanje;
     
    @RequestMapping(value = "/login", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<User> login(@RequestBody TempUser tempUser){
        if (tempUser.getEmail() != null && tempUser.getPassword() != null) {
        	
            User user = userService.findByEmail(tempUser.getEmail());
            
           
            if(user != null) {
                if (user.getPassword().equals(tempUser.getPassword())) {
                    if (user instanceof User) {
                    	//dodati kad se uradi verifikacija mejla
                        //if (((User) user).isActive())
                    	System.out.println("Uspesno ulogovan korsnik "+user.getName());
                    	
                            return new ResponseEntity<User>(user, HttpStatus.OK); 
                            
                        //else
                       //     return new ResponseEntity<>(HttpStatus.FORBIDDEN);
                    } else
                        return new ResponseEntity<User>(user, HttpStatus.OK);
                } else {
                    return new ResponseEntity<>(HttpStatus.FORBIDDEN);
                }
            }else
                return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
        else
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }

    @RequestMapping(
            value = "/registerUser",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> registerUser(@RequestBody User usr) throws Exception {
    		System.out.println("PROSAO"); 
    		System.out.println(usr.getName());
    		System.out.println(usr.getSurname());
    		System.out.println(usr.getJmbg());
    		System.out.println(usr.getJmbg().length()); 
    		System.out.println(usr.getPassword());
    		System.out.println(usr.getTelefon());
    		System.out.println(usr.getAdresa());
    		System.out.println(usr.getEmail());
    	if (usr.getName() != null && usr.getSurname() != null && usr.getJmbg() != null && usr.getTelefon() != null && usr.getAdresa() != null && usr.getEmail() != null && usr.getPassword() != null) {
    		User tu=userService.findByEmail(usr.getEmail());
    		if(tu!=null) {
    			
    			return new ResponseEntity<User>(usr, HttpStatus.FORBIDDEN);
    		}
    		
        	User savedGuest = userService.save(usr);
        	
            //mailSlanje.sendMail(usr); 
        	System.out.println(usr.getName());  
        	System.out.println("Uspesno poslat mejl");
            return new ResponseEntity<User>(savedGuest, HttpStatus.CREATED);
        }
        else {
        	
            return new ResponseEntity<User>(usr, HttpStatus.FORBIDDEN);
        }
    }
    
 
    @RequestMapping(value = "/logout",
			method = RequestMethod.GET,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean logout(HttpServletRequest request) {
			request.getSession().invalidate();
			return true;
	}


}
