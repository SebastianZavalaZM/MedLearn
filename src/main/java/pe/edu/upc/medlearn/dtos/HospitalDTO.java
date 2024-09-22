package pe.edu.upc.medlearn.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import pe.edu.upc.medlearn.entities.Users;

public class HospitalDTO {
    private int idHospital;
    private String nameHospital;
    private double latitudHospital;
    private double longitudHospital;
    private String addressHospital;
    private String contactHospital;
    private int counterViewsHospital;
    private Users user;

    public int getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public String getNameHospital() {
        return nameHospital;
    }

    public void setNameHospital(String nameHospital) {
        this.nameHospital = nameHospital;
    }

    public double getLatitudHospital() {
        return latitudHospital;
    }

    public void setLatitudHospital(double latitudHospital) {
        this.latitudHospital = latitudHospital;
    }

    public double getLongitudHospital() {
        return longitudHospital;
    }

    public void setLongitudHospital(double longitudHospital) {
        this.longitudHospital = longitudHospital;
    }

    public String getAddressHospital() {
        return addressHospital;
    }

    public void setAddressHospital(String addressHospital) {
        this.addressHospital = addressHospital;
    }

    public String getContactHospital() {
        return contactHospital;
    }

    public void setContactHospital(String contactHospital) {
        this.contactHospital = contactHospital;
    }

    public int getCounterViewsHospital() {
        return counterViewsHospital;
    }

    public void setCounterViewsHospital(int counterViewsHospital) {
        this.counterViewsHospital = counterViewsHospital;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
