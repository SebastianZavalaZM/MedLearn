package pe.edu.upc.medlearn.dtos;



public class FoodDTO {
    private int idFood;
    private String nameFood;
    private int quantityFood;
    private int nutricionalFactsFood;

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
}
