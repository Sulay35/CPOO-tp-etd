package insarennes.q3;

public class Velo {
    Guidon guidon;

    public Velo(Guidon g){
        this.setGuidon(g);
    }
    public Velo() {}
    public Guidon getGuidon() {
        return guidon;
    }

    public void setGuidon(Guidon guidon) {
        this.guidon = guidon;
    }
}
