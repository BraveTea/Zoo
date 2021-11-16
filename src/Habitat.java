import java.util.ArrayList;

//TODO try and replace Habitat with a non-abstract class called Habitat<T> (type T)

public abstract class Habitat<T> {

    private String name;
    protected ArrayList<T> allAnimalsInHabitat;

    Habitat(String name) {
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
