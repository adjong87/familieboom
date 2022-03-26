public class Pet {
    private String name;
    private int age;
    private String species;
    private Person myOwner;

    // ------------------- CONSTRUCTORS

    public Pet(String name, int age, String species){
        this.name = name;
        this.age = age;
        this.species = species;
    }

    // -------------------- GETTERS

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public Person getMyOwner() {
        return myOwner;
    }

    // -------------------- SETTERS

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setMyOwner(Person myOwner) {
        this.myOwner = myOwner;
    }

// -------------------- METHODES


    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                ", owner=" + myOwner +
                '}';

    }
}
