package Mafia.StudentManager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Student")
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private long id;
    private String meno;
    private String priezvisko;
    private String mail;
    private String mesto;
   // @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
   // @JoinColumn(name = "odbor_id")//private Odbor odbor;
    // private Odbor odbor;

    public Student() {
    }
    public Student(String meno, String priezvisko, String mail, String mesto, Odbor odbor) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.mail = mail;
        this.mesto = mesto;
      //  this.odbor = odbor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }


}


