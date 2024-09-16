package pe.edu.upc.medlearn.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.medlearn.entities.Users;

import java.time.LocalDate;

public class TreatmentsDTO {
    private int idTreatment;
    private String descriptionTreatment;
    private int durationTreatment;
    private LocalDate startDayTreatment;
    private LocalDate finishDay;
    private Users users;

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

    public LocalDate getFinishDay() {
        return finishDay;
    }

    public void setFinishDay(LocalDate finishDay) {
        this.finishDay = finishDay;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
