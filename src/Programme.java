public class Programme {

    public static void main(String[] args){

        System.out.println("TEST");

        Aquarium aquarium1 = new Aquarium("OceanAquarium");
        Aviary aviary1 = new Aviary("BirdSanctuary");
        TheWorld theWorld1 = new TheWorld("Gaia");

        Tuna tuna1 = new Tuna("Templeton");
        BlackBird blackbird1 = new BlackBird("BA Baracus");


        aquarium1.addAnimalToHabitat(tuna1);
        aviary1.addAnimalToHabitat(blackbird1);

        System.out.println(aquarium1.getAllAnimalsInHabitat());

        for(int i = 0; i < aquarium1.getAllAnimalsInHabitat().size(); i++){
            System.out.println(aquarium1.getAllAnimalsInHabitat().get(i).getName());
        }


//        aquarium1.addAnimalToHabitat(blackbird1); //testing to see if I could add a bird to an aquarium (no)
//        aviary1.addAnimalToHabitat(tuna1); //testing to see if I could add a fish to an aviary (no)
        theWorld1.addAnimalToHabitat(tuna1); //So this shows that tuna1 is in fact of the type Animal




//        for (Fish fish : aquarium1.allAnimalsInHabitat) {
//            System.out.println(fish);
//        }


        System.out.println(tuna1.getName());


    }
}
