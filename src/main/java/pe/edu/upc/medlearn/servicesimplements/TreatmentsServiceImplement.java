package pe.edu.upc.medlearn.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.medlearn.entities.Treatments;
import pe.edu.upc.medlearn.repositories.ITreatmentsRepository;
import pe.edu.upc.medlearn.servicesinterfaces.ITreatmentsService;

import java.util.List;

@Service
public class TreatmentsServiceImplement implements ITreatmentsService {

    @Autowired
    private ITreatmentsRepository tR;

    @Override
    public List<Treatments> list() {
        return tR.findAll();
    }

    @Override
    public void insert(Treatments treatments) {
        tR.save(treatments);
    }

    @Override
    public Treatments listId(int id) {
        return tR.findById(id).orElse(new Treatments());
    }

    @Override
    public void update(Treatments treatments) {
        tR.save(treatments);
    }

    @Override
    public void delete(int id) {
        tR.deleteById(id);
    }

    @Override
    public List<String[]> cantidadUsuariosPorTratamiento() {
        return tR.cantidadUsuariosPorTratamiento();
    }
    @Override
    public List<String[]> topTratamientos() {
        return tR.topTratamientos();
    }
}
