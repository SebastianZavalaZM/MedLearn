package pe.edu.upc.medlearn.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFood;
    @Column(name = "nameFood",nullable = false,length = 100)
    private String nameFood;
    @Column(name = "quantityFood",nullable = false)
    private int quantityFood;
    @Column(name = "nutricionalFactsFood",nullable = false)
    private int nutricionalFactsFood;
    //private Diets idDiet;

    public Food() {
    }

    public Food(int idFood, String nameFood, int quantityFood, int nutricionalFactsFood) {
        this.idFood = idFood;
        this.nameFood = nameFood;
        this.quantityFood = quantityFood;
        this.nutricionalFactsFood = nutricionalFactsFood;
    }

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

    public int getQuantityFood() {
        return quantityFood;
    }

    public void setQuantityFood(int quantityFood) {
        this.quantityFood = quantityFood;
    }

    public int getNutricionalFactsFood() {
        return nutricionalFactsFood;
    }

    public void setNutricionalFactsFood(int nutricionalFactsFood) {
        this.nutricionalFactsFood = nutricionalFactsFood;
    }
}
