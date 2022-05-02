package Mafia.StudentManager.Model;


import javax.persistence.*;

@Entity
@Table(name = "Fakulta")
public class Fakulta {
    @Id
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nazov;
    private String veduci;
    public Fakulta() {
    }

    public Fakulta(String nazov, String veduci) {
        this.nazov = nazov;
        this.veduci = veduci;
    }

    public Long getId() {
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
