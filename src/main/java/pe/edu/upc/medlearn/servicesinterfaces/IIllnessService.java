package pe.edu.upc.medlearn.servicesinterfaces;
import pe.edu.upc.medlearn.entities.Illness;
import pe.edu.upc.medlearn.entities.Users;

import java.util.List;

public interface IIllnessService {

    public List<Illness> list();
    public void insert(Illness illness);
    public void delete(Integer Id); // UH 648
    public Illness listId(int id);
    public List<String[]> findIllnessSymptoms(int idIllness);


    List<Illness> buscarNombre(String nombre);
}
