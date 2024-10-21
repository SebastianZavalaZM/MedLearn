package pe.edu.upc.medlearn.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Quantity")
public class Quantity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idQuantity;
    @Column(name = "quantityQuantity",nullable = false)
    private int quantityQuantity;

    @ManyToOne
    @JoinColumn(name = "idFood")
    private Food food;
    @ManyToOne
    @JoinColumn(name = "idExercise")
    private Exercise exercise;
    @ManyToOne
    @JoinColumn(name="idMedicine")
    private Medicine medicine;

    public Quantity() {
    }

    public Quantity(int idQuantity, int quantityQuantity, Food food, Exercise exercise, Medicine medicine) {
        this.idQuantity = idQuantity;
        this.quantityQuantity = quantityQuantity;
        this.food = food;
        this.exercise = exercise;
        this.medicine = medicine;
    }

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
