package pe.edu.upc.medlearn.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.medlearn.dtos.SympthomsDTO;
import pe.edu.upc.medlearn.entities.Symptom;
import pe.edu.upc.medlearn.servicesinterfaces.ISymptomService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Sintomas")
public class SymptomController {

    @Autowired
    private ISymptomService iS;

    @GetMapping("/listar")
    public List<SympthomsDTO>listar(){
        return iS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,SympthomsDTO.class);
        }).collect(Collectors.toList());
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/insertar")
    public void insertar(@RequestBody SympthomsDTO dto) {
        ModelMapper m = new ModelMapper();
        Symptom si = m.map(dto, Symptom.class);

        iS.insert(si);
    }


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        iS.delete(id);
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping
    public void modificar(@RequestBody SympthomsDTO dto) {
        ModelMapper m = new ModelMapper();
        Symptom ci=m.map(dto, Symptom.class);
        iS.update(ci);

    }




}
