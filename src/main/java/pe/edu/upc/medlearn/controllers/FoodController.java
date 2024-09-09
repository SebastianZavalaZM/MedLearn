package pe.edu.upc.medlearn.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.medlearn.dtos.FoodDTO;
import pe.edu.upc.medlearn.dtos.TotaldecaloriesbydietDTO;
import pe.edu.upc.medlearn.dtos.TotaldeexercisesbyDietas;
import pe.edu.upc.medlearn.entities.Food;
import pe.edu.upc.medlearn.servicesinterfaces.IFoodServiceInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/alimentos")
public class FoodController {
    @Autowired
    private IFoodServiceInterfaces iFoodService;

    @GetMapping
    public List<FoodDTO>listar(){
        return iFoodService.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, FoodDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody FoodDTO foodDTO){
        ModelMapper mapper=new ModelMapper();
        Food food=mapper.map(foodDTO,Food.class);
        iFoodService.insert(food);
    }

    @GetMapping("/{id}")
    public FoodDTO listarId(@PathVariable("id") Integer id){
        ModelMapper mapper=new ModelMapper();
        FoodDTO dto =mapper.map(iFoodService.listId(id), FoodDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody FoodDTO foodDTO){
        ModelMapper mapper=new ModelMapper();
        Food food=mapper.map(foodDTO,Food.class);
        iFoodService.insert(food);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        iFoodService.delete(id);
    }

    @GetMapping("/busquedas")
    public List<FoodDTO>buscar(@RequestParam String nombre){
        return iFoodService.findbyname(nombre).stream().map(x->{
            ModelMapper mapper=new ModelMapper();
            return mapper.map(x, FoodDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/totaldecolesterolpordieta")
    public List<TotaldecaloriesbydietDTO> totalCaloriasporDieta(){
        List<String[]> filaLista=iFoodService.totaldecaloriesbydiet();
        List<TotaldecaloriesbydietDTO> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            TotaldecaloriesbydietDTO dtos=new TotaldecaloriesbydietDTO();
            dtos.setIdDiet(Integer.parseInt(columna[0]));
            dtos.setDescription((columna[1]));
            dtos.setTotalCaloriesPorDieta(Integer.parseInt(columna[2]));
            dtoLista.add(dtos);
        }
        return dtoLista;
    }
}
