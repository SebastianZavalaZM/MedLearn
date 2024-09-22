package pe.edu.upc.medlearn.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Quantity")
public class Quantity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idQuantity;
    @Column(name = "quantity",nullable = false)
    private int quantity;

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

    public Quantity(int idQuantity, int quantity, Food food, Exercise exercise, Medicine medicine) {
        this.idQuantity = idQuantity;
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
