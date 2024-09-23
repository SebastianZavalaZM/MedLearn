package pe.edu.upc.medlearn.controllers;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.medlearn.dtos.QuantityUsersByRolDTO;
import pe.edu.upc.medlearn.dtos.UserDTO;
import pe.edu.upc.medlearn.dtos.UserListDTO;
import pe.edu.upc.medlearn.entities.Users;
import pe.edu.upc.medlearn.servicesinterfaces.IUserService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController("/Usuarios")
@PreAuthorize("hasAuthority('ADMIN')")
@SecurityRequirement(name = "javainuseapi")
public class UserController {
    @Autowired
    private IUserService uS;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/listado")
    public List<UserListDTO> listar() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UserListDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/crear")
    public void insert(@RequestBody UserDTO dto) {
        ModelMapper m = new ModelMapper();
        Users user = m.map(dto, Users.class);
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        uS.insert(user);
    }
    @GetMapping("/{id}")
    public UserListDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        UserListDTO dto = m.map(uS.listId(id), UserListDTO.class);
        return dto;
    }
    @GetMapping("/buscarpornombre")
    public List<UserListDTO>buscar(@RequestParam String name){
        return uS.search(name).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UserListDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/controldeusuarios")
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

