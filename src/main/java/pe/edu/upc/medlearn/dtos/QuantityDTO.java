package pe.edu.upc.medlearn.dtos;

import pe.edu.upc.medlearn.entities.Exercise;
import pe.edu.upc.medlearn.entities.Food;
import pe.edu.upc.medlearn.entities.Medicine;

public class QuantityDTO {
    private int idQuantity;
    private int quantityQuantity;
    private Food food;
    private Exercise exercise;
    private Medicine medicine;

    public int getIdQuantity() {
        return idQuantity;
    }

    public void setIdQuantity(int idQuantity) {
        this.idQuantity = idQuantity;
    }

    public int getQuantityQuantity() {
        return quantityQuantity;
    }

    public void setQuantityQuantity(int quantityQuantity) {
        this.quantityQuantity = quantityQuantity;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }
}
