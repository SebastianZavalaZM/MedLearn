package pe.edu.upc.medlearn.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.medlearn.dtos.MedicineDTO;
import pe.edu.upc.medlearn.entities.Medicine;
import pe.edu.upc.medlearn.servicesinterfaces.IMedicineService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/medicines")
public class MedicineController {

    @Autowired
    private IMedicineService mS;

    @GetMapping
    public List<MedicineDTO> listar() {
        return mS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MedicineDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody MedicineDTO dto) {
        ModelMapper m = new ModelMapper();
        Medicine med = m.map(dto, Medicine.class);
        mS.insert(med);
    }

    @PutMapping("/actualizar/{id}")
    public void actualizar(@PathVariable("id") int id, @RequestBody MedicineDTO dto) {
        ModelMapper m = new ModelMapper();
        Medicine med = m.map(dto, Medicine.class);
        med.setSupleId(id);
        mS.update(med);
    }

    @DeleteMapping("/delete/{id}")
    public void eliminar(@PathVariable("id") int id) {
        mS.delete(id);
    }

    @GetMapping("/{id}")
    public MedicineDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        Medicine med = mS.listId(id);
        return m.map(med, MedicineDTO.class);
    }
}
