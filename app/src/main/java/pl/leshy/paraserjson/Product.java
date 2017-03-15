package pl.leshy.paraserjson;

/**
 * Created by Sowa on 31.01.2017.
 */


public class Product {
    private String nazwa;
    private String netto;
    private String brutto;
    private String EAN;

    public Product(String qnazwa, String qnetto, String qbrutto, String qEAN) {

        this.nazwa = qnazwa;
        this.netto = qnetto;
        this.brutto = qbrutto;
        this.EAN = qEAN;
    }


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String qnazwa) {
        this.nazwa = qnazwa;
    }

    public String getNetto() {
        return netto;
    }

    public void setNetto(String qnetto) {
        this.netto = qnetto;
    }

    public String getBrutto() {
        return brutto;
    }

    public void setPrice(String qbrutto) {
        this.brutto = qbrutto;
    }

    public String getEAN() {
        return EAN;
    }

    public void setEAN(String qEAN) {
        this.EAN = qEAN;
    }

}