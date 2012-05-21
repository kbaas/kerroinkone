
package kerroinkone;

public class TestiLuokka {
    String nimi;
    double voimakerroin;

    public TestiLuokka(String nimi, double voimakerroin) {
        this.nimi = nimi;
        this.voimakerroin = voimakerroin;
    }

    public String getNimi() {
        return nimi;
    }

    public double getVoimakerroin() {
        return voimakerroin;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setVoimakerroin(double voimakerroin) {
        this.voimakerroin = voimakerroin;
    }

    @Override
    public String toString() {
        return getVoimakerroin() + "voimaa";
    }
    
    
}
