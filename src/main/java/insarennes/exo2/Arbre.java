package insarennes.exo2;

public abstract class Arbre<T> {
    protected double age;
    protected double volume;
    protected double ageMin;

    public Arbre(){}
    public Arbre(double a, double v) {
            this.age = a;
            this.volume = v;
    }
    public double getAge(){
        return this.age;
    }

    public double getVolume() {
        return this.volume;
    }

    public abstract int getPrix();
    public abstract boolean peutEtreCoupe();

    public T produireFruit(T f){
        return f;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void viellir() {
        this.age++;
    }



}
