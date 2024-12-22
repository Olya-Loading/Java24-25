public class Main {
    public static void main(String[] args) {
        FireFamily FireFamily = new FireFamily(10,2,2, "FireFamily","DamageDealer",3);
        WaterFamily WaterFamily = new WaterFamily(10,2,2, "WaterFamily","Heler",3);

        FireFamily.sayPhrase("FireFamily", "WaterFamily");
        FireFamily.set(10,5,"DamageDealer", "FireFamily",2,3);
        WaterFamily.set(10,5,"Heler", "WaterFamily",2,3);
        int a =(FireFamily.attack(10,5,"DamageDealer","Heler","WaterFamily",2,3));
        WaterFamily.loosehp(10,a,"Heler","WaterFamily",10);
        System.out.println(" ");

        GroundFamily GroundFamily = new GroundFamily(10,2,1, "GroundFamily","Flang",3);
        WaterFamily.sayPhrase("WaterFamily", "GroundFamily");
        WaterFamily.set(10,5,"Flang", "WaterFamily",2,3);
        GroundFamily.set(10,5,"Tank", "GroundFamily",2,1);
        int c = (WaterFamily.attack(10,5,"Flang","Tank","WaterFamily",2,1));
        GroundFamily.loosehp(10,c,"Tank","WaterFamily",10);
        System.out.println(" ");

        WindFamily WindFamily = new WindFamily(10,2,1, "WindFamily","Flang",3);
        WindFamily.sayPhrase("GroundFamily", "WindFamily");
        WindFamily.set(30,5,"Flang", "WindFamily",2,3);
        GroundFamily.set(10,5,"Flang", "GroundFamily",2,1);
        int u = (GroundFamily.attack(30,5,"Flang","Flang","WindFamily",2,3));
        WindFamily.loosehp(30,u,"Flang","WindFamily",10);

        System.out.println(" ");

        WindFamily.sayPhrase("WindFamily", "FireFamily");
        WindFamily.set(20,5,"Flang", "WindFamily",2,3);
        FireFamily.set(20,5,"DamageDealer", "FireFamily",2,1);
        int d = WindFamily.attack(20, 6,"Flang","DemageDealer","FireFamily",2,1);
        FireFamily.loosehp(20, d,"Flang","FireFamily",20);


    }
}