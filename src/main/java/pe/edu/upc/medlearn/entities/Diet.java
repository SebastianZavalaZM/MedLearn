package pe.edu.upc.medlearn.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Diets")
public class Diet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDiet;
    @Column(name = "description", nullable = false,length = 300)
    private String description;
    @Column(name ="duration", nullable = false)
    private int duration;
    @Column(name = "qualification", nullable = false)
    private int qualification;
    @Column(name = "start_day", nullable = false)
    private LocalDate start_day;
    @Column(name = "end_day",nullable = false)
    private LocalDate end_day;

    public Diet() {
    }

    public Diet(int idDiet, String description, int duration, int qualification, LocalDate start_day, LocalDate end_day) {
        this.idDiet = idDiet;
        this.description = description;
        this.duration = duration;
        this.qualification = qualification;
        this.start_day = start_day;
        this.end_day = end_day;
    }

    public int getIdDiet() {
        return idDiet;
    }

    public void setIdDiet(int idDiet) {
        this.idDiet = idDiet;
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

    public LocalDate getStart_day() {
        return start_day;
    }

    public void setStart_day(LocalDate start_day) {
        this.start_day = start_day;
    }

    public LocalDate getEnd_day() {
        return end_day;
    }

    public void setEnd_day(LocalDate end_day) {
        this.end_day = end_day;
    }
}
