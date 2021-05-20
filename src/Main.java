import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberStack<Integer> stack=new NumberStack<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập số lượng phần tử muốn nhập");
          int index=scanner.nextInt();
          int i=1;
        System.out.println("nhập phần tử");
       while (i<=index){
            int number=scanner.nextInt();
            i++;
            stack.push(number);
        }
        NumberStack<Integer> stackNew=new NumberStack<>();
        System.out.println("Mảng đảo lại là");
        while (!stack.isEmpty()){
           stackNew.push(stack.pop());
        }
        while (!stackNew.isEmpty()) {
            System.out.printf(" %s", stackNew.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stackNew.size());
    }



    }

