package pe.edu.upc.medlearn.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.medlearn.dtos.IllnessDTO;
import pe.edu.upc.medlearn.entities.Illness;
import pe.edu.upc.medlearn.servicesinterfaces.IIllnessService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Enfermedades")
public class IllnessController {
    @Autowired
    private IIllnessService iS;

    @GetMapping("/listar")
    public List<IllnessDTO> list(){
        return iS.list().stream().map(y-> {
            ModelMapper m = new ModelMapper();
            return m.map(y,IllnessDTO.class);
        }).collect(Collectors.toList());
    }


    @PutMapping
    public void modificar(@RequestBody IllnessDTO dto) {
        ModelMapper m = new ModelMapper();
        Illness ci=m.map(dto,Illness.class);
//        cS.update(ci);

    }

    @DeleteMapping("/{id}")

    public void elminar(@PathVariable("id") Integer id){
//        cS.delete(id);
    }
}
