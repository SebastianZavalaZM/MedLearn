package pe.edu.upc.medlearn.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.medlearn.dtos.HospitalDTO;
import pe.edu.upc.medlearn.entities.Hospital;
import pe.edu.upc.medlearn.servicesinterfaces.IHospitalService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Hospitales")
public class HospitalController {
    @Autowired
    private IHospitalService hS;

    //HUB04:Listar hospitales
    @GetMapping
    public List<HospitalDTO>listar(){
        return hS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,HospitalDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody HospitalDTO dto){
        ModelMapper m = new ModelMapper();
        Hospital ho=m.map(dto,Hospital.class);
        hS.insert(ho);
    }
    @GetMapping("/{id}")
    public HospitalDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        HospitalDTO dto=m.map(hS.listId(id), HospitalDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody HospitalDTO dto){
        ModelMapper m=new ModelMapper();
        Hospital ho=m.map(dto,Hospital.class);
        hS.update(ho);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        hS.delete(id);
    }
    @GetMapping("/busquedas")
    public List<HospitalDTO>buscar(@RequestParam String nombre){
        return hS.buscarporNombre(nombre).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,HospitalDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/listaordenada")
    public List<HospitalDTO>ordenadoporVistas(){
        return hS.ordenarPorVistas().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,HospitalDTO.class);
        }).collect(Collectors.toList());
    }
}
