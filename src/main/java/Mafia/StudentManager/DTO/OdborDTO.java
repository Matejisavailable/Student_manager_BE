package Mafia.StudentManager.DTO;

import Mafia.StudentManager.Model.Katedra;

public class OdborDTO {
    private long id;
    private String nazov;
    private String konzultant;
    private String katedra;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getKonzultant() {
        return konzultant;
    }

    public void setKonzultant(String konzultant) {
        this.konzultant = konzultant;
    }

    public String getKatedra() {
        return katedra;
    }

    public void setKatedra(String katedra) {
        this.katedra = katedra;
    }
}
