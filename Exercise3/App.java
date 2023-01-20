public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        mage.name = "Gondar";
        thief.sayMyName();

        
        Weapon Sword = new Weapon();

        Sword.name = "Iron sting";
        Sword.damage = 100;
        Sword.rarity = "Common";
        Sword.addDamage (5);
        Sword.addDamage (10);
        Sword.showNameRarity();
        System.out.println(Sword.showNameRarity());
        
        Character archer  = new Character();
        archer.strength = 10;
        archer.agility = 5;
        archer.intelligence = 0;
        archer.name = "Jordan Carter";
        archer.sayMyName();
        archer.attack();
    }
}
