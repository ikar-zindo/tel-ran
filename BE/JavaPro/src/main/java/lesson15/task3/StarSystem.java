package lesson15.task3;

public class StarSystem {
   public static void main(String[] args) {

      Planet earth = new Planet("Earth");
      earth.addSatellite(new Satellite("Moon"));

      Planet mars = new Planet("Mars");
      mars.addSatellite(new Satellite("Phobos"));
      mars.addSatellite(new Satellite("Deimos"));

      Star sun = Star.getInstance();
      sun.addPlanet(earth);
      sun.addPlanet(mars);

      sun.addPlanet(new Planet("Mercury"));
      sun.addPlanet(new Planet("Venus"));

      sun.addAsteroid(new Asteroid(1));
      sun.addAsteroid(new Asteroid(2));
      sun.addAsteroid(new Asteroid(3));
      sun.addAsteroid(new Asteroid(4));
      sun.addAsteroid(new Asteroid(5));
      sun.addAsteroid(new Asteroid(6));

      System.out.println();

      Star anotherStar = Star.getInstance();

      System.out.println();

      System.out.println("Сравниваем хэш-коды");
      System.out.println(sun.hashCode());
      System.out.println(anotherStar.hashCode());

      System.out.println("Сравниваем объекты по ссылкам: " + (sun == anotherStar));
   }
}
