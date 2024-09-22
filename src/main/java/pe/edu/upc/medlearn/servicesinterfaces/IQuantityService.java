package pe.edu.upc.medlearn.servicesinterfaces;

import pe.edu.upc.medlearn.entities.Quantity;

import java.util.List;

public interface IQuantityService {
    //HUB01
    public void insert(Quantity quantity);
    public void update(Quantity quantity);
    public List<Quantity> list();
}
