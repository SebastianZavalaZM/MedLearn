package pe.edu.upc.medlearn.dtos;

import pe.edu.upc.medlearn.entities.Illness;
import pe.edu.upc.medlearn.entities.Users;

import java.time.LocalDate;


public class DietDTO {
    private int idDiet;
    private String descriptionDiet;
    private int durationDiet;
    private int qualificationDiet;
    private LocalDate startDayDiet;
    private LocalDate finishDayDiet;
    private Illness illness;
    private Users user;

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
