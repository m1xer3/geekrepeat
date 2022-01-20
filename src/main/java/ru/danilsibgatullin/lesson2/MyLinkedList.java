package ru.danilsibgatullin.lesson2;

public class MyLinkedList<E> implements MyList<E> {

    private ListMember<E> firstMember;

    private ListMember<E> currentMember;

    private ListMember<E> lastMember;


    @Override
    public void addToMyList(E e) {
        if(this.firstMember==null){
            this.firstMember=new ListMember<>(null,e,null);
            this.currentMember=this.firstMember;
            this.lastMember=this.firstMember;
        }
        else{
            ListMember<E> addMember = new ListMember<>(this.currentMember,e,null);
            this.currentMember.nextMember = addMember;
            this.currentMember=addMember;
            this.lastMember=this.currentMember;
        }
    }


    @Override
    public void removeFromMyList(E e) {
        if(isContains(e)){
            ListMember<E> iterableMember =this.firstMember;
            while (iterableMember!=null){
                if(e.equals(iterableMember.memberValue)) {
                    if(iterableMember==this.firstMember) deleteFirst();
                    else if(iterableMember==this.lastMember) deleteLast();
                    else delete(iterableMember);
                }
                iterableMember=iterableMember.nextMember;
            }
        }
    }

    @Override
    public void removeByIndex(int i) {
        removeFromMyList(getItemFromMyListById(i));
    }

    @Override
    public E getItemFromMyListById(int i) {
        int counter =0;
        ListMember<E> iterableMember =this.firstMember;
        while (iterableMember!=null){
            if(counter==i) return iterableMember.memberValue;
            iterableMember=iterableMember.nextMember;
            counter++;
        }
        return null;
    }

    @Override
    public boolean isContains(E e) {
        ListMember<E> iterableMember =this.firstMember;
        while (iterableMember!=null){
            if(e.equals(iterableMember.memberValue)) return true;
            iterableMember=iterableMember.nextMember;
        }
        return false;
    }

    public E getLast(){
        return this.lastMember.memberValue;
    }

    public E getFirst(){
        return this.firstMember.memberValue;
    }


    private void deleteFirst(){
        ListMember<E> nextMember = this.firstMember.nextMember;
        nextMember.prevMember=null;
        this.firstMember=nextMember;
    }

    private void deleteLast(){
        ListMember<E> prevMember = this.lastMember.prevMember;
        prevMember.nextMember=null;
        this.lastMember=prevMember;
    }

    private void delete(ListMember<E> iterableMember){
        ListMember<E> prevIterableMember;
        ListMember<E> nextIterableMember;
        prevIterableMember= iterableMember.prevMember;
        nextIterableMember = iterableMember.nextMember;
        prevIterableMember.nextMember=nextIterableMember;
        nextIterableMember.prevMember=prevIterableMember;
    }





    private static class ListMember<E> {
        E memberValue;
        ListMember<E> prevMember;
        ListMember<E> nextMember;



        public ListMember( ListMember<E> prevMember, E memberValue, ListMember<E> nextMember) {
            this.memberValue = memberValue;
            this.prevMember = prevMember;
            this.nextMember = nextMember;
        }
    }
}
