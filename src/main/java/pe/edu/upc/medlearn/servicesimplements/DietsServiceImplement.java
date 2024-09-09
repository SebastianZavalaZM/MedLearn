package pe.edu.upc.medlearn.servicesimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.medlearn.entities.Diets;
import pe.edu.upc.medlearn.repositories.IDietRepository;
import pe.edu.upc.medlearn.servicesinterfaces.IDietsService;

import java.util.List;

@Service
public class DietsServiceImplement implements IDietsService {
    @Autowired
    private IDietRepository dR;

    @Override
    public List<Diets> list() {
        return dR.findAll();
    }

    @Override
    public void insert(Diets diets) { dR.save(diets);}

    @Override
    public Diets listId(int id) {return dR.findById(id).orElse(new Diets());}

    @Override
    public void update(Diets a) {dR.save(a); }

    @Override
    public void delete(int id) { dR.deleteById(id);}




}