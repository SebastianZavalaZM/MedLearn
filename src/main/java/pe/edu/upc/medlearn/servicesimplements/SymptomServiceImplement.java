package pe.edu.upc.medlearn.servicesimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.medlearn.entities.Symptom;
import pe.edu.upc.medlearn.repositories.ISympthomsRepository;
import pe.edu.upc.medlearn.servicesinterfaces.ISymptomService;

import java.util.List;

@Service
public class SymptomServiceImplement implements ISymptomService {

    @Autowired
    private ISympthomsRepository sR;

    @Override
    public List<Symptom> list() {
        return sR.findAll();
    }

    @Override
    public void insert(Symptom symptom) {
        sR.save(symptom);
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }

    @Override
    public void update(Symptom ci) {
        sR.save(ci);
    }

}
