package pe.edu.upc.medlearn.dtos;
import jakarta.persistence.Column;
import pe.edu.upc.medlearn.entities.Illness;

public class SympthomsDTO {

    private int idSympthoms;
    private String nameSympthoms;
    private String mostSearhCounter;
    private Illness il;

    public Illness getIl() {
        return il;
    }

    public void setIl(Illness il) {
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
}
