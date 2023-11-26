
//For loose coupling we craete UserServiceIMPL
package com.example.mySpringProject.service;
import java.util.List;


import com.example.mySpringProject.model.SignUp;
//import com.example.mySpringProject.model.login;

public interface UserService {
   
    public SignUp addUser(SignUp obj3);
    List <SignUp> getAllStud();
     void deleteUserById(int userId);
    public SignUp selectUserById(int id);
     public SignUp getUserByUsername(String username);
     //public SignUp forgotUerPassword(String email);

   
  
    


}

