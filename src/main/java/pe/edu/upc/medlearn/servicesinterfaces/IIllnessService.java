package pe.edu.upc.medlearn.servicesinterfaces;
import pe.edu.upc.medlearn.entities.Illness;
import java.util.List;

public interface IIllnessService {
    public List<Illness> list();

    public void insert(Illness illness);

    public Illness listId(int id);

}
