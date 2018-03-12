package com.mentor.spring.dao;

import java.util.List;

import com.mentor.spring.model.User;

public interface UserDao {
   void save(User user);
   List<User> list();
}
