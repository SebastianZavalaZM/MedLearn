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
    @Column(name = "portionFood",nullable = false)
    private int portionFood;
    @Column(name = "typeQuantityFood",nullable = false,length = 100)
    private String typeQuantityFood;
    @Column(name = "proteinsFood",nullable = false)
    private int proteinsFood;
    @Column(name = "fatsFood",nullable = false)
    private int fatsFood;
    @Column(name = "carbohydratesFood",nullable = false)
    private int carbohydratesFood;
    @Column(name = "fiberFood",nullable = false)
    private int fiberFood;
    @Column(name = "cholesterolFood",nullable = false)
    private int cholesterolFood;
    @Column(name = "sodiumFood",nullable = false)
    private int sodiumFood;
    @ManyToOne
    @JoinColumn(name = "id_diet")
    private Diets idDiet;

    public Food() {
    }

    public Food(int idFood, String nameFood, int portionFood, String typeQuantityFood, int proteinsFood, int fatsFood, int carbohydratesFood, int fiberFood, int cholesterolFood, int sodiumFood, Diets idDiet) {
        this.idFood = idFood;
        this.nameFood = nameFood;
        this.portionFood = portionFood;
        this.typeQuantityFood = typeQuantityFood;
        this.proteinsFood = proteinsFood;
        this.fatsFood = fatsFood;
        this.carbohydratesFood = carbohydratesFood;
        this.fiberFood = fiberFood;
        this.cholesterolFood = cholesterolFood;
        this.sodiumFood = sodiumFood;
        this.idDiet = idDiet;
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
