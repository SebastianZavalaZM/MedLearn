package pe.edu.upc.medlearn.servicesinterfaces;

import pe.edu.upc.medlearn.entities.Medicine;

import java.util.List;

public interface IMedicineService {

    public List<Medicine> list();

    public void insert(Medicine medicine);

    public Medicine listId(int id);

    public void update(Medicine medicine);

    public void delete(int id);
}
