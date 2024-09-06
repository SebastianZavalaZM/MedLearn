package pe.edu.upc.medlearn.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.medlearn.dtos.QuantityUsersByRolDTO;
import pe.edu.upc.medlearn.dtos.UserDTO;
import pe.edu.upc.medlearn.entities.Users;
import pe.edu.upc.medlearn.servicesinterfaces.IUserService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController("/Usuario")
public class UserController {
    @Autowired
    private IUserService uS;

    @GetMapping
    public List<UserDTO>listar(){
        return uS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UserDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insert(@RequestBody UserDTO dto) {
        ModelMapper m = new ModelMapper();
        Users user = m.map(dto, Users.class);
        uS.insert(user);
    }
    @GetMapping("/{id}")
    public UserDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        UserDTO dto = m.map(uS.listId(id), UserDTO.class);
        return dto;
    }
    @GetMapping("/buscarpornombre")
    public List<UserDTO>buscar(String name){
        return uS.search(name).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UserDTO.class);
        }).collect(Collectors.toList());
    }

    //@GetMapping("controldeusuarios")
    public List<QuantityUsersByRolDTO> usuariosPorRol(){
        List<String[]> filaLista = uS.cantidadUsuariosPorRol();
        List<QuantityUsersByRolDTO> dtoLista = new ArrayList<>();
        for (String[] columna : filaLista) {
            QuantityUsersByRolDTO dto = new QuantityUsersByRolDTO();
            dto.setRol(columna[0]);
            dto.setUsuarios(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

}

