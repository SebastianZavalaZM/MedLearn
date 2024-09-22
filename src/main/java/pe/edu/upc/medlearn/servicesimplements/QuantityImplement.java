package pe.edu.upc.medlearn.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.medlearn.entities.Quantity;
import pe.edu.upc.medlearn.repositories.IQuantityRepository;
import pe.edu.upc.medlearn.servicesinterfaces.IQuantityService;

import java.util.List;

@Service
public class QuantityImplement implements IQuantityService {
    @Autowired
    private IQuantityRepository quantitysRepository;
    @Override
    public void insert(Quantity quantity) {
        quantitysRepository.save(quantity);
    }

    @Override
    public void update(Quantity quantity) {
        quantitysRepository.save(quantity);
    }

    @Override
    public List<Quantity> list() {
        return quantitysRepository.findAll();
    }
}
