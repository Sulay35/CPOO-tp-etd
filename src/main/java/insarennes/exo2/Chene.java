package insarennes.exo2;

public class Chene extends Arbre<Gland>{
    public Chene(){
        super();
    }
    public Chene(double a, double v) {
        super(a,v);
    }

    public int getPrix(){
        return (int)(this.volume*1000);
    }

    public boolean peutEtreCoupe(){
        return (this.age >= 10.0);
    }

}

