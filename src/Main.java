//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
         int a =10;
         int b = 20;
        System.out.println("a:"+ a+"      b:"+ b);
        change(a,b);
        System.out.println("a:"+ a+"      b:"+ b);
        }

    public static void change(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    }
