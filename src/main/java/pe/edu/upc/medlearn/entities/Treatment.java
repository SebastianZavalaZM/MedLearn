package pe.edu.upc.medlearn.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Treatment")
public class Treatment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTreatment;

    @Column(name = "descriptionTreatment", nullable = false, length = 200)
    private String descriptionTreatment;

    @Column(name = "durationTreatment", nullable = false)
    private int durationTreatment;

    @Column(name = "startDayTreatment", nullable = false)
    private LocalDate startDayTreatment;

    @Column(name = "finish_day", nullable = false)
    private LocalDate finishDay;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private Users users;


    public Treatment() {
    }

    public Treatment(int idTreatment, String descriptionTreatment, int durationTreatment, LocalDate startDayTreatment, LocalDate finishDay, Users users) {
        this.idTreatment = idTreatment;
        this.descriptionTreatment = descriptionTreatment;
        this.durationTreatment = durationTreatment;
        this.startDayTreatment = startDayTreatment;
        this.finishDay = finishDay;
        this.users = users;
    }

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
