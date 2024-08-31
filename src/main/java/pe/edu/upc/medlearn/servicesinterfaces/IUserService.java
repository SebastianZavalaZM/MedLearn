package pe.edu.upc.medlearn.servicesinterfaces;

import pe.edu.upc.medlearn.entities.Users;

import java.util.List;

public interface IUserService {
    public List<Users> list();

    List<Users> search(String name);

}
