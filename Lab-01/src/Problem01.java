import java.util.Scanner;
public class Problem01 {
    public static void main(String[] args) {
        MyStackofInts nums = new MyStackofInts();

        Scanner scanner = new Scanner(System.in);
        int num;
        while ((num = scanner.nextInt()) != 0) {
            nums.push(num);
        }

        System.out.println(nums.peek());

        while (!nums.isEmpty()) {
            System.out.println(nums.pop());
        }
        System.out.println( "The size of the stack is " +  nums.size());
        System.out.println("At the top there is " + nums.peek());
    }
}
