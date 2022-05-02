package Mafia.StudentManager.Model;

import javax.persistence.*;
import java.util.Locale;

@Entity
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String meno;
    private String priezvisko;
    private String mail;
    private String mesto;
    private String rocnik;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "odbor_id")
    private Odbor odborId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "katedra_id")
    private Katedra katedra;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fakulta_id")
    private Fakulta fakulta;

    public Student() {
    }
    public Student(Fakulta fakulta, Katedra katedra, String meno, String priezvisko, String mail, String mesto, Odbor odborId, String rocnik) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.mail = mail;
        this.mesto = mesto;
        this.rocnik = rocnik;
        this.odborId = odborId;
        this.katedra = katedra;
        this.fakulta = fakulta;
    }

    public Katedra getKatedra() {
        return katedra;
    }

    public void setKatedra(Katedra katedra) {
        this.katedra = katedra;
    }

    public Fakulta getFakulta() {
        return fakulta;
    }

    public void setFakulta(Fakulta fakulta) {
        this.fakulta = fakulta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public String getMail() {
        return mail.toLowerCase(Locale.ROOT);
    }

    public void setMail(String mail) {
        this.mail = mail;
        this.mail.toLowerCase();
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public String getRocnik() {
        return rocnik;
    }
    public void setRocnik(String rocnik) {
        this.rocnik = rocnik;
    }

    public Odbor getOdbor() {
        return odborId;
    }
    public void setOdbor(Odbor odborId) {
        this.odborId = odborId;
    }
}


