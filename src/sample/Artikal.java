package sample;

import java.util.ArrayList;

public class Artikal {
    private String  šifra, naziv;
    private Double cijena;

    public Artikal(String šifra, String naziv, Double cijena) {
        setCijena(cijena);
        setNaziv(naziv);
        setŠifra(šifra);
        this.šifra = šifra;
        this.naziv = naziv;
        this.cijena = cijena;
    }

    public String getŠifra() {
        return šifra;
    }

    public void setŠifra(String šifra) {
        if (naziv.isEmpty()) throw new IllegalArgumentException("Polje nesmije biti prazno.");
        this.šifra = šifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        if (naziv.isEmpty()) throw new IllegalArgumentException("Polje nesmije biti prazno.");
        this.naziv = naziv;
    }

    public Double getCijena()  {
        return cijena;
    }

    public void setCijena(Double cijena) {
        if (cijena <= 0) throw new IllegalArgumentException("Vrijednost nesmije biti jednaka ili manja od 0");
        this.cijena = cijena;
    }

    @Override
    public String toString() {
        return "Artikal{" +
                "šifra='" + šifra + '\'' +
                ", naziv='" + naziv + '\'' +
                ", cijena=" + cijena +
                '}';
    }
}
