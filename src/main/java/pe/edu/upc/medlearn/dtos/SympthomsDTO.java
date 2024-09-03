package pe.edu.upc.medlearn.dtos;
import jakarta.persistence.Column;

public class SympthomsDTO {

    private int idSympthoms;
    private int idIllness;
    private String nameSympthoms;
    private String mostSearhCounter;

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
