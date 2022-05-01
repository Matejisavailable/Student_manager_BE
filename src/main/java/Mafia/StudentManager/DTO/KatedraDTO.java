package Mafia.StudentManager.DTO;

import Mafia.StudentManager.Model.Fakulta;
import lombok.Data;

@Data
public class KatedraDTO {
    private long id;
    private String nazov;
    private String veduci;
    private FakultaDTO fakulta;

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

    public FakultaDTO getFakulta() {
        return fakulta;
    }

    public void setFakulta(FakultaDTO fakulta) {
        this.fakulta = fakulta;
    }
}
