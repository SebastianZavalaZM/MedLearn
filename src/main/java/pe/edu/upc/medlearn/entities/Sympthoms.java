package pe.edu.upc.medlearn.entities;
import jakarta.persistence.*;
import pe.edu.upc.medlearn.entities.Illness;
@Entity
@Table(name = "Sympthoms")
public class Sympthoms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSympthoms;

    @Column(name = "nameSympthoms",nullable = false,length = 70)
    private String nameSympthoms;

    @Column(name = "mostSearhCounter",nullable = false,length = 70)
    private String mostSearhCounter;

    @ManyToOne
    @JoinColumn(name = "idIllness")
    private Illness il;
    public Sympthoms() {
    }

    public Sympthoms(int idSympthoms, String nameSympthoms, String mostSearhCounter, Illness il) {
        this.idSympthoms = idSympthoms;
        this.nameSympthoms = nameSympthoms;
        this.mostSearhCounter = mostSearhCounter;
        this.il = il;
    }

    public int getIdSympthoms() {
        return idSympthoms;
    }

    public void setIdSympthoms(int idSympthoms) {
        this.idSympthoms = idSympthoms;
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

    public Illness getIl() {
        return il;
    }

    public void setIl(Illness il) {
        this.il = il;
    }
}
