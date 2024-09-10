package pe.edu.upc.medlearn.dtos;

public class FindIlilnessSymptomsDTO {
    private String nameIllness;
    private String nameSymptom;

    public String getNameIllness() {
        return nameIllness;
    }

    public void setNameIllness(String nameIllness) {
        this.nameIllness = nameIllness;
    }

    public String getNameSymptom() {
        return nameSymptom;
    }

    public void setNameSymptom(String nameSymptom) {
        this.nameSymptom = nameSymptom;
    }
}
