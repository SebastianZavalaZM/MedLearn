package pe.edu.upc.medlearn.dtos;

public class QuantityUsersByRolDTO {
    private String rol;
    private int usuarios;

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(int usuarios) {
        this.usuarios = usuarios;
    }
}
