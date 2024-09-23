package pe.edu.upc.medlearn.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.medlearn.entities.Users;
import pe.edu.upc.medlearn.repositories.IUserRepository;
import pe.edu.upc.medlearn.servicesinterfaces.IUserService;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {
    @Autowired
    private IUserRepository uR;

    @Override
    public List<Users> list() {
        return uR.findAll();
    }
    @Override
    public void insert(Users user) {
        uR.save(user);
    }

    @Override
    public Users listId(int id) {
        return uR.findById(id).orElse(new Users());
    }

    @Override
    public List<Users> search(String name) {
        return uR.findAll();
    }

    @Override
    public List<String[]> cantidadUsuariosPorRol() {
        return uR.cantidadUsuariosPorRol();
    }

}
