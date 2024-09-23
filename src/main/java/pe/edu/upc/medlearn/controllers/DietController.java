package pe.edu.upc.medlearn.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.medlearn.dtos.DietDTO;
import pe.edu.upc.medlearn.entities.Diet;
import pe.edu.upc.medlearn.servicesinterfaces.IDietService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Diets")
public class DietController {
    @Autowired
    private IDietService dS;

    @GetMapping
    public List<DietDTO>list(){
        return dS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return  m.map(x, DietDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody DietDTO dto){
        ModelMapper m=new ModelMapper();
        Diet ci=m.map(dto, Diet.class);
        dS.insert(ci);
    }

    @PutMapping("/{id}")
    public DietDTO listId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        DietDTO dto=m.map(dS.listId(id), DietDTO.class);
        return dto;
    }

    @PutMapping
    public void modify(@RequestBody DietDTO dto){
        ModelMapper m=new ModelMapper();
        Diet ci=m.map(dto, Diet.class);
        dS.update(ci);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        dS.delete(id);
    }

    @GetMapping("/buscarcalificacion")
    public List<DietDTO> findByQualification(@RequestParam int qualification) {
        return dS.findByQualification(qualification).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DietDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/buscardescripcion")
    public List<DietDTO> findByDescription(@RequestParam String description) {
        return dS.findByDescription(description).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DietDTO.class);
        }).collect(Collectors.toList());
    }


}
