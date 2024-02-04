package com.demosecurity.service;

import com.demosecurity.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> list= new ArrayList<>();
    // insert data
    public UserService(){
        list.add(new User("xyz","para1234","paramvir@"));
        list.add(new User("xy","para123","paramvir@1"));
        list.add(new User("x","para12","paramvir@2"));
    }
    // get all users
    public List<User> getall(){
        return this.list;
    }
    // get by id
    public User getsingleuser(String username){
        return this.list.stream().filter((user)-> user.getUsername().equals(username)).findAny().orElse(null);
    }

    public User addnewuser(User user){
        this.list.add(user);
        return user;
    }
}
