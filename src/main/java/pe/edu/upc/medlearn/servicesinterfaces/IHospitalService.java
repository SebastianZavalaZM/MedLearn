package pe.edu.upc.medlearn.servicesinterfaces;

import pe.edu.upc.medlearn.entities.Hospital;

import java.util.List;

public interface IHospitalService {
    public List<Hospital> list();
    public void insert(Hospital hospital);
    public void delete(int id);
    public Hospital listId(int id);
    public  void update(Hospital h);
    public List<Hospital> buscarporNombre(String nombre);
}
