package pe.edu.upc.medlearn.entities;
import jakarta.persistence.*;
import pe.edu.upc.medlearn.entities.Illness;
@Entity
@Table(name = "Sympthoms")
public class Sympthoms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSympthoms;

    @Column(name = "idIllness",nullable = false)
    private int idIllness;

    @Column(name = "nameSympthoms",nullable = false,length = 70)
    private String nameSympthoms;

    @Column(name = "mostSearhCounter",nullable = false,length = 70)
    private String mostSearhCounter;

    public Sympthoms() {
    }

    public Sympthoms(int idSympthoms, int idIllness, String nameSympthoms, String mostSearhCounter) {
        this.idSympthoms = idSympthoms;
        this.idIllness = idIllness;
        this.nameSympthoms = nameSympthoms;
        this.mostSearhCounter = mostSearhCounter;
    }

    public int getIdSympthoms() {
        return idSympthoms;
    }

    public void setIdSympthoms(int idSympthoms) {
        this.idSympthoms = idSympthoms;
    }

    public int getIdIllness() {
        return idIllness;
    }

    public void setIdIllness(int idIllness) {
        this.idIllness = idIllness;
    }

    public String getNameSympthoms() {
        return nameSympthoms;
    }

    public void setNameSympthoms(String nameSympthoms) {
        this.nameSympthoms = nameSympthoms;
    }

    public String getMostSearhCounter() {
        return mostSearhCounter;
    }

    public void setMostSearhCounter(String mostSearhCounter) {
        this.mostSearhCounter = mostSearhCounter;
    }
}
