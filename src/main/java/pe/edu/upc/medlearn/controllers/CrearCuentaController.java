package pe.edu.upc.medlearn.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.medlearn.dtos.UserDTO;
import pe.edu.upc.medlearn.entities.Users;
import pe.edu.upc.medlearn.servicesinterfaces.IUserService;

@RestController
public class CrearCuentaController {
    @Autowired
    private IUserService uS;
    @PostMapping("/crearcuenta")
    public void insert(@RequestBody UserDTO dto) {
        ModelMapper m = new ModelMapper();
        Users user = m.map(dto, Users.class);
        uS.insert(user);
    }
}
