package pe.edu.upc.medlearn.servicesinterfaces;


import pe.edu.upc.medlearn.entities.Symptom;

import java.util.List;

public interface ISymptomService {
    public List<Symptom> list();

    public void insert(Symptom symptom);

    public void delete(int id);

    void update(Symptom ci);
}
