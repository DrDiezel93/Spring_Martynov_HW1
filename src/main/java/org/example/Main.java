package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Evgeny", "Martynov", 30);
        Person person2 = new Person("Evgeny", "Martynov2", 30);
        System.out.println(person);
        System.out.println(person2);
        System.out.println(person.equals(person2));
        System.out.println(person.equals2(person2));
        System.out.println(person.hashCode());
        System.out.println(person.hashCode2());
        System.out.println(person.hashCode3());

        Gson gson = new Gson();
        // Сериализация объекта — преобразование объекта `Person` в строку JSON
        String jsonString = gson.toJson(person);
        System.out.println("Converting Person object to JSON string:\n" + jsonString);

        // Десериализовать объект — преобразовать строку JSON обратно в объект `Person`
        Person p = gson.fromJson(jsonString, Person.class);
        System.out.println("\nConverting JSON string to Person object:\n" + p.toString());

        System.out.println(p.equals(person));

        System.out.println(person.hashCode());
        System.out.println(p.hashCode());
    }
}