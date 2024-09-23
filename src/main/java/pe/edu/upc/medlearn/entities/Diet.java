package pe.edu.upc.medlearn.entities;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Diet")
public class Diet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDiet;

    @Column(name = "descriptionDiet", nullable = false, length = 400)
    private String descriptionDiet;
    @Column(name = "durationDiet", nullable = false)
    private int durationDiet;
    @Column(name = "qualificationDiet", nullable = false)
    private int qualificationDiet;
    @Column(name = "startDayDiet", nullable = false)
    private LocalDate startDayDiet;
    @Column(name = "finishDayDiet")
    private LocalDate finishDayDiet;

    @ManyToOne
    @JoinColumn(name = "idIllneses", nullable = false)
    private Illness illness;
    @ManyToOne
    @JoinColumn(name = "idUser", nullable = false) //client
    private Users user;

    // Constructor vacío
    public Diet() {
    }

    public Diet(int idDiet, String descriptionDiet, int durationDiet, int qualificationDiet, LocalDate startDayDiet, LocalDate finishDayDiet, Illness illness, Users user) {
        this.idDiet = idDiet;
        this.descriptionDiet = descriptionDiet;
        this.durationDiet = durationDiet;
        this.qualificationDiet = qualificationDiet;
        this.startDayDiet = startDayDiet;
        this.finishDayDiet = finishDayDiet;
        this.illness = illness;
        this.user = user;
    }

    public int getIdDiet() {
        return idDiet;
    }

    public void setIdDiet(int idDiet) {
        this.idDiet = idDiet;
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

    public LocalDate getFinishDayDiet() {
        return finishDayDiet;
    }

    public void setFinishDayDiet(LocalDate finishDayDiet) {
        this.finishDayDiet = finishDayDiet;
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
