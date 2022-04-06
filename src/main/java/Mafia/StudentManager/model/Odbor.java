package Mafia.StudentManager.model;

import javax.persistence.*;

@Entity
@Table(name = "Odbor")
public class Odbor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;
    private String nazov;
    private String konzultant;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY) // Cascade sa treba vyhnúť
    @JoinColumn(name = "katedra_id")
    private Katedra katedra;

    public Odbor() {
    }

    public Katedra getKatedra() {
        return katedra;
    }

    public Odbor(String nazov, String konzultant, Katedra katedra) {
        this.nazov = nazov;
        this.konzultant = konzultant;
        this.katedra = katedra;
    }

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

    public void setKatedra(Katedra katedra) {
        this.katedra = katedra;
    }
}
