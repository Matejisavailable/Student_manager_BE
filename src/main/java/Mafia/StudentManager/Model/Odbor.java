package Mafia.StudentManager.Model;

import javax.persistence.*;

@Entity
public class Odbor {
    @Id
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nazov;
    private String konzultant;
    private String typ;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "katedra_id")
    private Katedra katedra;


    public Odbor() {
    }


    public Odbor(String nazov, String konzultant, Katedra katedra, String typ) {
        this.nazov = nazov;
        this.konzultant = konzultant;
        this.katedra = katedra;
        this.typ = typ;

    }

    public Katedra getKatedra() {
        return katedra;
    }

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

    public void setKatedra(Katedra katedra) {
        this.katedra = katedra;
    }
}
