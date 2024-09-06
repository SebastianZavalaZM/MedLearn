package pe.edu.upc.medlearn.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.medlearn.entities.Food;
import pe.edu.upc.medlearn.repositories.IFoodRepository;
import pe.edu.upc.medlearn.servicesinterfaces.IFoodServiceInterfaces;

import java.util.List;
@Service
public class IFoodServiceImplement implements IFoodServiceInterfaces {
    @Autowired
    private IFoodRepository iFoodRepository;

    @Override
    public List<Food> list() {
        return iFoodRepository.findAll();
    }

    @Override
    public void insert(Food food) {
        iFoodRepository.save(food);
    }

    @Override
    public Food listId(int id) {
        return iFoodRepository.findById(id).orElse(new Food());
    }

    @Override
    public void delete(int id) {
        iFoodRepository.deleteById(id);
    }

    @Override
    public List<Food> findbyname(String nombre) {
        return iFoodRepository.findbyname(nombre);
    }
}
