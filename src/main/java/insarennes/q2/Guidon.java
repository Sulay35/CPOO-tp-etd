package insarennes.q2;

public class Guidon {
    Velo velo;
    Velo getVelo(){
        return velo;
    }

    void setVelo(Velo velo){
        if(velo == null){
            velo.setGuidon(null);
        }else {
            velo.setGuidon(this);
        }
        this.velo = velo;
    }
}
