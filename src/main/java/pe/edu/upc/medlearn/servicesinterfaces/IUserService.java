package pe.edu.upc.medlearn.servicesinterfaces;

import pe.edu.upc.medlearn.entities.User;

import java.util.List;

public interface IUserService {
    public List<User> list();

    public void insert(User user);

    public User listId(int id);

}
