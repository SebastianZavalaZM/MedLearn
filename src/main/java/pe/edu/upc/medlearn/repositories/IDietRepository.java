package pe.edu.upc.medlearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.medlearn.entities.Diet;

import java.util.List;

@Repository
public interface IDietRepository extends JpaRepository<Diet, Integer> {

    @Query("SELECT d FROM Diet d WHERE d.qualificationDiet = :qualification")
    List<Diet> findByQualification(@Param("qualification") int qualification);

    @Query("SELECT d FROM Diet d WHERE d.descriptionDiet LIKE %:description%")
    List<Diet> findByDescription(@Param("description") String description);

}