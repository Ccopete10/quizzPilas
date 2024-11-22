import java.util.Scanner;
import java.util.Stack;

public class punto_4 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        operaciones operations = new operaciones();

        System.out.println("Digite "+"\"1\"" + " si quiere crear una pila vacia o " + "\"2\"" + " si quiere crear una pila y llenarla: ");
        int n = sc.nextInt();

        while (n!=1 && n!=2) {
            System.out.println("Ingrese las opciones validas: ");
            n = sc.nextInt();
        }

        Stack<String> stack = operations.createStack(n);
        operations.searching(stack); 
    }
}