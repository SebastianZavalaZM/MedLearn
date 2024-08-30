package pe.edu.upc.medlearn.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @Column(name = "username",nullable = false,length = 30)
    private String username;
    @Column(name = "nameIllness",nullable = false,length = 30)
    private String password;
    @Column(name = "enabled",nullable = false)
    private boolean enabled;
    @Column(name = "email",nullable = false,length = 70)
    private String email;
    @Column(name = "certificationUser",nullable = false,length = 200)
    private String certificationUser;

    public Users() {
    }

    public Users(int idUser, String username, String password, boolean enabled, String email, String certificationUser) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.email = email;
        this.certificationUser = certificationUser;
    }

    public String getCertificationUser() {
        return certificationUser;
    }

    public void setCertificationUser(String certificationUser) {
        this.certificationUser = certificationUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
