package pe.edu.upc.medlearn.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Treatments")
public class Treatment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int treatments_id;

    @Column(name = "description", nullable = false, length = 200)
    private String description;

    @Column(name = "duration", nullable = false)
    private int duration;

    @Column(name = "qualification", nullable = false)
    private int qualification;

    @Column(name = "start_day", nullable = false)
    private LocalDate startDay;

    @Column(name = "finish_day", nullable = false)
    private LocalDate finishDay;

    @ManyToOne
    @JoinColumn(name = "users_id", nullable = false)
    private Users users;


    public Treatment() {
    }


    public Treatment(int treatments_id, String description, int duration, int qualification, LocalDate startDay, LocalDate finishDay, Users users) {
        this.treatments_id = treatments_id;
        this.description = description;
        this.duration = duration;
        this.qualification = qualification;
        this.startDay = startDay;
        this.finishDay = finishDay;
        this.users = users;
    }

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

    public Users getUser() {
        return users;
    }

    public void setUser(Users users) {
        this.users = users;
    }
}
