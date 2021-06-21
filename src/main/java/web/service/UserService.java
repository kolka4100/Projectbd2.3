package web.service;

import web.controller.User;

import java.util.List;

public interface UserService {
    List<User> allUser();
    void save(User user);
    void delete(User user);
    User getById(Long id);
}
