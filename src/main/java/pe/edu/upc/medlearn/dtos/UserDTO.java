package pe.edu.upc.medlearn.dtos;

public class UserDTO {
    private int idUser;
    private String fullnameUser;
    private String username;
    private String password;
    private boolean enabled;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
