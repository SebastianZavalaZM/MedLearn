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
    public List<User> search(String name) {
        return uR.findAll();
    }


}
