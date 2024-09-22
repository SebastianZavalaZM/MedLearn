package pe.edu.upc.medlearn.dtos;

import pe.edu.upc.medlearn.entities.Diet;

public class ExercisesDTO {
    private int idExercise;
    private String nameExercise;
    private int setsExercise;
    private Diet diet;

    public int getIdExercise() {
        return idExercise;
    }

    public void setIdExercise(int idExercise) {
        this.idExercise = idExercise;
    }

    public String getNameExercise() {
        return nameExercise;
    }

    public void setNameExercise(String nameExercise) {
        this.nameExercise = nameExercise;
    }

    public int getSetsExercise() {
        return setsExercise;
    }

    public void setSetsExercise(int setsExercise) {
        this.setsExercise = setsExercise;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }
}
