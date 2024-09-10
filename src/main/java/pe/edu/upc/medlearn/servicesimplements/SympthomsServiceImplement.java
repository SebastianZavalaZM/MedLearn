package pe.edu.upc.medlearn.servicesimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.medlearn.entities.Sympthoms;
import pe.edu.upc.medlearn.repositories.ISympthomsRepository;
import pe.edu.upc.medlearn.servicesinterfaces.ISympthomsService;

import java.util.List;

@Service
public class SympthomsServiceImplement implements ISympthomsService {

    @Autowired
    private ISympthomsRepository sR;

    @Override
    public List<Sympthoms> list() {
        return sR.findAll();
    }

    @Override
    public void insert(Sympthoms sympthoms) {
        sR.save(sympthoms);
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }

    @Override
    public void update(Sympthoms ci) {
        sR.save(ci);}}




