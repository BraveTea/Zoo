public abstract class Fish<T> implements Animal {

    private String name;

    Fish(String name){
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
