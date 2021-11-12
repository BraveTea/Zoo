import java.util.ArrayList;

//TODO try and replace HabitatBase with a non-abstract class called Habitat<T> (type T)

public abstract class HabitatBase<T> {

    private String name;
    protected ArrayList<T> allAnimalsInHabitat;

    HabitatBase(String name) {
        this.name = name;
        allAnimalsInHabitat = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAnimalToHabitat(T animal) {
        allAnimalsInHabitat.add(animal);
    }


    public ArrayList<T> getAllAnimalsInHabitat() {
        return allAnimalsInHabitat;
    }

}
