package pe.edu.upc.medlearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.medlearn.entities.Exercise;

import java.util.List;

@Repository
public interface IExercisesRepository extends JpaRepository<Exercise,Integer> {
    @Query("Select e from Exercise e where e.nameExercise like %:nombre%")
    public List<Exercise> buscarNombre(@Param("nombre") String nombre);

    @Query(value="" +
            " SELECT d.id_diet, d.description_diet, \n" +
            " COUNT(e.id_exercise) AS total_ejercicios_by_dieta\n" +
            " FROM exercise e\n" +
            " JOIN diet d ON d.id_diet = e.id_diet\n" +
            " GROUP BY d.id_diet, d.description_diet  -- Se añadió d.description al GROUP BY\n" +
            " ORDER BY d.description_diet DESC", nativeQuery=true)
    public List<String[]>totaldeexercisesbydiets();
}
