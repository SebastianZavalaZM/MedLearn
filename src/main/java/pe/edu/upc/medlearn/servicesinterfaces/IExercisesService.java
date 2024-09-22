package pe.edu.upc.medlearn.servicesinterfaces;

import pe.edu.upc.medlearn.entities.Exercise;

import java.util.List;

public interface IExercisesService  {
    public List<Exercise> list();
    public void insert(Exercise exercise);
    public Exercise listId(int id);
    public void delete(int id);
    public List<Exercise> buscarNombre(String nombre);
    public List<String[]>totaldeexercisesbyDietas();
}
