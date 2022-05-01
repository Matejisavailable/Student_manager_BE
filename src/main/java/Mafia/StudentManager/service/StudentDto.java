package Mafia.StudentManager.service;

import Mafia.StudentManager.model.Odbor;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;

public class StudentDto {

    private long id;
    private String meno;
    private String priezvisko;
    private String mail;
    private String mesto;
    private Odbor odbor;

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

    public Odbor getOdbor() {
        return odbor;
    }

    public void setOdbor(Odbor odbor) {
        this.odbor = odbor;
    }
}
