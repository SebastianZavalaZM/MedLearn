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
    @Query(value="SELECT \n" +
            "    d.id_diet,\n" +
            "    d.description,\n" +
            "    COUNT(e.id_exercises) AS total_ejercicios_by_dieta\n" +
            "FROM \n" +
            "    Exercises e\n" +
            "JOIN \n" +
            "    Diets d ON e.id_diet = d.id_diet\n" +
            "GROUP BY \n" +
            "    d.id_diet, d.description  -- Se añadió d.description al GROUP BY\n" +
            "ORDER BY \n" +
            "    d.description, total_ejercicios_by_dieta DESC;", nativeQuery=true)
    public List<String[]>totaldeexercisesbydiets();
}
