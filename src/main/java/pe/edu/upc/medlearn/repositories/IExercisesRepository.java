package pe.edu.upc.medlearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.medlearn.entities.Exercises;

import java.util.List;

@Repository
public interface IExercisesRepository extends JpaRepository<Exercises,Integer> {
    @Query("Select e from Exercises e where e.nameExercises like %:nombre%")
    public List<Exercises> buscarNombre(@Param("nombre") String nombre);
}
