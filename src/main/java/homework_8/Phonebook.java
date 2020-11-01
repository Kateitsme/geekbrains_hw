package homework_8;

import java.util.*;

public class Phonebook {
    private HashMap<String, List<Integer>> phones;

    public Phonebook() {
        this.phones = new HashMap<>();
    }
    public void add(String surname, Integer number){
        if (phones.containsKey(surname)){
            List<Integer> numbers = phones.get(surname);
            numbers.add(number);
        }
        else phones.put(surname, new ArrayList<>(Arrays.asList(number)));

    }
    public List<Integer> get(String surname) {
        if (phones.containsKey(surname)) return phones.get(surname);
        else {
            System.out.println(String.format("В справочнике нет номера для фамилии %s", surname));
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        Phonebook book= new Phonebook();
        book.add("Иванов", 784512);
        book.add("Калинина", 451285);
        book.add("Воробьева", 741263);
        book.add("Ефремова", 954123);
        book.add("Романова", 743256);
        book.add("Воробьева", 123212);
        book.add("Ефремова", 415263);

        System.out.println(book.get("Воробьева"));
        System.out.println(book.get("Калинина"));
        System.out.println(book.get("Ефремова"));
        System.out.println(book.get("Антонов"));

    }
}
