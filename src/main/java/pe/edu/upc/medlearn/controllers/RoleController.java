package pe.edu.upc.medlearn.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.medlearn.dtos.RoleDTO;
import pe.edu.upc.medlearn.entities.Role;
import pe.edu.upc.medlearn.servicesinterfaces.IRoleService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Roles")
public class RoleController {

    @Autowired
    private IRoleService rS;
    @PostMapping
    public  void registrar(@RequestBody RoleDTO dto){
        ModelMapper m = new ModelMapper();
        Role r = m.map(dto, Role.class);
        rS.insert(r);
    }
    @PutMapping
    public void modificar(@RequestBody RoleDTO dto){
        ModelMapper m = new ModelMapper();
        Role r = m.map(dto, Role.class);
        rS.insert(r);
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id") Long id){
        rS.delete(id);
    }

    @GetMapping("/listarporid/{id}")
    public RoleDTO listarId(@PathVariable("id") Long id){
        ModelMapper m = new ModelMapper();
        RoleDTO dto = m.map(rS.listarId(id), RoleDTO.class);
        return dto;
    }
    @GetMapping
    public List<RoleDTO> listar(){
        return rS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,RoleDTO.class);
        }).collect(Collectors.toList());
    }

}
