package CouplageFort;

public class Voiture {
    Moteur m;
    void bouger(){
        m=new Moteur();
        m.demarrer();
        System.out.println("Vitesse 10km/h");
    }
}
