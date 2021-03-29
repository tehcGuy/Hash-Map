package com.practice;
// Add the unique keys into the HashMap, and throw the message if the key already exists
// Prints the object names

/*TASKS
* 1. Polish semantics
* 2. ?Modify for loop
* 3. Rename class to HASHMAP presidents*/
public class Main {

    static HashM_pplCharacteristics presidents = new HashM_pplCharacteristics();
    static HashM_pplCharacteristics europePresidents = new HashM_pplCharacteristics();
    static HashM_pplCharacteristics test = new HashM_pplCharacteristics();


    public static void main(String[] args) {
        presidents.put("Biden", "Liberal");
        System.out.println(presidents.put("Biden", "US"));
        System.out.println(presidents.put("Biden", "Liberal"));

        System.out.println(europePresidents.put("Andrzej Duda", "Poland"));

        test.put("Kim Jin Ung", "NK");

        System.out.println(test.getPeopleCharacteristics());
        System.out.println(presidents.getPeopleCharacteristics());
        System.out.println(europePresidents.getPeopleCharacteristics());

    }
}
