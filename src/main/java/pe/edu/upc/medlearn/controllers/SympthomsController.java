package pe.edu.upc.medlearn.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.medlearn.dtos.SympthomsDTO;
import pe.edu.upc.medlearn.entities.Sympthoms;
import pe.edu.upc.medlearn.servicesinterfaces.ISympthomsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Sintomas")
public class SympthomsController {

    @Autowired
    private ISympthomsService iS;

    @GetMapping("/listar")
    public List<SympthomsDTO>listar(){
        return iS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,SympthomsDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertar")
    public void insertar(@RequestBody SympthomsDTO dto) {
        ModelMapper m = new ModelMapper();
        Sympthoms si = m.map(dto, Sympthoms.class);

        iS.insert(si);
    }


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        iS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody SympthomsDTO dto) {
        ModelMapper m = new ModelMapper();
        Sympthoms ci=m.map(dto,Sympthoms.class);
        iS.update(ci);

    }




}
