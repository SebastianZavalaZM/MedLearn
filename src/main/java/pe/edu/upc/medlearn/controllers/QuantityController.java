package pe.edu.upc.medlearn.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.medlearn.dtos.QuantityDTO;
import pe.edu.upc.medlearn.entities.Quantity;
import pe.edu.upc.medlearn.servicesinterfaces.IQuantityService;

import java.util.List;
import java.util.stream.Collectors;

//@PreAuthorize("hasRole('ADMIN')")
@RestController
@RequestMapping("/Cantidades")
public class QuantityController {
    @Autowired
    private IQuantityService quantityService;
    @GetMapping
    public List<QuantityDTO> listar(){

        return quantityService.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return  m.map(x,QuantityDTO.class);
        }).collect(Collectors.toList());
    }

    //@PreAuthorize("hasRole('NUTRICIONISTA')")
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
