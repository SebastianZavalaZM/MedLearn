package pe.edu.upc.medlearn.entities;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Diet")
public class Diet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dietId;

    @Column(name = "descriptionDiet", nullable = false, length = 200)
    private String descriptionDiet;
    @Column(name = "durationDiet", nullable = false)
    private int durationDiet;
    @Column(name = "qualificationDiet", nullable = false)
    private int qualificationDiet;
    @Column(name = "startDayDiet", nullable = false)
    private LocalDate startDayDiet;
    @Column(name = "finishdayDiet", nullable = false)
    private LocalDate finishdayDiet;

    @ManyToOne
    @JoinColumn(name = "idIllneses", nullable = false)
    private Illness illness;
    @ManyToOne
    @JoinColumn(name = "idUser", nullable = false) //client
    private Users user;

    // Constructor vacío
    public Diet() {
    }

    public Diet(int dietId, String descriptionDiet, int durationDiet, int qualificationDiet, LocalDate startDayDiet, LocalDate finishdayDiet, Illness illness, Users user) {
        this.dietId = dietId;
        this.descriptionDiet = descriptionDiet;
        this.durationDiet = durationDiet;
        this.qualificationDiet = qualificationDiet;
        this.startDayDiet = startDayDiet;
        this.finishdayDiet = finishdayDiet;
        this.illness = illness;
        this.user = user;
    }

    public int getDietId() {
        return dietId;
    }

    public void setDietId(int dietId) {
        this.dietId = dietId;
    }

    public String getDescriptionDiet() {
        return descriptionDiet;
    }

    public void setDescriptionDiet(String descriptionDiet) {
        this.descriptionDiet = descriptionDiet;
    }

    public int getDurationDiet() {
        return durationDiet;
    }

    public void setDurationDiet(int durationDiet) {
        this.durationDiet = durationDiet;
    }

    public int getQualificationDiet() {
        return qualificationDiet;
    }

    public void setQualificationDiet(int qualificationDiet) {
        this.qualificationDiet = qualificationDiet;
    }

    public LocalDate getStartDayDiet() {
        return startDayDiet;
    }

    public void setStartDayDiet(LocalDate startDayDiet) {
        this.startDayDiet = startDayDiet;
    }

    public LocalDate getFinishdayDiet() {
        return finishdayDiet;
    }

    public void setFinishdayDiet(LocalDate finishdayDiet) {
        this.finishdayDiet = finishdayDiet;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
