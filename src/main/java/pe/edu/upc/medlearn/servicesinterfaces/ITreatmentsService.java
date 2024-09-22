package pe.edu.upc.medlearn.servicesinterfaces;

import pe.edu.upc.medlearn.entities.Treatment;

import java.util.List;

public interface ITreatmentsService {

    public List<Treatment> list();

    public void insert(Treatment treatment);

    public Treatment listId(int id);

    public void update(Treatment treatment);

    public void delete(int id);
    public List<String[]> cantidadUsuariosPorTratamiento();
    public  List<String[]> topTratamientos();
    public List<String[]> obtenerPromedioDuracion();

}