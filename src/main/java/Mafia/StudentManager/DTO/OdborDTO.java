package Mafia.StudentManager.DTO;

import lombok.Data;

@Data
public class OdborDTO {
    private Long id;
    private String nazov;
    private String konzultant;
    private String katedra;
    private String typ;

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
