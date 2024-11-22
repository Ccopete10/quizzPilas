import java.util.Scanner;
import java.util.Stack;

public class operaciones {

    Scanner sc = new Scanner(System.in);

    public operaciones(){     
    }

    //Método que crea la pila y la llena
    public Stack<String> createStack(int n){
        if (n == 1) {
            Stack<String> stack = new Stack<>();
            return stack;

        }else{
            Stack<String> stack = new Stack<>();
            System.out.println("Ingrese el tamaño de la pila a crear: ");
            int x = sc.nextInt();
            for (int i = 0; i < x; i++) {
                System.out.println("Digite el caracter o número a ingresar a la pila:  ");
                stack.push(sc.next());   
            }
            return stack;
        }     
    }
    //Método que busca en una pila un caracter o número y valida que no haya una pila vacia
    //Tambien se valida que si no se encuentra el dato vuelve a pedir otro a buscar

    public void searching(Stack<String> stack){
        Stack <String> cloneStack = (Stack<String>) stack.clone();
        System.out.println("----------");
        System.out.println("Ingrese el caracter o número a buscar en la pila: ");
        String search = sc.next();
        if (stack.isEmpty()) {
            System.out.println("¡¡¡la pila esta vacia primero llenela!!!");
            Stack<String> newStack = createStack(2);
            searching(newStack);
        }else{
            int size = cloneStack.size();
            int count = 0;
            Stack<Integer> positions = new Stack<>();

            for (int i = 0; i < size; i++) {
                count ++;
                if (cloneStack.peek().equals(search)) {
                    System.out.println("El dato " + "\"" + search + "\"" + " esta en la posicion: " + count);
                    positions.push(count);
                    cloneStack.pop();
                }else{
                    cloneStack.pop();
                }
                
            }
            if (positions.isEmpty()) {
                System.out.println("No se encontro el dato que ingresaste");
                searching(stack);
            }      
        }
    }


}
