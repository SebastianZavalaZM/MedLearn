package pe.edu.upc.medlearn.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.medlearn.dtos.UserDTO;
import pe.edu.upc.medlearn.servicesinterfaces.IUserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController("/Usuario")
public class UserController {
    @Autowired
    private IUserService uS;
    @GetMapping("/listaUsuarios")
    public List<UserDTO>listar(){
        return uS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UserDTO.class);
        }).collect(Collectors.toList());
    }
}
