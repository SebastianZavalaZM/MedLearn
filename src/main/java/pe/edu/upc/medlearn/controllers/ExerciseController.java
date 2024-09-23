package pe.edu.upc.medlearn.controllers;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.medlearn.dtos.ExercisesDTO;
import pe.edu.upc.medlearn.dtos.TotaldeexercisesbyDietas;
import pe.edu.upc.medlearn.entities.Exercise;
import pe.edu.upc.medlearn.servicesinterfaces.IExerciseService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Ejercicios")
@SecurityRequirement(name = "javainuseapi")
public class ExerciseController {
    @Autowired
    private IExerciseService exercisesService;

    @GetMapping
    public List<ExercisesDTO> listar(){

        return exercisesService.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return  m.map(x,ExercisesDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody ExercisesDTO dto){
        ModelMapper m=new ModelMapper();
        Exercise exercise =m.map(dto, Exercise.class);
        exercisesService.insert(exercise);
    }
    @GetMapping("/{id}")
    public ExercisesDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        ExercisesDTO dto=m.map(exercisesService.listId(id),ExercisesDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody ExercisesDTO dto){
        ModelMapper m=new ModelMapper();
        Exercise exercise =m.map(dto, Exercise.class);
        exercisesService.insert(exercise);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        exercisesService.delete(id);
    }

    @GetMapping("/busquedas")
    public List<ExercisesDTO>buscar(@RequestParam String nombre){
        return exercisesService.buscarNombre(nombre).stream().map(x->{
            ModelMapper m= new ModelMapper();
            return  m.map(x,ExercisesDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/totalejerciciospordieta")
    public List<TotaldeexercisesbyDietas> totalEjerciciosporDieta(){
        List<String[]> filaLista=exercisesService.totaldeexercisesbyDietas();
        List<TotaldeexercisesbyDietas> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            TotaldeexercisesbyDietas dtos=new TotaldeexercisesbyDietas();
            dtos.setIdDiet(Integer.parseInt(columna[0]));
            dtos.setDescription((columna[1]));
            dtos.setTotalExercisesporDieta(Integer.parseInt(columna[2]));
            dtoLista.add(dtos);
        }
        return dtoLista;
    }
}
