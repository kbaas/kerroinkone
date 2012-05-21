
package kerroinkone;

public class Kotijoukkue {
    private String nimi;
    private double voittoprosenttiKaikki;
    private double tasapeliprosenttiKaikki;
    private double tappioprosenttiKaikki;
    private double kotivoittoprosentti;
    private double kotitasapeliprosentti;
    private double kotitappioprosentti;

    public Kotijoukkue(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    public double getKotitappioprosentti() {
        return kotitappioprosentti;
    }

    public double getKotitasapeliprosentti() {
        return kotitasapeliprosentti;
    }

    public double getKotivoittoprosentti() {
        return kotivoittoprosentti;
    }

    public double getTappioprosenttiKaikki() {
        return tappioprosenttiKaikki;
    }

    public double getTasapeliprosenttiKaikki() {
        return tasapeliprosenttiKaikki;
    }

    public double getVoittoprosenttiKaikki() {
        return voittoprosenttiKaikki;
    }

    public void setKotitappioprosentti(double kotitappioprosentti) {
        this.kotitappioprosentti = kotitappioprosentti;
    }

    public void setKotitasapeliprosentti(double kotitasapeliprosentti) {
        this.kotitasapeliprosentti = kotitasapeliprosentti;
    }

    public void setKotivoittoprosentti(double kotivoittoprosentti) {
        this.kotivoittoprosentti = kotivoittoprosentti;
    }

    public void setTappioprosenttiKaikki(double tappioprosenttiKaikki) {
        this.tappioprosenttiKaikki = tappioprosenttiKaikki;
    }

    public void setTasapeliprosenttiKaikki(double tasapeliprosenttiKaikki) {
        this.tasapeliprosenttiKaikki = tasapeliprosenttiKaikki;
    }

    public void setVoittoprosenttiKaikki(double voittoprosenttiKaikki) {
        this.voittoprosenttiKaikki = voittoprosenttiKaikki;
    }

    public double voittotodennakoisyys() {
        return (getKotivoittoprosentti() + getVoittoprosenttiKaikki()) / 2;
    }
    
    public double tasapelitodennakoisyys() {
        return (getKotitasapeliprosentti() + getTasapeliprosenttiKaikki()) / 2;
    }
    
    public double tappiotodennakoisyys() {
        return (getKotitappioprosentti() + getTappioprosenttiKaikki()) / 2;
    }
    
}
