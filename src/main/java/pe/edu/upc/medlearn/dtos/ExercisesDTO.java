package pe.edu.upc.medlearn.dtos;

import pe.edu.upc.medlearn.entities.Diets;

public class ExercisesDTO {
    private int idExercises;
    private String nameExercises;
    private int setsExercises;
    private Diets idDiet;

    public Diets getIdDiet() {
        return idDiet;
    }

    public void setIdDiet(Diets idDiet) {
        this.idDiet = idDiet;
    }

    public int getIdExercises() {
        return idExercises;
    }

    public void setIdExercises(int idExercises) {
        this.idExercises = idExercises;
    }

    public String getNameExercises() {
        return nameExercises;
    }

    public void setNameExercises(String nameExercises) {
        this.nameExercises = nameExercises;
    }

    public int getSetsExercises() {
        return setsExercises;
    }

    public void setSetsExercises(int setsExercises) {
        this.setsExercises = setsExercises;
    }
}
