package Mafia.StudentManager.DTO;

import lombok.Data;

@Data
public class StudentDTO {
    private long id;
    private String meno;
    private String priezvisko;
    private String mail;
    private String mesto;
    private String odbor;

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

    public String getOdbor() {
        return odbor;
    }

    public void setOdbor(String odbor) {
        this.odbor = odbor;
    }
}
