package pe.edu.upc.medlearn.servicesimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.medlearn.entities.Diet;
import pe.edu.upc.medlearn.repositories.IDietRepository;
import pe.edu.upc.medlearn.servicesinterfaces.IDietsService;

import java.util.List;

@Service
public class DietsServiceImplement implements IDietsService {
    @Autowired
    private IDietRepository dR;

    @Override
    public List<Diet> list() {
        return dR.findAll();
    }

    @Override
    public void insert(Diet diet) { dR.save(diet);}

    @Override
    public Diet listId(int id) {return dR.findById(id).orElse(new Diet());}

    @Override
    public void update(Diet a) {dR.save(a); }

    @Override
    public void delete(int id) { dR.deleteById(id);}




}