
//JPArepository -->subclass of CRUD repository so we are using it all things are gere in jpa 
package com.example.mySpringProject.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mySpringProject.model.SignUp;

    public interface SignUpRepo extends JpaRepository<SignUp, Integer> {

       public SignUp findByUsername(String username);
        
        
    }
    

