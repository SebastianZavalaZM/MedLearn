package pe.edu.upc.medlearn.dtos;

import pe.edu.upc.medlearn.entities.Users;

public class HospitalDTO {
    private int idHospital;
    private String nameHospital;
    private double latitudeHospital;
    private double longitudeHospital;
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
