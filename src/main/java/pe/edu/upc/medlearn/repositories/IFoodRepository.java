package pe.edu.upc.medlearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.medlearn.entities.Food;

import java.util.List;

@Repository
public interface IFoodRepository extends JpaRepository<Food, Integer> {
    @Query("select f from Food f where f.nameFood like %:nombre%")
    public List<Food> findbyname(@Param("nombre") String nombre);
    @Query(value="" +
            "SELECT \n" +
            "    d.id_diet, \n" +
            "    d.description_diet, \n" +
            "    SUM(f.fats_food) AS total_calories_por_dieta\n" +
            "FROM \n" +
            "    Diet d\n" +
            "JOIN \n" +
            "    Food f ON d.id_diet = f.id_diet\n" +
            "GROUP BY \n" +
            "    d.id_diet, \n" +
            "    d.description_diet;", nativeQuery=true)
    public List<String[]>totalbycaloriesbydiet();

        @Query(value = "SELECT d.id_diet, d.description_diet, \n" +
            "       SUM(f.portionFood * (f.proteinsFood * 4 + f.fatsFood * 9 + f.carbohydratesFood * 4)) * 7 AS weekly_calories \n" +
            "FROM diet d \n" +
            "JOIN food f ON d.id_diet = f.id_diet \n" +
            "GROUP BY d.id_diet, d.description_diet \n" +
            "ORDER BY weekly_calories DESC", nativeQuery = true)
    public List<String[]> calculateWeeklyCaloriesByDiet();
}
