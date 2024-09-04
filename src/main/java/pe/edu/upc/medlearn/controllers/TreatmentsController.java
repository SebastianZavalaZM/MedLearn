package pe.edu.upc.medlearn.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.medlearn.dtos.TreatmentsDTO;
import pe.edu.upc.medlearn.entities.Treatments;
import pe.edu.upc.medlearn.servicesinterfaces.ITreatmentsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/treatments")
public class TreatmentsController {

    @Autowired
    private ITreatmentsService tS;

    @GetMapping
    public List<TreatmentsDTO> listar() {
        return tS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TreatmentsDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody TreatmentsDTO dto) {
        ModelMapper m = new ModelMapper();
        Treatments tr = m.map(dto, Treatments.class);
        tS.insert(tr);
    }

    @PutMapping("/actualizar")
    public void actualizar(@PathVariable("id") int id, @RequestBody TreatmentsDTO dto) {
        ModelMapper m = new ModelMapper();
        Treatments tr = m.map(dto, Treatments.class);
        tr.setTreatmentsId(id);
        tS.update(tr);
    }

    @DeleteMapping("/delete")
    public void eliminar(@PathVariable("id") int id) {
        tS.delete(id);
    }

    @GetMapping("/{id}")
    public TreatmentsDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        Treatments tr = tS.listId(id);
        return m.map(tr, TreatmentsDTO.class);
    }
}
