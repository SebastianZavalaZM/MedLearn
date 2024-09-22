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
    private Food foodId;
    @ManyToOne
    @JoinColumn(name = "idExercises")
    private Exercise exerciseId;
    @ManyToOne
    @JoinColumn(name="idMedicine")
    private Medicine idMedicine;

    public Quantity() {
    }

    public Quantity(int idQuantity, int quantity, Food foodId, Exercise exerciseId, Medicine idMedicine) {
        this.idQuantity = idQuantity;
        this.quantity = quantity;
        this.foodId = foodId;
        this.exerciseId = exerciseId;
        this.idMedicine = idMedicine;
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
