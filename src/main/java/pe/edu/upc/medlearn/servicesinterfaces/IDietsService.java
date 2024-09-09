package pe.edu.upc.medlearn.servicesinterfaces;

import pe.edu.upc.medlearn.entities.Diets;

import java.util.List;

public interface IDietsService {
    public List<Diets> list();
    public void insert(Diets diets);
    public Diets listId(int id);
    public void update(Diets a);
    public void delete(int id);

    List<Diets> findByQualification(int qualification);
    List<Diets> findByDescription(String description);


}
