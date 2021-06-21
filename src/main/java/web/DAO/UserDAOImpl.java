package web.DAO;

import org.springframework.stereotype.Component;
import web.controller.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class UserDAOImpl implements UserDAO {
    public UserDAOImpl() {}

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> userlist() {
        List<User> all = entityManager.createQuery("SELECT * FROM User", User.class).getResultList();
        return all;
    }

    @Transactional
    @Override
    public void save(User user) {
        User save = entityManager.merge(user);
        entityManager.persist(save);
    }

    @Transactional
    @Override
    public void delete(User user) {
        User delete = entityManager.merge(user);
        entityManager.remove(delete);
    }

    @Override
    public User getById(Long id) {
        return entityManager.find(User.class, id);
    }
}
