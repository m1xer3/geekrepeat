package ru.danilsibgatullin.lesson2;

public interface MyList<E> {

    void addToMyList(E e);

    void removeFromMyList(E e);

    void removeByIndex(int i);

    E getItemFromMyListById(int i);

    boolean isContains(E e);

    E getLast();

    E getFirst();

}
