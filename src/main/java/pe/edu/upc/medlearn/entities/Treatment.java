package pe.edu.upc.medlearn.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Treatment")
public class Treatment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTreatment;

    @Column(name = "descriptionTreatment", nullable = false, length = 400)
    private String descriptionTreatment;
    @Column(name = "durationTreatment", nullable = false)
    private int durationTreatment;
    @Column(name = "startDayTreatment", nullable = false)
    private LocalDate startDayTreatment;
    @Column(name = "finishDayTreatment", nullable = false)
    private LocalDate finishDayTreatment;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "idIllness")
    private Illness illness;


    public Treatment() {
    }

    public Treatment(int idTreatment, String descriptionTreatment, int durationTreatment, LocalDate startDayTreatment, LocalDate finishDayTreatment, Users users, Illness illness) {
        this.idTreatment = idTreatment;
        this.descriptionTreatment = descriptionTreatment;
        this.durationTreatment = durationTreatment;
        this.startDayTreatment = startDayTreatment;
        this.finishDayTreatment = finishDayTreatment;
        this.users = users;
        this.illness = illness;
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
