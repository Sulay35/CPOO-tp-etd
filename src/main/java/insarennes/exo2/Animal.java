package insarennes.exo2;

public class Animal<T>{
    public void manger(T f){
        System.out.println("Je mange un fruit de type : " + f.getClass().getName() + "\n");
    }
}
