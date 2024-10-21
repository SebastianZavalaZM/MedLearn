package pe.edu.upc.medlearn.dtos;

public class TotaldecaloriesbydietDTO {
    private int idDiet;
    private String description;
    private int totalCaloriesPorDieta;

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

    public int getTotalCaloriesPorDieta() {
        return totalCaloriesPorDieta;
    }

    public void setTotalCaloriesPorDieta(int totalCaloriesPorDieta) {
        this.totalCaloriesPorDieta = totalCaloriesPorDieta;
    }
}
