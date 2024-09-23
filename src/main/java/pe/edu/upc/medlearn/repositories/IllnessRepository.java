package pe.edu.upc.medlearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.medlearn.entities.Illness;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IllnessRepository extends JpaRepository<Illness,Integer> {

    @Query("select c from Illness c where c.nameIllness like %:nombre%")
    public List<Illness> buscarNombre(@Param("nombre") String nombre);

    @Query("SELECT S.nameSymptom \n" +
            "FROM Symptom S \n" +
            "JOIN S.illness I \n" +
            "WHERE I.idIllness = :idIllness")
    public List<String[]> findIllnessSymptoms(@Param("idIllness") int idIllness);


}
