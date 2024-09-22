package pe.edu.upc.medlearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.medlearn.entities.Exercise;

import java.util.List;

@Repository
public interface IExercisesRepository extends JpaRepository<Exercise,Integer> {
    @Query("Select e from Exercise e where e.nameExercises like %:nombre%")
    public List<Exercise> buscarNombre(@Param("nombre") String nombre);
}
