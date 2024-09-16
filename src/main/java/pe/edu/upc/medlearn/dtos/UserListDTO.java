package pe.edu.upc.medlearn.dtos;

import pe.edu.upc.medlearn.entities.Role;

import java.util.List;

public class UserListDTO {
    private int idUser;
    private String fullnameUser;
    private String email;
    private String certificationUser;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getFullnameUser() {
        return fullnameUser;
    }

    public void setFullnameUser(String fullnameUser) {
        this.fullnameUser = fullnameUser;
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
