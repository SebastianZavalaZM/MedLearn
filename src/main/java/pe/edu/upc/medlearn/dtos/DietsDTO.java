package pe.edu.upc.medlearn.dtos;

import java.util.Date;

public class DietsDTO {
    private int id_Diet;
    private String description;
    private int duration;
    private int qualification;
    public Date start_day;
    public Date end_day;

    public Date getEnd_day() {
        return end_day;
    }

    public void setEnd_day(Date end_day) {
        this.end_day = end_day;
    }

    public Date getStart_day() {
        return start_day;
    }

    public void setStart_day(Date start_day) {
        this.start_day = start_day;
    }

    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId_Diet() {
        return id_Diet;
    }

    public void setId_Diet(int id_Diet) {
        this.id_Diet = id_Diet;
    }


}
