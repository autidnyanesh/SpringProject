
//this file is for craeting signup table
package com.example.mySpringProject.model;
//import jakarta.annotation.Generated;
//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sign_up")//name of table
public class SignUp {
    @Id 
    //@GeneratedValue   //it will autogenerate value for you
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id; // Use a Long or Integer for the ID field
    //private Long id;
    private String role;
    private String first_name;
    private String last_name;
    private String contact;
    private String email;
    private String gender;
    private String age;
    private String username;
    private String password;
// 
    public SignUp(){

    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    
    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SignUp [first_name=" + first_name + ", last_name=" + last_name + ", contact=" + contact
                + ", email=" + email + ", gender=" + gender + ", age=" + age + ", username=" + username + ", password="
                + password + "]";
    }

    
}

