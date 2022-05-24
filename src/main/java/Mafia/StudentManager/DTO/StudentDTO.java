package Mafia.StudentManager.DTO;


import Mafia.StudentManager.Model.Fakulta;
import Mafia.StudentManager.Model.Katedra;

import lombok.Data;

@Data
public class StudentDTO {
    private Long id;
    private String meno;
    private String priezvisko;
    private String mail;
    private String mesto;
    private Long odborId;
    private String rocnik;
    private Long katedranaz;
    private Long fakultanaz;
    private String katedraNazov;
    private String fakultaNazov;
    private String odborNazov;


    public String getOdborNazov() {
        return odborNazov;
    }

    public void setOdborNazov(String odborNazov) {
        this.odborNazov = odborNazov;
    }

    public String getKatedraNazov() {
        return katedraNazov;
    }


    public void setKatedraNazov(String katedraNazov) {
        this.katedraNazov = katedraNazov;
    }


    public String getFakultaNazov() {
        return fakultaNazov;
    }

    public void setFakultaNazov(String fakultaNazov) {
        this.fakultaNazov = fakultaNazov;
    }

    public Long getKatedranaz() {
        return katedranaz;
    }

    public void setKatedranaz(Long katedranaz) {
        this.katedranaz = katedranaz;
    }

    public Long getFakultanaz() {
        return fakultanaz;
    }

    public void setFakultanaz(Long fakultanaz) {
        this.fakultanaz = fakultanaz;
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
        return mail.toLowerCase();
    }

    public void setMail(String mail) {
        this.mail = mail;
        mail.toLowerCase();
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public Long getOdbor() {
        return odborId;
    }

    public void setOdbor(Long odbor) {
        this.odborId = odbor;
    }

    public String getRocnik() {
        return rocnik;
    }

    public void setRocnik(String rocnik) {
        this.rocnik = rocnik;
    }
}
