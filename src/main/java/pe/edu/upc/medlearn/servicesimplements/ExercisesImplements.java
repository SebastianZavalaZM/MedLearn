package pe.edu.upc.medlearn.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.medlearn.entities.Exercise;
import pe.edu.upc.medlearn.repositories.IExercisesRepository;
import pe.edu.upc.medlearn.servicesinterfaces.IExercisesService;

import java.util.List;

@Service
public class ExercisesImplements implements IExercisesService {
    @Autowired
    private IExercisesRepository  exercisesRepository;
    @Override
    public List<Exercise> list() {
        return exercisesRepository.findAll();
    }

    @Override
    public void insert(Exercise exercise) {
        exercisesRepository.save(exercise);
    }

    @Override
    public Exercise listId(int id) {
        return exercisesRepository.findById(id).orElse(new Exercise());
    }

    @Override
    public void delete(int id) {
        exercisesRepository.deleteById(id);
    }

    @Override
    public List<Exercise> buscarNombre(String nombre) {
        return exercisesRepository.buscarNombre(nombre);
    }

    @Override
    public List<String[]> totaldeexercisesbyDietas() {
        return exercisesRepository.totaldeexercisesbydiets();
    }
}
