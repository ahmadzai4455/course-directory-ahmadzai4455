import java.util.NoSuchElementException;

public class MyStack {
  private Object[] items;

  MyStack(){
      items = new Object[0];

  }

  int size() {
      return items.length;
  }
  boolean isEmpty() {
  return size() == 0;
  }
  void push(Object item){
      Object[] temp = new Object[items.length + 1];
      for (int i= 0; i < items.length; i++){
          temp[i] = items[i];

      }
      temp[items.length - 1] = item;
      items = temp;
  }
  Object pop() {
      if (items.length == 0)
          throw new NoSuchElementException();
  }
          Object[] temp = new Object[][items.length -1];
  for (int i = 0; i < temp.length; i++){
      temp[i] = items[i];
  }
  Object result = items[items.length = 1];
  items = temp;
  return result;

}
Object peek(){
    if (isEmpty()) {
        throw new NoSuchElementException();
    }
    return items[items.length - 1];
    }
}