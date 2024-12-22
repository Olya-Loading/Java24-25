
class WaterFamily extends Personage {
    public WaterFamily(int health, int damage, int weight, String name, String TypeUnit, int height) {
        super(health, damage, weight, name, TypeUnit, height);
    }

    public static int attack(int vhealth, int damage, String TypeUnit1, String TypeUnit2, String name2, int weightV, int heightV) {
        switch (name2) {
            case "Fire Famile":
                damage = damage * 4;
                break;
            case "WaterFamily":
                damage = 0;
                break;
            case "WindFamily":
                damage = 5;
                break;
            case "GroundFamily":
                damage = damage * 2;
                break;
        }
        int randomNum = (int) (Math.random() * (100 - 1 + 1)) + 1;
        switch (TypeUnit1) {
            case "Heler":
                if (randomNum == 5) {
                    damage = damage * 2;
                }
                break;
            case "DamageDealer":
                if (randomNum == 10) {
                    damage = damage * 3;
                } else {
                    damage = damage * 3 + 1;
                    System.out.println("Повышенная аттака");
                }

                break;
            case "Flang":
                if (randomNum == 15) {
                    damage = damage * 2;
                    if (TypeUnit2.equals("Heler")) {
                        damage = damage * 2;
                    }
                }
                if (TypeUnit2.equals("Heler")) {
                    damage = damage * 2;
                }
                break;
            case "Tank":
                if (randomNum == 3) {
                    damage = damage + weightV / heightV * 10;
                }
                break;
        }
        return (int) vhealth - damage;
    }

    public static void sayPhrase() {
        System.out.println("Ха-ха");
    }

    public static void loosehp(int health, int damagV, String TypeUnit1, String name, int hpV) {
        switch (TypeUnit1) {
            case "Heler":
                health = health + 4;
                break;
            case "Tank":
                damagV = 0;
                break;
        }
        if(health - damagV < 0) {
            System.out.println(name + " проиграл,здоровье- " + health + " меньше урона- " + damagV);
        } else if (health - damagV == 0) {
            System.out.println(name + " проиграл, здоровье : " + health + " равно урону: " + damagV);

        } else if (health - damagV < hpV) {
            System.out.println(name + " проиграл,здоровье - " + health + " меньше урона - " + damagV);
        } else if (health - damagV == hpV) {
            System.out.println(name + " ничья, здоровье : " + health + " равно урону: " + damagV);
        } else if (health - damagV > hpV) {
            System.out.println(name + " победил");
        }
    }

    public static void set(int health, int damage, String TypeUnit, String name,int weight, int height){
        System.out.println("Здоровье: " + health + " Урон: " + damage + " Тип: " + TypeUnit + " Имя: " + name + " Вес: " + weight + " Рост:" + height);
    }


}

