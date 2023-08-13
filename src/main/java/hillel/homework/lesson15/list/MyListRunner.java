package hillel.homework.lesson15.list;

public class MyListRunner {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        list.addLast("first");
        list.addLast("second");
        list.addLast("third");

        System.out.println(list);
        System.out.println("List size == " + list.size());

//        System.out.println("Element in position#1: " + list.get(20));

        System.out.println("Insert into middle");
        list.add(1, "fourth");
        System.out.println(list);
        list.add(4, "fifth");
        System.out.println(list);
    }
}
