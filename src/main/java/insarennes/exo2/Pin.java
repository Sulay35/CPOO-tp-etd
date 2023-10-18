package insarennes.exo2;

public class Pin extends Arbre<Cone>{
    public Pin(){}
    public Pin(double a, double v) {
        super(a,v);
    }

    public int getPrix(){
        return (int)(this.volume*500);
    }

    public boolean peutEtreCoupe(){
        return (this.age >= 5.0);
    }

}
