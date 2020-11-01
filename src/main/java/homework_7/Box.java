package homework_7;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> list = new ArrayList<>();
    public double getWeight(){
        if (list.size()==0)
            return 0;
        double weight = 0;
        for(T box : list)
            weight += box.getWeight();
        return weight;
    }
    public boolean compare(Box <?> anotherBox) {
        // <?> добавили, чтобы в бокс нельзя было добавить элементы
        //anotherBox.addFruit(new Apple(),new Orange()); не сработает
        return this.getWeight() == anotherBox.getWeight();
    }
    public void move(Box <T> anotherBox){
        //T потому что может пересыпать фрукты одного вида
        anotherBox.list.addAll(list);
        list.clear();
    }
    public void addFruit(T fruit, int amount){
        for(int i=0;i<amount;i++){
            list.add(fruit);
        }
    }

    public static void main(String[] args) {
        Box<Orange> oranges_1 = new Box<>();
        Box<Orange> oranges_2 = new Box<>();
        Box<Apple> apples_1 = new Box<>();
        Box<Apple> apples_2 = new Box<>();
        oranges_1.addFruit(new Orange(),5);
        oranges_2.addFruit(new Orange(),4);
        apples_1.addFruit(new Apple(),9);
        apples_2.addFruit(new Apple(),3);
        System.out.println("Коробка oranges_1 весом " +oranges_1.getWeight());
        System.out.println("Коробка oranges_2 весом "+oranges_2.getWeight());
        System.out.println("Коробка oranges_1 весом "+apples_1.getWeight());
        System.out.println("Коробка oranges_2 весом "+apples_2.getWeight());
        System.out.println("Вес коробки oranges_1 больше apples_1 ? "+oranges_1.compare(apples_1));
        System.out.println("Вес коробки oranges_2 больше apples_2 ? "+oranges_2.compare(apples_2));
        oranges_1.move(oranges_2);
        apples_1.move(apples_2);
        System.out.println("Коробка oranges_1 весом "+oranges_1.getWeight());
        System.out.println("Коробка oranges_2 весом "+oranges_2.getWeight());
        System.out.println("Коробка oranges_1 весом "+apples_1.getWeight());
        System.out.println("Коробка oranges_2 весом "+apples_2.getWeight());
    }
}

