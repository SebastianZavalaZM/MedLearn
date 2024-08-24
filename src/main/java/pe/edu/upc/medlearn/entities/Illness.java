package pe.edu.upc.medlearn.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Illness")
public class Illness {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIllness;
    @Column(name = "nameIllness",nullable = false,length = 70)
    private String nameIllness;
    @Column(name = "descriptionIllness",nullable = false,length = 300)
    private String descriptionIllness;
    @Column(name = "imageIllness",nullable = false,length = 150)
    private String imageIllness;
    @Column(name = "pointsIllness",nullable = false)
    private int pointsIllness;

    public Illness() {
    }

    public Illness(int idIllness, String nameIllness, String descriptionIllness, String imageIllness, int pointsIllness) {
        this.idIllness = idIllness;
        this.nameIllness = nameIllness;
        this.descriptionIllness = descriptionIllness;
        this.imageIllness = imageIllness;
        this.pointsIllness = pointsIllness;
    }

    public int getIdIllness() {
        return idIllness;
    }

    public void setIdIllness(int idIllness) {
        this.idIllness = idIllness;
    }

    public String getNameIllness() {
        return nameIllness;
    }

    public void setNameIllness(String nameIllness) {
        this.nameIllness = nameIllness;
    }

    public String getDescriptionIllness() {
        return descriptionIllness;
    }

    public void setDescriptionIllness(String descriptionIllness) {
        this.descriptionIllness = descriptionIllness;
    }

    public String getImageIllness() {
        return imageIllness;
    }

    public void setImageIllness(String imageIllness) {
        this.imageIllness = imageIllness;
    }

    public int getPointsIllness() {
        return pointsIllness;
    }

    public void setPointsIllness(int pointsIllness) {
        this.pointsIllness = pointsIllness;
    }
}
