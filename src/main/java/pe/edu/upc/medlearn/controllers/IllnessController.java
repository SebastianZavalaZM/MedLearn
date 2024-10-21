package pe.edu.upc.medlearn.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.medlearn.dtos.FindIlilnessSymptomsDTO;
import pe.edu.upc.medlearn.dtos.IllnessDTO;
import pe.edu.upc.medlearn.entities.Illness;
import pe.edu.upc.medlearn.servicesinterfaces.IIllnessService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Enfermedades")
public class IllnessController {
    @Autowired
    private IIllnessService iS;

    @GetMapping
    public List<IllnessDTO> list(){
        return iS.list().stream().map(y-> {
            ModelMapper m = new ModelMapper();
            return m.map(y,IllnessDTO.class);
        }).collect(Collectors.toList());
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/insertar")
    public void insertar(@RequestBody IllnessDTO dto) {
        ModelMapper m = new ModelMapper();
        Illness illness = m.map(dto, Illness.class);
        iS.insert(illness);
    }

    @GetMapping("/{id}")
    public IllnessDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        IllnessDTO dto = m.map(iS.listId(id), IllnessDTO.class);
        return dto;
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        iS.delete(id);
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping
    public void editar(@RequestBody IllnessDTO illnessDTO){
        ModelMapper m=new ModelMapper();
        Illness illness=m.map(illnessDTO,Illness.class);
        iS.insert(illness);
    }
    @GetMapping("/findIllnessSymptoms")
    public List<FindIlilnessSymptomsDTO> findIllnessSymptoms(@RequestParam Integer idIllness){
        List<String[]> filaLista=iS.findIllnessSymptoms(idIllness);
        List<FindIlilnessSymptomsDTO> dtoLista=new ArrayList<>();
        for (String[] columna:filaLista) {
            FindIlilnessSymptomsDTO dtos=new FindIlilnessSymptomsDTO();
            dtos.setNameSymptom((columna[0]));
            dtoLista.add(dtos);
        }
        return dtoLista;
    }

    @GetMapping("/busqueda")
    public List<IllnessDTO>buscar(@RequestParam String nombre){
        return iS.buscarNombre(nombre).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, IllnessDTO.class);
        }).collect(Collectors.toList());

    }

}
