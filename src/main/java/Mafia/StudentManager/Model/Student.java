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

    public Student() {
    }
    public Student(String meno, String priezvisko, String mail, String mesto, Odbor odborId, String rocnik) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.mail = mail;
        this.mesto = mesto;
        this.rocnik = rocnik;
        this.odborId = odborId;
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


