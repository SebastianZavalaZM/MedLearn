package pe.edu.upc.medlearn.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.medlearn.dtos.DietsDTO;
import pe.edu.upc.medlearn.entities.Diets;
import pe.edu.upc.medlearn.servicesinterfaces.IDietsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Diets")
public class DietsController {
    @Autowired
    private IDietsService dS;

    @GetMapping
    public List<DietsDTO>list(){
        return dS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return  m.map(x,DietsDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody DietsDTO dto){
        ModelMapper m=new ModelMapper();
        Diets ci=m.map(dto,Diets.class);
        dS.insert(ci);
    }

    @PutMapping("/{id}")
    public DietsDTO listId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        DietsDTO dto=m.map(dS.listId(id),DietsDTO.class);
        return dto;
    }

    @PutMapping
    public void modify(@RequestBody DietsDTO dto){
        ModelMapper m=new ModelMapper();
        Diets ci=m.map(dto,Diets.class);
        dS.update(ci);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        dS.delete(id);
    }

    @GetMapping("/buscarcalificacion")
    public List<DietsDTO> findByQualification(@RequestParam int qualification) {
        return dS.findByQualification(qualification).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DietsDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/buscardescripcion")
    public List<DietsDTO> findByDescription(@RequestParam String description) {
        return dS.findByDescription(description).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DietsDTO.class);
        }).collect(Collectors.toList());
    }


}
