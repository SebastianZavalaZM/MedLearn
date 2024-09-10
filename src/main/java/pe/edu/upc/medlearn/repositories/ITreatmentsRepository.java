package pe.edu.upc.medlearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.medlearn.entities.Treatments;
import org.springframework.data.repository.query.Param;
import java.util.List;

@Repository
public interface ITreatmentsRepository extends JpaRepository<Treatments, Integer> {
    @Query("SELECT t.description, COUNT(u) FROM Treatments t " +
            "JOIN t.users u " +
            "GROUP BY t.description")
    public List<String[]> cantidadUsuariosPorTratamiento();

    @Query("SELECT t.description, COUNT(u) as user_count FROM Treatments t " +
            "JOIN t.users u " +
            "GROUP BY t.description " +
            "ORDER BY user_count DESC")
    public List<String[]> topTratamientos();
    @Query("SELECT t.description, AVG(t.duration) " +
            "FROM Treatments t " +
            "GROUP BY t.description")
    public List<String[]> obtenerPromedioDuracion();

}
