package pe.edu.upc.medlearn.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.medlearn.entities.Hospital;
import pe.edu.upc.medlearn.repositories.IHospitalRepository;
import pe.edu.upc.medlearn.servicesinterfaces.IHospitalService;

import java.util.List;

@Service
public class HospitalServiceImplement implements IHospitalService {
    @Autowired
    private IHospitalRepository hR;

    @Override
    public List<Hospital> list() {
        return hR.findAll();
    }

    @Override
    public void insert(Hospital hospital) {
        hR.save(hospital);
    }

    @Override
    public void delete(int id) {
        hR.deleteById(id);
    }

    @Override
    public Hospital listId(int id) {
        return hR.findById(id).orElse(new Hospital());
    }

    @Override
    public void update(Hospital h) {
        hR.save(h);
    }

    @Override
    public List<Hospital> buscarporNombre(String nombre) {
        return hR.buscarNombre(nombre);
    }

    @Override
    public List<Hospital> ordenarPorVistas() {
        return hR.ordenarPorVistas();
    }
}
