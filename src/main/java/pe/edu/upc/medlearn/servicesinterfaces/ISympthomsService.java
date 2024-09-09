package pe.edu.upc.medlearn.servicesinterfaces;


import pe.edu.upc.medlearn.entities.Sympthoms;

import java.util.List;

public interface ISympthomsService {
    public List<Sympthoms> list();

    public void insert(Sympthoms sympthoms);

    public void delete(int id);

    void update(Sympthoms ci);
}
