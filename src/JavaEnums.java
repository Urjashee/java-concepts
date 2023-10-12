public class JavaEnums {

    public static void main(String[] args) {
        //        enum =  enumerated (ordered listing of items in a collection)
        //                grouping of constants but behave like objects and uppercase
        Planet planet = Planet.MARS;
        canILiveHere(planet);
    }

    static void canILiveHere(Planet planet) {
        switch(planet) {
            case EARTH:
                System.out.println("You can live here :)");
                System.out.println("This is planet #"+planet.number);
                break;

            default:
                System.out.println("You can't live here...yet");
                System.out.println("This is planet #"+planet.number);
                break;

        }
    }
}

enum Planet {
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8),
    PLUTO(9);

    int number;
    Planet(int number) {
        this.number = number;
    }

}