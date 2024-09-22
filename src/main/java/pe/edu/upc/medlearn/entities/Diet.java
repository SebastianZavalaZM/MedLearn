package pe.edu.upc.medlearn.entities;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "Diets")
public class Diet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Diet;
    @Column(name = "description", nullable = false,length = 300)
    private String description;
    @Column(name ="duration", nullable = false)
    private int duration;
    @Column(name = "qualification", nullable = false)
    private int qualification;
    @Column(name = "start_day", nullable = false)
    private Date start_day;
    @Column(name = "end_day",nullable = false)
    private Date end_day;

    public Diet() {
    }
    public Diet(int id_Diet, String description, int duration, int qualification, Date start_day, Date end_day) {
        this.id_Diet = id_Diet;
        this.description = description;
        this.duration = duration;
        this.qualification = qualification;
        this.start_day = start_day;
        this.end_day = end_day;
    }

    public Date getEnd_day() {
        return end_day;
    }

    public void setEnd_day(Date end_day) {
        this.end_day = end_day;
    }

    public Date getStart_day() {
        return start_day;
    }

    public void setStart_day(Date start_day) {
        this.start_day = start_day;
    }

    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId_Diet() {
        return id_Diet;
    }

    public void setId_Diet(int id_Diet) {
        this.id_Diet = id_Diet;
    }


}