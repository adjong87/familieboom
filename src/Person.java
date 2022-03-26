import java.util.List;
import java.util.ArrayList;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;
    private List<Person> siblings = new ArrayList<>();
    private List<Pet> petList = new ArrayList<>();
    private List<Person> kindjes = new ArrayList<>();

    // -------------------------------- CONSTRUCTORS

    public Person(String name, String lastName, String sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String middleName, String lastName, String sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    // ----------------------------  GETTERS

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public List<Pet> getPetList() {
        return petList;
    }

    public String getParents() {
        return getFather().getName() + " & " + getMother().getName();
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public List<Person> getKindjes() {
        return kindjes;
    }

    // ---------------------------- SETTERS

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }


    public void setPetList(List<Pet> petList) {
        this.petList = petList;
    }

    // ---------------------------- METHODES

    public void addParents(Person person1, Person person2) {
        if (person1.getSex() == "male" && person2.getSex() == "female") {
            System.out.println("Leuke menschen zijn je ouders");
            this.father = person1;
            this.mother = person2;
        } else {
            System.out.println("Fout ingevuld probeer het opnieuw");
        }
    }

    public void addChild(Person person) {
        kindjes.add(person);
    }

    public void addPet(Pet pet) {
        petList.add(pet);
    }

    public void addSibling(Person person) {
        siblings.add(person);

    }

    public void getGrandChildren() {

    }

   public void stelJeVoor(){
       System.out.println(getParents());
       System.out.println(getName());
       System.out.println(getLastName());
       System.out.println(getKindjes());
       System.out.println(getParents());
    }

    public String toString(){
        return name;
    }
}

