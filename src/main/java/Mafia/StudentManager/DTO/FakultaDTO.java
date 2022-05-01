package Mafia.StudentManager.DTO;

import lombok.Data;

@Data
public class FakultaDTO {
    private long id;
    private String nazov;
    private String veduci;

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

    public String getVeduci() {
        return veduci;
    }

    public void setVeduci(String veduci) {
        this.veduci = veduci;
    }
}
