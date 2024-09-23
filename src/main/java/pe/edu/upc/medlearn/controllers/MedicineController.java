package pe.edu.upc.medlearn.controllers;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.medlearn.dtos.MedicineDTO;
import pe.edu.upc.medlearn.entities.Medicine;
import pe.edu.upc.medlearn.repositories.ITreatmentsRepository;
import pe.edu.upc.medlearn.servicesinterfaces.IMedicineService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Medicinas")
@SecurityRequirement(name = "javainuseapi")
public class MedicineController {

    @Autowired
    private IMedicineService mS;
    @Autowired
    private ITreatmentsRepository treatmentsRepository;

    @GetMapping
    public List<MedicineDTO> listar() {
        return mS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MedicineDTO.class);
        }).collect(Collectors.toList());
    }

    @PreAuthorize("hasAnyRole('DOCTOR','ADMIN')")
    @PostMapping
    public void insertar(@RequestBody MedicineDTO dto) {
        ModelMapper m = new ModelMapper();
        Medicine med = m.map(dto, Medicine.class);
        mS.insert(med);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/actualizar")
    public void actualizar( @RequestBody MedicineDTO dto) {
        ModelMapper m = new ModelMapper();
        Medicine med = m.map(dto, Medicine.class);
        mS.update(med);
    }

    @PreAuthorize("hasRole('ADMIN')")
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
