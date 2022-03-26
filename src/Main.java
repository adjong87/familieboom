public class Main {
    public static void main(String[] args) {

        Person ik = new Person("Arjen", "de Jong", "male", 35);
        Person mama = new Person("Geeske", "de Jong", "female", 63);
        Person papa = new Person("Klaas", "de Jong", "male", 65);
        Person zus = new Person("Froukje", "de Jong", "female", 36);
        Person zusje = new Person("Gerbrich", "de Jong", "female", 31);
        Person kindje = new Person("kindje", "de Jong", "male", 1);

        Pet hond = new Pet("Rala", 2, "Portugese berghond");
        ik.addPet(hond);

        hond.setMyOwner(ik);
        System.out.println(hond.getMyOwner().getName());
        ik.addParents(papa, mama);
        ik.addSibling(zus);
        ik.addSibling(zusje);
        ik.addChild(kindje);
        System.out.println(ik.getParents());

        ik.stelJeVoor();
    }
}
