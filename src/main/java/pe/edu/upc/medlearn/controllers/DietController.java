package pe.edu.upc.medlearn.controllers;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.medlearn.dtos.DietDTO;
import pe.edu.upc.medlearn.dtos.QuantityBydietsinicidasydietsfinalizadasbyuser;
import pe.edu.upc.medlearn.dtos.TotaldecaloriesbydietDTO;
import pe.edu.upc.medlearn.entities.Diet;
import pe.edu.upc.medlearn.servicesinterfaces.IDietService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Dietas")
@PreAuthorize("hasRole('ADMIN')")
@SecurityRequirement(name = "javainuseapi")
public class DietController {
    @Autowired
    private IDietService dS;

    @PreAuthorize("hasAnyRole('USER','NUTRICIONISTA')")
    @GetMapping
    public List<DietDTO>listar(){
        return dS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return  m.map(x, DietDTO.class);
        }).collect(Collectors.toList());
    }

    @PreAuthorize("hasRole('NUTRICIONISTA')")
    @PostMapping
    public void insertar(@RequestBody DietDTO dto){
        ModelMapper m=new ModelMapper();
        Diet ci=m.map(dto, Diet.class);
        dS.insert(ci);
    }

    @PreAuthorize("hasAnyRole('USER','NUTRICIONISTA')")
    @GetMapping("/{id}")
    public DietDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        DietDTO dto=m.map(dS.listId(id), DietDTO.class);
        return dto;
    }

    @PreAuthorize("hasRole('NUTRICIONISTA')")
    @PutMapping
    public void modificar(@RequestBody DietDTO dto){
        ModelMapper m=new ModelMapper();
        Diet ci=m.map(dto, Diet.class);
        dS.update(ci);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        dS.delete(id);
    }

    @PreAuthorize("hasAnyRole('USER','NUTRICIONISTA')")
    @GetMapping("/buscarcalificacion")
    public List<DietDTO> buscarCalificacion(@RequestParam int qualification) {
        return dS.findByQualification(qualification).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DietDTO.class);
        }).collect(Collectors.toList());
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/buscardescripcion")
    public List<DietDTO> buscarDescripcion(@RequestParam String description) {
        return dS.findByDescription(description).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DietDTO.class);
        }).collect(Collectors.toList());
    }

    @PreAuthorize("hasAnyRole('USER','NUTRICIONISTA')")
    @GetMapping("/listarporenfermedad")
    public List<DietDTO>listarPorEnfermedad(@PathVariable("id") Integer id){
        return dS.listByIllness(id).stream().map(x->{
            ModelMapper m= new ModelMapper();
            return  m.map(x, DietDTO.class);
        }).collect(Collectors.toList());
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/cantidaddedietasiniciadasandfinalizadasporusuario")
    public List<QuantityBydietsinicidasydietsfinalizadasbyuser> cantidaddedietasiniciadasandfinalizadasporusuario(){
        List<String[]> filaLista=dS.quantityBydietsinicidasandfinalizadasporusuario();
        List<QuantityBydietsinicidasydietsfinalizadasbyuser> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            QuantityBydietsinicidasydietsfinalizadasbyuser dtos=new QuantityBydietsinicidasydietsfinalizadasbyuser();
            dtos.setUsername(columna[0]);
            dtos.setCantidadDeDietasIniciadas(Integer.parseInt(columna[1]));
            dtos.setCantidadDietasFinalizadas(Integer.parseInt(columna[2]));
            dtoLista.add(dtos);
        }
        return dtoLista;
    }
}
