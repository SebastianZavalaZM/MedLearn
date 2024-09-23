package pe.edu.upc.medlearn.servicesinterfaces;

import pe.edu.upc.medlearn.entities.Diet;

import java.util.List;

public interface IDietService {
    public List<Diet> list();
    public void insert(Diet diet);
    public Diet listId(int id);
    public void update(Diet a);
    public void delete(int id);

    List<Diet> findByQualification(int qualification);
    List<Diet> findByDescription(String description);


}
