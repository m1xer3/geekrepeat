package ru.danilsibgatullin.lesson2;

public class Main {
    public static void main(String[] args) {

        MyList<String> list = new MyArrayList();

        MyList<Integer> linkedList = new MyLinkedList<>();

        list.addToMyList("1");
        list.addToMyList("2");
        list.addToMyList("150");
        list.addToMyList("150");
        list.addToMyList("3");
        list.addToMyList("4");
        list.addToMyList("5");
        list.addToMyList("6");
        list.addToMyList("150");

        System.out.println(list.isContains("150"));

        list.removeFromMyList("1");

        System.out.println(list.isContains("150"));

        System.out.println(list.getFirst());
        System.out.println(list.getLast());


        linkedList.addToMyList(17);
        linkedList.addToMyList(12);
        linkedList.addToMyList(17);
        linkedList.addToMyList(13);
        linkedList.addToMyList(17);
        linkedList.addToMyList(14);
        linkedList.addToMyList(15);
        linkedList.addToMyList(16);
        linkedList.addToMyList(14);
        linkedList.addToMyList(17);

        System.out.println("--------------------");
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.getFirst());
        linkedList.removeByIndex(6);
        linkedList.removeByIndex(0);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        linkedList.removeFromMyList(17);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

    }
}