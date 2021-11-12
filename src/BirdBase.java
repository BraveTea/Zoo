import java.util.ArrayList;

public abstract class BirdBase implements iAnimal{

    private String name;

    BirdBase(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
//
//    public ArrayList<T> allBirds = new ArrayList<>();
//
//    public void addBird(T fish){
//        allBirds.add(fish);
//    }
}
