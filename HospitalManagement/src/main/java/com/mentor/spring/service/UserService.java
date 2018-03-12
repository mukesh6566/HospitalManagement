package com.mentor.spring.service;

import java.util.List;

import com.mentor.spring.model.User;

public interface UserService {
   void save(User user);

   List<User> list();
}
