package pe.edu.upc.medlearn.dtos;
import pe.edu.upc.medlearn.entities.Illness;

public class SympthomsDTO {
    private int idSymptom;
    private String nameSymptom;
    private int searchesSymptom;
    private Illness illness;

    public int getIdSymptom() {
        return idSymptom;
    }

    public void setIdSymptom(int idSymptom) {
        this.idSymptom = idSymptom;
    }

    public String getNameSymptom() {
        return nameSymptom;
    }

    public void setNameSymptom(String nameSymptom) {
        this.nameSymptom = nameSymptom;
    }

    public int getSearchesSymptom() {
        return searchesSymptom;
    }

    public void setSearchesSymptom(int searchesSymptom) {
        this.searchesSymptom = searchesSymptom;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }
}
