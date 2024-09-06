package pe.edu.upc.medlearn.entities;

import jakarta.persistence.*;

import javax.naming.Name;

@Entity
@Table(name = "Hospital")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHospital;
    @Column(name = "nameHospital", nullable = false, length = 25)
    private String nameHospital;
    @Column(name = "latitud", nullable = false)
    private double latitud;
    @Column(name = "longitud", nullable = false)
    private double longitud;
    @Column(name = "direccionHospital", nullable = false, length = 75)
    private String direccionHospital;
    @Column(name = "contactHospital", nullable = false, length = 15)
    private String contactHospital;
    @Column(name = "counterviewsHospital", nullable = false)
    private int counterviewsHospital;

    @OneToOne
    @JoinColumn(name = "idUser")
    private Users us;

    public Hospital() {
    }

    public Hospital(int idHospital, String nameHospital, double latitud, double longitud, String direccionHospital, String contactHospital, int counterviewsHospital, Users us) {
        this.idHospital = idHospital;
        this.nameHospital = nameHospital;
        this.latitud = latitud;
        this.longitud = longitud;
        this.direccionHospital = direccionHospital;
        this.contactHospital = contactHospital;
        this.counterviewsHospital = counterviewsHospital;
        this.us = us;
    }

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

    public int getCounterviewsHospital() {
        return counterviewsHospital;
    }

    public void setCounterviewsHospital(int counterviewsHospital) {
        this.counterviewsHospital = counterviewsHospital;
    }

    public Users getUs() {
        return us;
    }

    public void setUs(Users us) {
        this.us = us;
    }
}