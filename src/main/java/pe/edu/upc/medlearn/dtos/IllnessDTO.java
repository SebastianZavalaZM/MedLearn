package pe.edu.upc.medlearn.dtos;

public class IllnessDTO {
    private int idIllness;
    private String nameIllness;
    private String descriptionIllness;
    private String imageIllness;
    private int searchesIllnesess;

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

    public int getSearchesIllnesess() {
        return searchesIllnesess;
    }

    public void setSearchesIllnesess(int searchesIllnesess) {
        this.searchesIllnesess = searchesIllnesess;
    }
}
