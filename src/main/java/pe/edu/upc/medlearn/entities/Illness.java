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
    @Column(name = "descriptionIllness",nullable = false,length = 400)
    private String descriptionIllness;
    @Column(name = "imageIllness",nullable = false,length = 250)
    private String imageIllness;
    @Column(name = "searchesIllneses",nullable = false)
    private int searchesIllneses;

    public Illness() {
    }

    public Illness(int idIllness, String nameIllness, String descriptionIllness, String imageIllness, int searchesIllneses) {
        this.idIllness = idIllness;
        this.nameIllness = nameIllness;
        this.descriptionIllness = descriptionIllness;
        this.imageIllness = imageIllness;
        this.searchesIllneses = searchesIllneses;
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

    public int getSearchesIllneses() {
        return searchesIllneses;
    }

    public void setSearchesIllneses(int searchesIllneses) {
        this.searchesIllneses = searchesIllneses;
    }
}
