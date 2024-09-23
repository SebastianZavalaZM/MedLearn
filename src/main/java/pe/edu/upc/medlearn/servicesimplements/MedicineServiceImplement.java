package pe.edu.upc.medlearn.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.medlearn.entities.Medicine;
import pe.edu.upc.medlearn.repositories.IMedicineRepository;
import pe.edu.upc.medlearn.servicesinterfaces.IMedicineService;

import java.util.List;

@Service
public class MedicineServiceImplement implements IMedicineService {

    @Autowired
    private IMedicineRepository mR;

    @Override
    public List<Medicine> list() {
        return mR.findAll();
    }

    @Override
    public void insert(Medicine medicine) {
        mR.save(medicine);
    }

    @Override
    public Medicine listId(int id) {
        return mR.findById(id).orElse(new Medicine());
    }

    @Override
    public void update(Medicine medicine) {
        mR.save(medicine);
    }

    @Override
    public void delete(int id) {
        mR.deleteById(id);
    }
}
