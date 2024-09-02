package pe.edu.upc.medlearn.servicesinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.medlearn.entities.Exercises;

import java.util.List;

public interface IExercisesService  {
    public List<Exercises> list();
    public void insert(Exercises exercises);
    public Exercises listId(int id);
    public void delete(int id);
    public List<Exercises> buscarNombre(String nombre);

}
