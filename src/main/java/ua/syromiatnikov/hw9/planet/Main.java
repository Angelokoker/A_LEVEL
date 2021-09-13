package ua.syromiatnikov.hw9.planet;

public class Main {
    public static void main(String[] args) {
        Earth earth = new Earth("Yes");
        System.out.println("AccelerationOfGravity " + earth.result);
        System.out.println("atmosphere " + earth.searchAtmosphere());
        System.out.println("getFreeFallAcceleration "+earth.getFreeFallAcceleration());
        Mercury mercury = new Mercury("No");
        System.out.println("AccelerationOfGravity " + mercury.result);
        System.out.println("atmosphere " + mercury.searchAtmosphere());
        Pluto pluto = new Pluto("Yes");
        System.out.println("AccelerationOfGravity " + pluto.result);
        System.out.println("atmosphere " + pluto.searchAtmosphere());
        Saturn saturn = new Saturn("Yes");
        System.out.println("AccelerationOfGravity " + saturn.result);
        System.out.println("atmosphere " + saturn.searchAtmosphere());

    }
}