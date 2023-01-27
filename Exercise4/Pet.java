public class Pet {
    int age;
    String name;
    Person owner;

    Pet(String petName, int petAge, Person ownerName) {
        this.name = petName;
        this.age = petAge;
        this.owner = ownerName;
    }

    void showOwner() {
        System.out.println("My pet name is " + this.name + " My owner is " + owner.name );

    }
    
}
