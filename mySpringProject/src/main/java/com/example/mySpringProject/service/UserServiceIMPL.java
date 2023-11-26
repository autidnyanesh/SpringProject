
//This is part of a Spring Boot application and is focused on creating and implementing a service class(interface)
 // service class which handles the business logic for student and instructor registrations:
package com.example.mySpringProject.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mySpringProject.model.SignUp;
import com.example.mySpringProject.repository.SignUpRepo;

@Service  /*This annotation is used to mark the class as a Spring service. 
          service is a Java class that contains business logic, which is responsible for performing 
          specific operations or services authorization and validation*/
public class UserServiceIMPL implements UserService {

    @Autowired   //IOC will create reference for you(instantiate our object)
    SignUpRepo repository;  //Create object for repository

    //Inserting all data into the database
    @Override
    public SignUp addUser(SignUp users) {  //for post
        SignUp u= repository.save(users);
        return u; 
    }

    @Override
    public List<SignUp>getAllStud(){
        return repository.findAll();
    }

    @Override
    public void deleteUserById(int userId) {
       repository.deleteById(userId);
       System.out.println("User ID"+ userId+ "has been deleted");
    }
  
    @Override
    public SignUp selectUserById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public SignUp getUserByUsername(String username) {
        return repository.findByUsername(username);
    }

    // @Override
    // public SignUp forgotUerPassword(String email) {
        
    // }

   
}
   