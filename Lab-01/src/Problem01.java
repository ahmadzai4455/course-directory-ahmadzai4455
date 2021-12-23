import java.util.Scanner;
public class Problem01 {
    public static void main(String[] args) {
        MyStack items = new MyStackofInts();

        Scanner scanner = new Scanner(System.in);
        String item;
        while (scanner.hasNextLine()) {
            items.push(scanner.nextLine())
        }

        System.out.println(items.peek());

        while (items.size() > 1) {
            System.out.println(items.pop());
        }
        System.out.println( "The size of the stack is " +  items.size());
        System.out.println("At the top there is " + items.peek());
    }
}
