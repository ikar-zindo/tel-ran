package lesson11_stack_and_queue.task4;

public interface MyDeque {

   void addToHead(Integer element);
   void addToTail(Integer element);
   Integer removeHead();
   Integer removeTail();
   Integer peekHead();
   Integer peekTail();
   boolean isEmpty();
   Integer getByIndex(int index);
   boolean contains(Integer element);
   int size();

   /*
   void grow();
   int calculateNewCapacity()int currentCapacity);
   int calculateAdditionalCapacity()int currentCapacity);
    */
}
