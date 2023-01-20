public class Weapon {
    String name;
    int damage;
    String rarity;
    
    public void sayWEaponName() {
        System.out.println("Weapon " + name);
    }
    
    public void sayWEapondamage() {
        System.out.println("Weapon damage is " + damage);
    }

    public void sayWEaponrarity() {
        System.out.println("Weapon rarity is " + rarity);
    }
     public void addDamage (int additionalDamage) {
       int newDamage = damage + additionalDamage;
       System.out.println("Damage has been increased from " + this.damage + " to " + newDamage);

       // Assign new damage to weapon damage
       this.damage  = newDamage;
     }
       String showNameRarity() {
        return this.name + " " + this.rarity;

       }
        
    


     }
     




