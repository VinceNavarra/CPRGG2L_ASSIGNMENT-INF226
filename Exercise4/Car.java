public class Car {
    String model;
    String color;
    Person owner;

Car(String carModel, String carColor, Person ownerName) {
        this.model = carModel;
        this.color = carColor;
        this.owner = ownerName;

    
}
void showOwner() {
    System.out.println("The" + " " +  this.color + " " + this.model + " is owned by " + owner.name);
}
}