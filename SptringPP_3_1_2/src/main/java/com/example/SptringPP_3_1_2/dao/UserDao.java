package com.example.SptringPP_3_1_2.dao;

import com.example.SptringPP_3_1_2.model.User;

import java.util.List;

public interface UserDao {
    void create(User user);
    List<User> getListUsers();
    void delete(int id);
    void update(int id, User user);
    User getUser(int id);
    void save(User person);
}
