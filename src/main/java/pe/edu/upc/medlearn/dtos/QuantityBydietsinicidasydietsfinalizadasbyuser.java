package pe.edu.upc.medlearn.dtos;

public class QuantityBydietsinicidasydietsfinalizadasbyuser {
    private String username;
    private int cantidadDeDietasIniciadas;
    private int cantidadDietasFinalizadas;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCantidadDeDietasIniciadas() {
        return cantidadDeDietasIniciadas;
    }

    public void setCantidadDeDietasIniciadas(int cantidadDeDietasIniciadas) {
        this.cantidadDeDietasIniciadas = cantidadDeDietasIniciadas;
    }

    public int getCantidadDietasFinalizadas() {
        return cantidadDietasFinalizadas;
    }

    public void setCantidadDietasFinalizadas(int cantidadDietasFinalizadas) {
        this.cantidadDietasFinalizadas = cantidadDietasFinalizadas;
    }
}
