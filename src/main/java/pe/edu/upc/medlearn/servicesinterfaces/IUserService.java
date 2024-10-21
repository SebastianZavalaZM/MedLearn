package pe.edu.upc.medlearn.servicesinterfaces;

import pe.edu.upc.medlearn.entities.Users;

import java.util.List;

public interface IUserService {
    public List<Users> list();
    public void insert(Users user);
    public Users listId(int id);
    public List<Users> search(String name);
    public List<String[]> cantidadUsuariosPorRol();

}
