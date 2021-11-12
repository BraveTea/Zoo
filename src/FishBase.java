import java.util.ArrayList;

public abstract class FishBase<T> implements iAnimal {

    private String name;

    FishBase(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
//
//    public ArrayList<T> allFish = new ArrayList<>();
//
//    public void addFish(T fish){
//        allFish.add(fish);
//    }
}
