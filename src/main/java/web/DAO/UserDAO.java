package web.DAO;

import web.controller.User;

import java.util.List;

public interface UserDAO {
    List<User> userlist();
    void save(User user);
    void delete(User user);
    User getById(Long id);
}
