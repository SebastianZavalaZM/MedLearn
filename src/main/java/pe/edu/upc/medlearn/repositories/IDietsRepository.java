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

    @Query(value = "SELECT * \n" +
            "FROM diets c\n" +
            "WHERE c.qualification = (SELECT MAX(qualification) FROM diets)",nativeQuery = true)
    public List<String[]> cantidad();
}
