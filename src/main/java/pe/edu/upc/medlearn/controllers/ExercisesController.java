package pe.edu.upc.medlearn.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.medlearn.dtos.ExercisesDTO;
import pe.edu.upc.medlearn.entities.Exercises;
import pe.edu.upc.medlearn.servicesinterfaces.IExercisesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ejercicios")
public class ExercisesController {
    @Autowired
    private IExercisesService exercisesService;

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
        Exercises exercises=m.map(dto,Exercises.class);
        exercisesService.insert(exercises);
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
        Exercises exercises=m.map(dto,Exercises.class);
        exercisesService.insert(exercises);
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
}
