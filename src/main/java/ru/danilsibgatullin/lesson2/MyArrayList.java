package ru.danilsibgatullin.lesson2;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private int capacity = DEFAULT_CAPACITY;

    private Object[] arr ;

    private int currentCount=0;


    public MyArrayList() {
        this.arr = new Object[this.capacity];
    }

    @Override
    public void addToMyList(E e) {
        if (needGrow()) arrGrow();
        this.arr[currentCount]=e;
        this.currentCount++;
    }

    @Override
    public void removeFromMyList(E e) {
        while(this.isContains(e)){
            removeByIndex(findFirstIndex(e));
        }
    }

    @Override
    public E getItemFromMyListById(int i) {
        if (i<=this.currentCount) return (E)arr[i];
        return null;
    }

    @Override
    public boolean isContains(E e){
        for (int i=0; i < this.currentCount; i++) {
            if (this.arr[i].equals(e)) return true;
        }
        return false;
    }

    @Override
    public E getLast() {
        return (E)this.arr[currentCount-1];
    }

    @Override
    public E getFirst() {
        return (E)this.arr[0];
    }


    @Override
    public void removeByIndex(int i){
        Object[] bufArr =new Object[this.currentCount];
        int writeIndex=0;
        for(int index=0;index < this.currentCount;index++){
            if(index==i) writeIndex++;
            bufArr[index]=this.arr[writeIndex];
            writeIndex++;
        }
        this.currentCount-=1;
        this.arr=Arrays.copyOf(bufArr,this.capacity);
    }

    private boolean needGrow(){
        return !(this.currentCount < this.capacity-1);
    }

    private void arrGrow(){
        this.capacity *=2;
        this.arr = Arrays.copyOf(this.arr,this.capacity);
    }

    private int findFirstIndex(E e){
        for (int i=0; i < this.currentCount;i++){
            if (this.arr[i].equals(e)) return i;
        }
        return -1;
    }
}