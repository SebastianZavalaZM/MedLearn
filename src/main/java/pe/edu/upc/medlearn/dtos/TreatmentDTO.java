package pe.edu.upc.medlearn.dtos;

import pe.edu.upc.medlearn.entities.Illness;
import pe.edu.upc.medlearn.entities.Users;

import java.time.LocalDate;

public class TreatmentDTO {
    private int idTreatment;
    private String descriptionTreatment;
    private int durationTreatment;
    private LocalDate startDayTreatment;
    private LocalDate finishDayTreatment;
    private Users users;
    private Illness illness;

    public int getIdTreatment() {
        return idTreatment;
    }

    public void setIdTreatment(int idTreatment) {
        this.idTreatment = idTreatment;
    }

    public String getDescriptionTreatment() {
        return descriptionTreatment;
    }

    public void setDescriptionTreatment(String descriptionTreatment) {
        this.descriptionTreatment = descriptionTreatment;
    }

    public int getDurationTreatment() {
        return durationTreatment;
    }

    public void setDurationTreatment(int durationTreatment) {
        this.durationTreatment = durationTreatment;
    }

    public LocalDate getStartDayTreatment() {
        return startDayTreatment;
    }

    public void setStartDayTreatment(LocalDate startDayTreatment) {
        this.startDayTreatment = startDayTreatment;
    }

    public LocalDate getFinishDayTreatment() {
        return finishDayTreatment;
    }

    public void setFinishDayTreatment(LocalDate finishDayTreatment) {
        this.finishDayTreatment = finishDayTreatment;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }
}
