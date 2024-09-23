package pe.edu.upc.medlearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.medlearn.entities.Treatment;

import java.util.List;

@Repository
public interface ITreatmentsRepository extends JpaRepository<Treatment, Integer> {
    @Query("SELECT t.descriptionTreatment, COUNT(u) " +
            "FROM Treatment t " +
            "JOIN t.users u " +
            "GROUP BY t.descriptionTreatment")
    public List<String[]> cantidadUsuariosPorTratamiento();

    @Query("SELECT t.descriptionTreatment, COUNT(u) as user_count " +
            "FROM Treatment t " +
            "JOIN t.users u " +
            "GROUP BY t.descriptionTreatment " +
            "ORDER BY user_count DESC")
    public List<String[]> topTratamientos();
    @Query("SELECT t.descriptionTreatment, AVG(t.durationTreatment) " +
            "FROM Treatment t " +
            "GROUP BY t.descriptionTreatment")
    public List<String[]> obtenerPromedioDuracion();

    @Query("SELECT t FROM Treatment t JOIN t.illness i WHERE i.idIllness = :idillness")
    List<Treatment> listByIllness(@Param("idillness") Integer idillness);

}
