
package kerroinkone;

public class Vierasjoukkue {
    private String nimi;
    private double voittoprosenttiKaikki;
    private double tasapeliprosenttiKaikki;
    private double tappioprosenttiKaikki;
    private double vierasvoittoprosentti;
    private double vierastasapeliprosentti;
    private double vierastappioprosentti;

    public Vierasjoukkue(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    public double getTappioprosenttiKaikki() {
        return tappioprosenttiKaikki;
    }

    public double getTasapeliprosenttiKaikki() {
        return tasapeliprosenttiKaikki;
    }

    public double getVierastappioprosentti() {
        return vierastappioprosentti;
    }

    public double getVierastasapeliprosentti() {
        return vierastasapeliprosentti;
    }

    public double getVierasvoittoprosentti() {
        return vierasvoittoprosentti;
    }

    public double getVoittoprosenttiKaikki() {
        return voittoprosenttiKaikki;
    }

    public void setTappioprosenttiKaikki(double tappioprosenttiKaikki) {
        this.tappioprosenttiKaikki = tappioprosenttiKaikki;
    }

    public void setTasapeliprosenttiKaikki(double tasapeliprosenttiKaikki) {
        this.tasapeliprosenttiKaikki = tasapeliprosenttiKaikki;
    }

    public void setVierastappioprosentti(double vierastappioprosentti) {
        this.vierastappioprosentti = vierastappioprosentti;
    }

    public void setVierastasapeliprosentti(double vierastasapeliprosentti) {
        this.vierastasapeliprosentti = vierastasapeliprosentti;
    }

    public void setVierasvoittoprosentti(double vierasvoittoprosentti) {
        this.vierasvoittoprosentti = vierasvoittoprosentti;
    }

    public void setVoittoprosenttiKaikki(double voittoprosenttiKaikki) {
        this.voittoprosenttiKaikki = voittoprosenttiKaikki;
    }
    
    public double voittotodennakoisyys() {
        return (getVoittoprosenttiKaikki() + getVierasvoittoprosentti()) / 2;
    }
    
    public double tasapelitodennakoisyys() {
        return (getTasapeliprosenttiKaikki() + getVierastasapeliprosentti()) / 2;
    }
    
    public double tappiotodennakoisyys() {
        return (getTappioprosenttiKaikki() + getVierastappioprosentti()) / 2;
    }
}
