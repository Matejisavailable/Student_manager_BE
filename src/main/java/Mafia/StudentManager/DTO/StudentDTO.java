package Mafia.StudentManager.DTO;


public class StudentDTO {
    private Long id;
    private String meno;
    private String priezvisko;
    private String mail;
    private String mesto;
    private Long odborId;
    private String rocnik;

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
