package pe.edu.upc.medlearn.servicesimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.medlearn.entities.Illness;
import pe.edu.upc.medlearn.repositories.IllnessRepository;
import pe.edu.upc.medlearn.servicesinterfaces.IIllnessService;

import java.util.List;

@Service
public class IllnessServiceImplement implements IIllnessService {
    @Autowired
    private IllnessRepository illnessRepository;


    @Override
    public List<Illness> list() {
        return illnessRepository.findAll();
    }

    public void update(Illness a) {
//        cR.save(a);

    }
    @Override
    public void delete(int id) {
//        cR.deleteById(id);
    }
}
