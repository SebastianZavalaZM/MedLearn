package pe.edu.upc.medlearn.entities;

import jakarta.persistence.*;

import javax.naming.Name;

@Entity
@Table(name = "Hospital")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHospital;
    @Column(name = "nameHospital", nullable = false, length = 150)
    private String nameHospital;
    @Column(name = "latitudeHospital", nullable = false)
    private double latitudeHospital;
    @Column(name = "longitudeHospital", nullable = false)
    private double longitudeHospital;
    @Column(name = "addressHospital", nullable = false, length = 175)
    private String addressHospital;
    @Column(name = "contactHospital", nullable = false, length = 25)
    private String contactHospital;
    @Column(name = "counterViewsHospital", nullable = false)
    private int counterViewsHospital;

    @OneToOne
    @JoinColumn(name = "id_user")
    private Users user;

    public Hospital() {
    }

    public Hospital(int idHospital, String nameHospital, double latitudeHospital, double longitudeHospital, String addressHospital, String contactHospital, int counterViewsHospital, Users user) {
        this.idHospital = idHospital;
        this.nameHospital = nameHospital;
        this.latitudeHospital = latitudeHospital;
        this.longitudeHospital = longitudeHospital;
        this.addressHospital = addressHospital;
        this.contactHospital = contactHospital;
        this.counterViewsHospital = counterViewsHospital;
        this.user = user;
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

    public double getLatitudeHospital() {
        return latitudeHospital;
    }

    public void setLatitudeHospital(double latitudeHospital) {
        this.latitudeHospital = latitudeHospital;
    }

    public double getLongitudeHospital() {
        return longitudeHospital;
    }

    public void setLongitudeHospital(double longitudeHospital) {
        this.longitudeHospital = longitudeHospital;
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