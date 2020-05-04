package com.test;

        import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Passport p1 = new Passport("BD", 147456);
        Passport p2 = new Passport("BE", 001001);
        Citizen n1 = new Citizen("Homer", "Simpson");
        Citizen n2 = new Citizen("Lisa", "Simpson");

        HashMap<Passport, Citizen> people = new HashMap<Passport, Citizen>();
        people.put(p1, n1);
        people.put(p2, n2);

        System.out.println(people.get(p1));
//		System.out.println(people.values());
    }

}

