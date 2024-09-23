package pe.edu.upc.medlearn.servicesinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.medlearn.entities.Food;

import java.util.List;

public interface IFoodServiceInterfaces {
    public List<Food> list();
    public void insert(Food food);
    public Food listId(int id);
    public void delete(int id);
    public List<Food> findbyname(@Param("nombre") String nombre);
    public List<String[]>totaldecaloriesbydiet();
    public List<String[]> calculateWeeklyCaloriesByDiet();
}
