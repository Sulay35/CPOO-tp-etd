package insarennes.exo2;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class Foret {
    private Collection<Arbre> arbres;
    private Collection<Arbre> arbresCoupes;

    public Collection<Arbre> getArbres() {
        return arbres;
    }

    public Collection<Arbre> getArbresCoupes() {
        return this.arbresCoupes;
    }

    // initialisation de la collection (sinon null et NullPointerException)
    public Foret(){
        arbres = new ArrayList<Arbre>();
        arbresCoupes = new ArrayList<Arbre>();
    }

    public Foret(Collection<Arbre> a){
        this.arbres = a;
        arbresCoupes = new ArrayList<Arbre>();
    }

    public void planterArbre(Arbre a){
        this.arbres.add(a);
    }
    public void couperArbre(Arbre a){
        if(this.arbres.contains(a)){
            this.arbres.remove(a);
            this.arbresCoupes.add(a);
        }
    }

    public int getPrixTotal(){
        int total = 0;
        for(Arbre a : this.arbres){
            if (a.peutEtreCoupe()){
                total += a.getPrix();
            }
        }
        return total;
    }

    public int getNombreChene(){
        int i = 0;
        for(Arbre a : this.arbres){
            String n = (a.getClass().getName());

            if((a.getClass().getName()).equals("insarennes.exo2.Chene")){
                i++;
            }
        }
        return i;
    }
}
