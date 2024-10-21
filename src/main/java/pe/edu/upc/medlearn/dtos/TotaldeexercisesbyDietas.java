package pe.edu.upc.medlearn.dtos;

public class TotaldeexercisesbyDietas {
    private int idDiet;
    private String description;
    private int totalExercisesporDieta;

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

    public int getTotalExercisesporDieta() {
        return totalExercisesporDieta;
    }

    public void setTotalExercisesporDieta(int totalExercisesporDieta) {
        this.totalExercisesporDieta = totalExercisesporDieta;
    }
}
