public class Oceanarium {
    Shark shark = new Shark("Shark", 12,"White & Grey");
    Shark shark2 = new Shark("Hark", 12,"White & Grey");
    Shark shark3 = new Shark("Ark", 12,"White & Grey");
    Shark shark4 = new Shark("Rahk", 12,"White & Grey");
    Shark shark5 = new Shark("Krah", 12,"White & Grey");

    Shark[] sharks = new Shark[]{shark,shark2,shark3,shark4,shark5};

    Turtle turtle = new Turtle("Turtle", 65, "Green");
    Turtle turtle2 = new Turtle("Rtule", 65, "Green");
    Turtle turtle3 = new Turtle("Elut", 65, "Green");
    Turtle turtle4 = new Turtle("Urtel", 65, "Green");
    Turtle turtle5 = new Turtle("Turt", 65, "Green");

    Turtle[] turtles = new Turtle[]{turtle,turtle2,turtle3,turtle4,turtle5};

    Duck duck = new Duck("Duck", 7, "Yellow");
    Duck duck2 = new Duck("Uckey", 7, "Yellow");
    Duck duck3 = new Duck("Cuk", 7, "Yellow");
    Duck duck4 = new Duck("Doc", 7, "Yellow");
    Duck duck5 = new Duck("Cod", 7, "Yellow");

    Duck[] ducks = new Duck[]{duck,duck2,duck3,duck4,duck5};

    @Override
    public String toString() {
        return "В Океанариуме:" +
                "\n Акулы: \n\n"+sharks[0]+"\n"+"\n\n"+sharks[1]+"\n\n"+sharks[2]+"\n\n"+sharks[3]+"\n\n"+sharks[4]+"\n\n"+
                "\n Черепаха: \n\n"+turtles[0]+"\n\n"+turtles[1]+"\n\n"+turtles[2]+"\n\n"+turtles[3]+"\n\n"+turtles[4]+"\n\n"+
                "\n Утки: \n\n"+ducks[0]+"\n\n"+ducks[1]+"\n\n"+ducks[2]+"\n\n"+ducks[3]+"\n\n"+ducks[4]+"\n\n";

    }
}
