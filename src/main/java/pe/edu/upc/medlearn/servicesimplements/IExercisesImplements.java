package pe.edu.upc.medlearn.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.medlearn.entities.Exercises;
import pe.edu.upc.medlearn.repositories.IExercisesRepository;
import pe.edu.upc.medlearn.servicesinterfaces.IExercisesService;

import java.util.List;

@Service
public class IExercisesImplements implements IExercisesService {
    @Autowired
    private IExercisesRepository  exercisesRepository;
    @Override
    public List<Exercises> list() {
        return exercisesRepository.findAll();
    }

    @Override
    public void insert(Exercises exercises) {
        exercisesRepository.save(exercises);
    }

    @Override
    public Exercises listId(int id) {
        return exercisesRepository.findById(id).orElse(new Exercises());
    }

    @Override
    public void delete(int id) {
        exercisesRepository.deleteById(id);
    }

    @Override
    public List<Exercises> buscarNombre(String nombre) {
        return exercisesRepository.buscarNombre(nombre);
    }

    @Override
    public List<String[]> totaldeexercisesbyDietas() {
        return exercisesRepository.totaldeexercisesbydiets();
    }
}
