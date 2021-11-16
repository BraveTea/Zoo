public abstract class Bird implements Animal {

    private String name;

    Bird(String name){
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
