package pe.edu.upc.medlearn.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.springframework.security.access.prepost.PreAuthorize;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "users")
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;

    @Column(name = "fullnameUser", nullable = false,length = 140)
    private String fullnameUser;

    @Column(name = "username",nullable = false,length = 30)
    private String username;
    @Column(name = "password",nullable = false,length = 200)
    private String password;
    @Column(name = "enabled",nullable = false)
    private boolean enabled;

    @Column(name = "email",nullable = false,length = 70)
    private String email;
    @Column(name = "certificationUser",nullable = false,length = 200)
    private String certificationUser;

    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Role> roles;

    public Users() {
    }

    public Users(int idUser, String fullnameUser, String username, String password, boolean enabled, String email, String certificationUser, List<Role> roles) {
        this.idUser = idUser;
        this.fullnameUser = fullnameUser;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.email = email;
        this.certificationUser = certificationUser;
        this.roles = roles;
    }

    public String getCertificationUser() {
        return certificationUser;
    }

    public void setCertificationUser(String certificationUser) {
        this.certificationUser = certificationUser;
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

    public boolean getEnabled() {
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

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
