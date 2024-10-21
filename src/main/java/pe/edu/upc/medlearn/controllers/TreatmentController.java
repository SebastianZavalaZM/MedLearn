package pe.edu.upc.medlearn.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.medlearn.dtos.AverageDurationByTreatmentTypeDTO;
import pe.edu.upc.medlearn.dtos.QuantitysUserxTreatmentsDTO;
import pe.edu.upc.medlearn.dtos.TopTreatmentsDTO;
import pe.edu.upc.medlearn.dtos.TreatmentDTO;
import pe.edu.upc.medlearn.entities.Treatment;
import pe.edu.upc.medlearn.servicesinterfaces.ITreatmentService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Tratamientos")
public class TreatmentController {

    @Autowired
    private ITreatmentService tS;

    @GetMapping("/listado")
    public List<TreatmentDTO> listar() {
        return tS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TreatmentDTO.class);
        }).collect(Collectors.toList());
    }

    //@PreAuthorize("hasAnyRole('ADMIN','DOCTOR')")
    @PostMapping("/registrar")
    public void insertar(@RequestBody TreatmentDTO dto) {
        ModelMapper m = new ModelMapper();
        Treatment tr = m.map(dto, Treatment.class);
        tS.insert(tr);
    }

    //@PreAuthorize("hasAnyRole('ADMIN','DOCTOR')")
    @PutMapping("/actualizar")
    public void actualizar( @RequestBody TreatmentDTO dto) {
        ModelMapper m = new ModelMapper();
        Treatment tr = m.map(dto, Treatment.class);
        tS.update(tr);
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public void eliminar(@PathVariable("id") int id) {
        tS.delete(id);
    }

    @GetMapping("/{id}")
    public TreatmentDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        Treatment tr = tS.listId(id);
        return m.map(tr, TreatmentDTO.class);
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/cantidades")
    public List<QuantitysUserxTreatmentsDTO> obtenerCantidadUsuariosPorTratamiento() {
        List<String[]> lista = tS.cantidadUsuariosPorTratamiento();
        List<QuantitysUserxTreatmentsDTO> listaDTO = new ArrayList<>();
        for (String[] columna : lista) {
            QuantitysUserxTreatmentsDTO dto = new QuantitysUserxTreatmentsDTO();
            dto.setTreatmentDescription(columna[0]);
            dto.setUserCount(Integer.parseInt(columna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

    @GetMapping("/topTratamientos")
    public List<TopTreatmentsDTO> obtenerTopTratamientos() {
        List<String[]> lista = tS.topTratamientos();
        List<TopTreatmentsDTO> listaDTO = new ArrayList<>();

        for (String[] columna : lista) {
            TopTreatmentsDTO dto = new TopTreatmentsDTO();
            dto.setTreatmentName(columna[0]);
            dto.setUsersCount(Integer.parseInt(columna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

    //@PreAuthorize("hasAnyRole('ADMIN','DOCTOR')")
    @GetMapping("/promedioDuracion")
    public List<AverageDurationByTreatmentTypeDTO> obtenerPromedioDuracion() {
        List<String[]> lista = tS.obtenerPromedioDuracion();
        List<AverageDurationByTreatmentTypeDTO> listaDTO = new ArrayList<>();
        for (String[] columna : lista) {
            AverageDurationByTreatmentTypeDTO dto = new AverageDurationByTreatmentTypeDTO();
            dto.setTreatmentDescription(columna[0]);
            dto.setAverageDuration(Double.parseDouble(columna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

    @GetMapping("/tratamientoslistaporenfermedad/{id}")
    public List<TreatmentDTO> listarPorEnfermedead(@PathVariable("id") Integer id) {
        return tS.listByIllness(id).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TreatmentDTO.class);
        }).collect(Collectors.toList());
    }
}
