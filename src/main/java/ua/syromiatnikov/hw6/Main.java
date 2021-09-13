package ua.syromiatnikov.hw6;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone(063635, "Nokia", 0.250);
        Phone phone3 = new Phone(052352, "Siemens");
        phone1.number = 21313442;
        phone1.model = "Motorola";
        phone1.weight = 0.170;
        phone3.weight = 0.190;
        System.out.println("phone1 number " + phone1.number);
        System.out.println("phone1 model " + phone1.model);
        System.out.println("phone1 weight " + phone1.weight);
        System.out.println(phone2.fillingTheTelephone());
        System.out.println(phone3.fillingTheTelephone());
        phone1.receiveCall("Artem ");
        phone2.receiveCall("Artem1 ");
        phone3.receiveCall("Artem2 ");
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
    }
}