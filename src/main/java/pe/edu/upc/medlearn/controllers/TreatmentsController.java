package pe.edu.upc.medlearn.controllers;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.medlearn.dtos.TreatmentsDTO;
import pe.edu.upc.medlearn.entities.Treatment;
import pe.edu.upc.medlearn.servicesinterfaces.ITreatmentsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tratamientos")
@SecurityRequirement(name = "javainuseapi")
public class TreatmentsController {

    @Autowired
    private ITreatmentsService tS;

    @GetMapping("/listado")
    public List<TreatmentsDTO> listar() {
        return tS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TreatmentsDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/registrar")
    public void insertar(@RequestBody TreatmentsDTO dto) {
        ModelMapper m = new ModelMapper();
        Treatment tr = m.map(dto, Treatment.class);
        tS.insert(tr);
    }

    @PutMapping("/actualizar")
    public void actualizar( @RequestBody TreatmentsDTO dto) {
        ModelMapper m = new ModelMapper();
        Treatment tr = m.map(dto, Treatment.class);
        tS.update(tr);
    }

    @DeleteMapping("/delete/{id}")
    public void eliminar(@PathVariable("id") int id) {
        tS.delete(id);
    }

    @GetMapping("/{id}")
    public TreatmentsDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        Treatment tr = tS.listId(id);
        return m.map(tr, TreatmentsDTO.class);
    }
}
