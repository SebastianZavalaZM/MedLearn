package pe.edu.upc.medlearn.dtos;

import pe.edu.upc.medlearn.entities.Role;

import java.util.List;

public class UserListDTO {
    private int idUser;
    private String username;
    private boolean enabled;
    private String email;
    private String certificationUser;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCertificationUser() {
        return certificationUser;
    }

    public void setCertificationUser(String certificationUser) {
        this.certificationUser = certificationUser;
    }

}
