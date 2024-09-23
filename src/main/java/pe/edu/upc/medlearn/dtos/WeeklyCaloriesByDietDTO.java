package pe.edu.upc.medlearn.dtos;

public class WeeklyCaloriesByDietDTO {
    private String dietDescription;
    private double weeklyCalories;


    public WeeklyCaloriesByDietDTO() {
    }

    public WeeklyCaloriesByDietDTO(String dietDescription, double weeklyCalories) {
        this.dietDescription = dietDescription;
        this.weeklyCalories = weeklyCalories;
    }


    public String getDietDescription() {
        return dietDescription;
    }

    public void setDietDescription(String dietDescription) {
        this.dietDescription = dietDescription;
    }

    public double getWeeklyCalories() {
        return weeklyCalories;
    }

    public void setWeeklyCalories(double weeklyCalories) {
        this.weeklyCalories = weeklyCalories;
    }
}
