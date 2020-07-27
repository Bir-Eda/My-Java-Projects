package ocaquestionsvp3;

public class Q166Planet {
    public String name;
    public int moons;
    public Q166Planet(String name, int moons){
        this.name=name;
        this.moons=moons;
    }

    public static void main(String[] args) {
       Q166Planet []planets={
              new Q166Planet("Mercury", 0),
               new Q166Planet("Venus", 0),
               new Q166Planet("Earth", 1),
               new Q166Planet("Mars", 2),
       } ;
        System.out.println(planets);
        System.out.println(planets[3].name);
        System.out.println(planets[0].moons);
      //  System.out.println();
    }
}

