package pe.edu.upc.medlearn.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "Symptom")
public class Symptom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSymptom;
    @Column(name = "nameSymptom",nullable = false,length = 100)
    private String nameSymptom;
    @Column(name = "searchesSymptom",nullable = false)
    private int searchesSymptom;

    @ManyToOne
    @JoinColumn(name = "idIllness")
    private Illness illness;

    public Symptom() {
    }

    public Symptom(int idSymptom, String nameSymptom, int searchesSymptom, Illness illness) {
        this.idSymptom = idSymptom;
        this.nameSymptom = nameSymptom;
        this.searchesSymptom = searchesSymptom;
        this.illness = illness;
    }

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
