package pe.edu.upc.medlearn.dtos;

import pe.edu.upc.medlearn.entities.Users;

import java.time.LocalDate;

public class TreatmentsDTO {
    private int treatments_id;
    private String description;
    private int duration;
    private int qualification;
    private LocalDate start_day;
    private LocalDate finish_day;

    private Users users;

    // Getters y Setters

    public int getTreatmentsId() {
        return treatments_id;
    }

    public void setTreatmentsId(int treatments_id) {
        this.treatments_id = treatments_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
    }

    public LocalDate getStartDay() {
        return start_day;
    }

    public void setStartDay(LocalDate start_day) {
        this.start_day = start_day;
    }

    public LocalDate getFinishDay() {
        return finish_day;
    }

    public void setFinishDay(LocalDate finish_day) {
        this.finish_day = finish_day;
    }

    public Users getUser() {
        return users;
    }

    public void setUser(Users users) {
        this.users = users;
    }
}
