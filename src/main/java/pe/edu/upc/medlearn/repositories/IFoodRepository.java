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
}
