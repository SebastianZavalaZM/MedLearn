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
    @Override
    public void insert(Illness illness) {
        illnessRepository.save(illness);
    }
    @Override
    public void delete(Integer id) {
        illnessRepository.deleteById(id);
    }
    @Override
    public Illness listId(int id) {
        return illnessRepository.findById(id).orElse(new Illness());
    }

    @Override
    public List<String[]> findIllnessSymptoms(int idIllness) {
        return illnessRepository.findIllnessSymptoms( idIllness);
    }

    @Override
    public List<Illness> buscarNombre(String nombre) {
        return illnessRepository.buscarNombre(nombre);
    }

}
