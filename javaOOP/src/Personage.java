public class Personage {int health;
    int damage;
    int weight;
    String name;
    String TypeUnit;
    int height;
    public Personage( int health, int damage, int weight,String name,String TypeUnit,int height) {
        this.health = health;
        this.damage = damage;
        this.weight = weight;
        this.name =name;
        this.TypeUnit = TypeUnit;
        this.height = height;
    }

    public static void sayPhrase(String name,String name2) {
        System.out.println(name+ " против "+name2);
    }


    public static int attack(int vhealth, int damage, String name, String TypeUnit, String name2) {
        int a  =  vhealth- damage;
        System.out.println();
        return a;
    }
}

