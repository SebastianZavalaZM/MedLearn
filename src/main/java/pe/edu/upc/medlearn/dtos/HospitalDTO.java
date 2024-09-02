package pe.edu.upc.medlearn.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import pe.edu.upc.medlearn.entities.Users;

public class HospitalDTO {
    private int idHospital;
    private String nameHospital;
    private double latitud;
    private double longitud;
    private String direccionHospital;
    private String contactHospital;

    private Users us;

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

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getDireccionHospital() {
        return direccionHospital;
    }

    public void setDireccionHospital(String direccionHospital) {
        this.direccionHospital = direccionHospital;
    }

    public String getContactHospital() {
        return contactHospital;
    }

    public void setContactHospital(String contactHospital) {
        this.contactHospital = contactHospital;
    }

    public Users getUs() {
        return us;
    }

    public void setUs(Users us) {
        this.us = us;
    }
}
