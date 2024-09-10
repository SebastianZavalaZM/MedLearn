package pe.edu.upc.medlearn.servicesinterfaces;

import pe.edu.upc.medlearn.entities.Treatments;

import java.util.List;

public interface ITreatmentsService {

    public List<Treatments> list();

    public void insert(Treatments treatments);

    public Treatments listId(int id);

    public void update(Treatments treatments);

    public void delete(int id);
    public List<String[]> cantidadUsuariosPorTratamiento();
    public  List<String[]> topTratamientos();
    public List<String[]> obtenerPromedioDuracion();

}