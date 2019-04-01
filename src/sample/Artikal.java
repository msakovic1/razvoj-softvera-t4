package sample;

import java.util.ArrayList;

public class Artikal {
    private String  šifra, naziv;
    private Double cijena;

    public Artikal(String ulaz) {
        String[] ulazi = ulaz.split(",");
        setŠifra(ulazi[1]);
        setNaziv(ulazi[2]);
        setCijena(Double.parseDouble(ulazi[2]));
    }
    public Artikal (){

    }

    public String getŠifra() {
        return šifra;
    }

    public void setŠifra(String šifra) {
        if (šifra == null || šifra.isEmpty()) throw new IllegalArgumentException("Polje nesmije biti prazno.");
        this.šifra = šifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        if (naziv == null || naziv.isEmpty()) throw new IllegalArgumentException("Polje nesmije biti prazno.");
        this.naziv = naziv;
    }

    public Double getCijena()  {
        return cijena;
    }

    public void setCijena(Double cijena) {
        if (cijena <= 0) throw new IllegalArgumentException("Vrijednost nesmije biti jednaka ili manja od 0");
        this.cijena = cijena;
    }

    public String toString() {
        return šifra + "," + naziv + "," + cijena;
    }

    public static ArrayList<Artikal> izbaciDuplikate (ArrayList<Artikal> lista){
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(i).equals(lista.get(j))) lista.remove(j);
            }
        }
    }

    public boolean equals (Object object){
        Artikal a = (Artikal) object;
        return šifra.equals(a.getŠifra())
            && naziv.equals(a.getNaziv())
            && cijena.equals(a.getCijena());
    }
}
