package pe.edu.upc.medlearn.entities;


import jakarta.persistence.*;
import org.springframework.aop.framework.adapter.DefaultAdvisorAdapterRegistry;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Diets")
public class Diets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int diet_id;

    @Column(name = "description", nullable = false, length = 200)
    private String description;

    @Column(name = "duration", nullable = false)
    private int duration;

    @Column(name = "qualification", nullable = false)
    private int qualification;

    @ManyToOne
    @JoinColumn(name = "Illnesses_enfermedes_id", nullable = false)
    private Illness illness;

    @ManyToOne
    @JoinColumn(name = "User_client_id", nullable = false)
    private Users client;

    @Column(name = "start_day", nullable = false)
    private LocalDate startDay;

    @Column(name = "finish_day", nullable = false)
    private LocalDate finishDay;

    // Constructor vacío
    public Diets() {
    }

    // Constructor con parámetros
    public Diets(int diet_id, String description, int duration, int qualification, Illness illness, Users client, LocalDate startDay, LocalDate finishDay) {
        this.diet_id = diet_id;
        this.description = description;
        this.duration = duration;
        this.qualification = qualification;
        this.illness = illness;
        this.client = client;
        this.startDay = startDay;
        this.finishDay = finishDay;
    }

    // Getters y Setters
    public int getDietId() {
        return diet_id;
    }

    public void setDietId(int diet_id) {
        this.diet_id = diet_id;
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

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public Users getClient() {
        return client;
    }

    public void setClient(Users client) {
        this.client = client;
    }

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
    }

    public LocalDate getFinishDay() {
        return finishDay;
    }

    public void setFinishDay(LocalDate finishDay) {
        this.finishDay = finishDay;
    }
}
