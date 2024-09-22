package pe.edu.upc.medlearn.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.medlearn.dtos.AverageDurationByTreatmentTypeDTO;
import pe.edu.upc.medlearn.dtos.QuantitysUserxTreatmentsDTO;
import pe.edu.upc.medlearn.dtos.TopTreatmentsDTO;
import pe.edu.upc.medlearn.dtos.TreatmentsDTO;
import pe.edu.upc.medlearn.entities.Treatment;
import pe.edu.upc.medlearn.servicesinterfaces.ITreatmentsService;

import java.util.ArrayList;
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
        Treatment tr = m.map(dto, Treatment.class);
        tS.insert(tr);
    }

    @PutMapping("/actualizar")
    public void actualizar(@PathVariable("id") int id, @RequestBody TreatmentsDTO dto) {
        ModelMapper m = new ModelMapper();
        Treatment tr = m.map(dto, Treatment.class);
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
        Treatment tr = tS.listId(id);
        return m.map(tr, TreatmentsDTO.class);
    }
    @GetMapping("/cantidades")
    public List<QuantitysUserxTreatmentsDTO> obtenerCantidadUsuariosPorTratamiento() {
        List<String[]> lista = tS.cantidadUsuariosPorTratamiento();
        List<QuantitysUserxTreatmentsDTO> listaDTO = new ArrayList<>();

        for (Object[] columna : lista) {
            QuantitysUserxTreatmentsDTO dto = new QuantitysUserxTreatmentsDTO();
            dto.setTreatmentDescription((String) columna[0]);
            if (columna[1] instanceof Long) {
                dto.setUserCount(((Long) columna[1]).intValue());
            }
            else if (columna[1] instanceof String) {
                dto.setUserCount(Integer.parseInt((String) columna[1]));
            }
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


            int usersCount = Integer.parseInt(columna[1]);
            dto.setUsersCount(usersCount);
            listaDTO.add(dto);
        }
        return listaDTO;
    }
    @GetMapping("/promedioDuracion")
    public List<AverageDurationByTreatmentTypeDTO> obtenerPromedioDuracion() {
        List<String[]> lista = tS.obtenerPromedioDuracion();
        List<AverageDurationByTreatmentTypeDTO> listaDTO = new ArrayList<>();
        for (String[] columna : lista) {
            AverageDurationByTreatmentTypeDTO dto = new AverageDurationByTreatmentTypeDTO();
            dto.setTreatmentDescription((String) columna[0]);
            dto.setAverageDuration(Double.parseDouble((String) columna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
