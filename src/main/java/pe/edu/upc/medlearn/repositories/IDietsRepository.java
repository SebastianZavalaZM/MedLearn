package pe.edu.upc.medlearn.repositories;

import org.springframework.boot.autoconfigure.liquibase.LiquibaseDataSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.medlearn.entities.Diets;

import java.util.List;

@Repository
public interface IDietsRepository extends JpaRepository<Diets, Integer> {

    @Query("SELECT d FROM Diets d WHERE d.qualification = :qualification")
    List<Diets> findByQualification(@Param("qualification") int qualification);

    @Query("SELECT d FROM Diets d WHERE d.description LIKE %:description%")
    List<Diets> findByDescription(@Param("description") String description);

}