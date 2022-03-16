package src.lab3_2;

import java.util.Arrays;
import java.util.Comparator;

public class Program {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];

        phones[0] = new Phone();
        phones[0].setAddress("Балашиха");
        phones[0].setCard_number(4000111122223333L);
        phones[0].setCredit(1000);
        phones[0].setDebit(500);
        phones[0].setId(1);
        phones[0].setIntercity_calls(0);
        phones[0].setIntracity_calls(50);
        phones[0].setLast_name("Santalov");
        phones[0].setName("Vadim");
        phones[0].setPatronymic("Evgenievich");

        phones[1] = new Phone();
        phones[1].setAddress("Птичное");
        phones[1].setCard_number(4000111122223333L);
        phones[1].setCredit(1000);
        phones[1].setDebit(500);
        phones[1].setId(1);
        phones[1].setIntercity_calls(10);
        phones[1].setIntracity_calls(500);
        phones[1].setLast_name("Eliseev");
        phones[1].setName("Octoslav");
        phones[1].setPatronymic("Mnogoslavovich");

        phones[2] = new Phone();
        phones[2].setAddress("Пущино");
        phones[2].setCard_number(4000111122223333L);
        phones[2].setCredit(1000);
        phones[2].setDebit(500);
        phones[2].setId(1);
        phones[2].setIntercity_calls(10);
        phones[2].setIntracity_calls(100);
        phones[2].setLast_name("Tarasov");
        phones[2].setPatronymic("Igorevich");
        phones[2].setName("Viktor");

        System.out.println("Пользователи, превысившие лимиты: ");
        intracityOverGiven(phones, 100);
        System.out.println("Пользователи, использовавшие междугородние звонки: ");
        intercityCallsUsed(phones);
        System.out.println("В алфавитном порядке");
        alphabetOrderUsers(phones);

        House[] houses = new House[3];
        houses[0] = new House();
        houses[0].setBuilding_type("Офисное");
        houses[0].setFloor(1);
        houses[0].setNumber(10);
        houses[0].setId(1);
        houses[0].setLifetime(20);
        houses[0].setRoom_count(10);
        houses[0].setSquare(150);
        houses[0].setStreet("Пушкина");

        houses[1] = new House();
        houses[1].setBuilding_type("Жилое");
        houses[1].setFloor(7);
        houses[1].setNumber(11);
        houses[1].setId(2);
        houses[1].setLifetime(15);
        houses[1].setRoom_count(5);
        houses[1].setSquare(100);
        houses[1].setStreet("Колотушкина");

        houses[2] = new House();
        houses[2].setBuilding_type("Жилое");
        houses[2].setFloor(3);
        houses[2].setNumber(15);
        houses[2].setId(3);
        houses[2].setLifetime(15);
        houses[2].setRoom_count(5);
        houses[2].setSquare(20);
        houses[2].setStreet("Улицына");

        System.out.println("Имеющие заданное число комнат: ");
        roomCountGiven(houses,5);
        System.out.println("Имеющие заданное число комнат и в диапазоне этажей: ");
        roomCountAndFloor(houses, 5, 4, 8);
        System.out.println("Превосходящие площадь: ");
        squareExceedsGiven(houses, 90);
    }

    public static void intracityOverGiven(Phone[] phones, int limit) {
        Arrays.stream(phones).filter(c -> c.getIntracity_calls() > limit).forEach(c -> System.out.println(c.toString()));
    }

    public static void intercityCallsUsed(Phone[] phones){
        Arrays.stream(phones).filter(c -> c.getIntercity_calls() > 0).forEach(c -> System.out.println(c.toString()));
    }

    public static void alphabetOrderUsers(Phone[] phones){
        Arrays.sort(phones, Comparator.comparing(a -> a.last_name));
        Arrays.stream(phones).forEach(c -> System.out.println(c.toString()));
    }

    public static void roomCountGiven(House[] houses, int count){
        Arrays.stream(houses).filter(c -> c.getRoom_count() == count).forEach(c -> System.out.println(c.toString()));
    }

    public static void roomCountAndFloor(House[] houses, int count, int bottom, int top){
        Arrays.stream(houses)
                .filter(c -> c.getRoom_count() == count)
                .filter(c -> c.getFloor() >= bottom)
                .filter(c -> c.getFloor() <= top)
                .forEach(c -> System.out.println(c.toString()));
    }

    public static void squareExceedsGiven(House[] houses, int square){
        Arrays.stream(houses).filter(c -> c.getSquare() > square).forEach(c -> System.out.println(c.toString()));
    }
}
