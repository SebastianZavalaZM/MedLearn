package pe.edu.upc.medlearn.controllers;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.medlearn.dtos.QuantityDTO;
import pe.edu.upc.medlearn.entities.Quantity;
import pe.edu.upc.medlearn.servicesinterfaces.IQuantityService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/quantity")
@SecurityRequirement(name = "javainuseapi")
public class QuantitysController {
    @Autowired
    private IQuantityService quantityService;
    @GetMapping
    public List<QuantityDTO> listar(){

        return quantityService.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return  m.map(x,QuantityDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody QuantityDTO dto){
        ModelMapper m=new ModelMapper();
        Quantity quantity=m.map(dto,Quantity.class);
        quantityService.insert(quantity);
    }
    @PutMapping
    public void modificar(@RequestBody QuantityDTO dto){
        ModelMapper m=new ModelMapper();
        Quantity quantity=m.map(dto,Quantity.class);
        quantityService.update(quantity);
    }
}
