import java.util.NoSuchElementException;

public class MyStackofInts {
  private int[] items;

  MyStackofInts(){
      items = new int[0];

  }

  int size() {
      return items.length;
  }
  boolean isEmpty() {
  return size() == 0;
  }
  void push(int item){
      int[] temp = new int[items.length + 1];
      for (int i= 0; i < items.length; i++){
          temp[i] = items[i];

      }
      temp[items.length - 1] = item;
      items = temp;
  }
  int pop() {
      if (items.length == 0)
          throw new NoSuchElementException();
  }
          int[] temp = new int[items.length -1];
  for (int i = 0; i < temp.length; i++){
      temp[i] = items[i];
  }
  int result = items[items.length = 1];
  items = temp;
  return result;

}
int peek(){
    if (isEmpty()) {
        throw new NoSuchElementException();
    }
    return items[items.length - 1];
    }
}