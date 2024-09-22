package pe.edu.upc.medlearn.dtos;
import pe.edu.upc.medlearn.entities.Diets;

public class FoodDTO {
    private int idFood;
    private String nameFood;
    private int portionFood;
    private String typeQuantityFood;
    private int proteinsFood;
    private int fatsFood;
    private int carbohydratesFood;
    private int fiberFood;
    private int cholesterolFood;
    private int sodiumFood;
    private Diets idDiet;

    public int getIdFood() {
        return idFood;
    }

    public void setIdFood(int idFood) {
        this.idFood = idFood;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public int getPortionFood() {
        return portionFood;
    }

    public void setPortionFood(int portionFood) {
        this.portionFood = portionFood;
    }

    public String getTypeQuantityFood() {
        return typeQuantityFood;
    }

    public void setTypeQuantityFood(String typeQuantityFood) {
        this.typeQuantityFood = typeQuantityFood;
    }

    public int getProteinsFood() {
        return proteinsFood;
    }

    public void setProteinsFood(int proteinsFood) {
        this.proteinsFood = proteinsFood;
    }

    public int getFatsFood() {
        return fatsFood;
    }

    public void setFatsFood(int fatsFood) {
        this.fatsFood = fatsFood;
    }

    public int getCarbohydratesFood() {
        return carbohydratesFood;
    }

    public void setCarbohydratesFood(int carbohydratesFood) {
        this.carbohydratesFood = carbohydratesFood;
    }

    public int getFiberFood() {
        return fiberFood;
    }

    public void setFiberFood(int fiberFood) {
        this.fiberFood = fiberFood;
    }

    public int getCholesterolFood() {
        return cholesterolFood;
    }

    public void setCholesterolFood(int cholesterolFood) {
        this.cholesterolFood = cholesterolFood;
    }

    public int getSodiumFood() {
        return sodiumFood;
    }

    public void setSodiumFood(int sodiumFood) {
        this.sodiumFood = sodiumFood;
    }

    public Diets getIdDiet() {
        return idDiet;
    }

    public void setIdDiet(Diets idDiet) {
        this.idDiet = idDiet;
    }
}
