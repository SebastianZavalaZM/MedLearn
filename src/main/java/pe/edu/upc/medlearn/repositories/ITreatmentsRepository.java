package pe.edu.upc.medlearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.medlearn.entities.Treatment;

import java.util.List;

@Repository
public interface ITreatmentsRepository extends JpaRepository<Treatment, Integer> {
    @Query("SELECT t.description, COUNT(u) FROM Treatment t " +
            "JOIN t.users u " +
            "GROUP BY t.description")
    public List<String[]> cantidadUsuariosPorTratamiento();

    @Query("SELECT t.description, COUNT(u) as user_count FROM Treatment t " +
            "JOIN t.users u " +
            "GROUP BY t.description " +
            "ORDER BY user_count DESC")
    public List<String[]> topTratamientos();
    @Query("SELECT t.description, AVG(t.duration) " +
            "FROM Treatment t " +
            "GROUP BY t.description")
    public List<String[]> obtenerPromedioDuracion();


}
