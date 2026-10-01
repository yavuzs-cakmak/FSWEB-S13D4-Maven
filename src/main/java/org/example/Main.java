package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());

        Player player1 = new Player("Yavuz",90,Weapon.SWORD);
        player1.loseHealth(30);
        player1.restoreHealth(35);
        System.out.println(player1.healthRemaining());
    }
}