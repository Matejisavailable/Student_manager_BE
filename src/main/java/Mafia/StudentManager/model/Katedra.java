package Mafia.StudentManager.model;

import javax.naming.Name;
import javax.persistence.*;

@Entity
@Table(name = "Katedra")
public class Katedra {
    @Id
    @GeneratedValue
    @Column(nullable = false, updatable = false)
    private long id;
    private String nazov;
    private String vedudci;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fakulta_id")
    private Fakulta fakulta;

    public Katedra() {
    }

    public Katedra(String nazov, String vedudci, Fakulta fakulta) {
        this.nazov = nazov;
        this.vedudci = vedudci;
        this.fakulta = fakulta;
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

    public String getVedudci() {
        return vedudci;
    }

    public void setVedudci(String vedudci) {
        this.vedudci = vedudci;
    }

    public Fakulta getFakulta() {
        return fakulta;
    }

    public void setFakulta(Fakulta fakulta) {
        this.fakulta = fakulta;
    }
}
