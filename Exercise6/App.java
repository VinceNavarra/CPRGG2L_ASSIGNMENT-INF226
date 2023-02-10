public class App {
    public static void main(String[] args) throws Exception {
        

        // item in form of diaper
        // Polymorphic variable
        GroceryItem item1 = new Diaper();
        item1.name = " Pamper";
        item1.showItemName();
        item1.price = 150;

        // item in form of softdrinks
        GroceryItem item2 = new Softdrinks();
        item2.name = " Royal ";
        item2.showItemName();
        item2.price = 65;

        // Cashier object
        Cashier c1 = new Cashier();
        
        // Polymorphic parameter
        c1.checkOut(item1);
        c1.checkOut(item2);
        
        c1.showItemPrice(item1);
        c1.showItemPrice(item2);

        
    GroceryItem[] itemArray = new GroceryItem[2]    ;

    itemArray[0] = item1;
    itemArray[1] = item2;

        double totalAmount = 0.00;
    for (int i = 0; i < itemArray.length; i++) {
        totalAmount += itemArray[i].price;
        itemArray[i].showItemName(); 
        System.out.println(itemArray[i].price);
        
    }
        System.out.println("The total amount of your items is: " + totalAmount);



        Cat mycat = new Cat();
        mycat.eat();

    }
}
