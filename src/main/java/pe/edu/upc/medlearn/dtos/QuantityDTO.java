package pe.edu.upc.medlearn.dtos;

import pe.edu.upc.medlearn.entities.Exercise;
import pe.edu.upc.medlearn.entities.Food;
import pe.edu.upc.medlearn.entities.Medicine;

public class QuantityDTO {
    private int idQuantity;
    private int quantity;
    private Food foodId;
    private Exercise exerciseId;
    private Medicine idMedicine;

    public int getIdQuantity() {
        return idQuantity;
    }

    public void setIdQuantity(int idQuantity) {
        this.idQuantity = idQuantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Food getFoodId() {
        return foodId;
    }

    public void setFoodId(Food foodId) {
        this.foodId = foodId;
    }

    public Exercise getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(Exercise exerciseId) {
        this.exerciseId = exerciseId;
    }

    public Medicine getIdMedicine() {
        return idMedicine;
    }

    public void setIdMedicine(Medicine idMedicine) {
        this.idMedicine = idMedicine;
    }
}
