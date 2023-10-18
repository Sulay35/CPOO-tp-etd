package insarennes.q5;

import java.util.ArrayList;
import java.util.Collection;

public class Velo {

    Collection<Roue> roues;

    public Velo(){
        roues = new ArrayList<>();
    }

    public Collection<Roue> getRoues() {
        return roues;
    }

    public void addRoue(Roue r){
        r.setVelo(this);
        roues.add(r);
    }

    public void removeRoues(Roue r){
        roues.remove(r);
        r.setVelo(null);
    }


    public void removeRoue(Roue r) {
            if(r != null) {
                roues.remove(r);
            }else {
                roues.clear();
            }
        }
}
