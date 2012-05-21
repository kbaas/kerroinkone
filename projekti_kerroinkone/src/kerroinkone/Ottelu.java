
package kerroinkone;

public class Ottelu {
    private Kotijoukkue kotijoukkue;
    private Vierasjoukkue vierasjoukkue;


    public Ottelu(Kotijoukkue kotijoukkue, Vierasjoukkue vierasjoukkue) {
        this.kotijoukkue = kotijoukkue;
        this.vierasjoukkue = vierasjoukkue;
    }

    public double kotivoittoprosentti() {
        return (kotijoukkue.voittotodennakoisyys() + vierasjoukkue.tappiotodennakoisyys()) / 2;
    }
    
    public double tasapeliprosentti() {
        return (kotijoukkue.tasapelitodennakoisyys() + vierasjoukkue.tasapelitodennakoisyys()) / 2;
    }
    
    public double vierasvoittoprosentti() {
        return (kotijoukkue.tappiotodennakoisyys() + vierasjoukkue.voittotodennakoisyys()) / 2;
    }
}
