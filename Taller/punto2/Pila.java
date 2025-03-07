package Taller.punto2;
import java.util.Stack;

public class Pila { //Cree una pila (Stack) que pueda almacenar objetos de diferentes tipos y que solo
    // permite insertar elementos si el tipo del objeto coincide con el tipo del elemento en la
    // cima de la pila.
    
    private Stack<Object> stack;

    public Pila(){
        this.stack = new Stack<>();
    }

    public void push(Object o){
        if(stack.isEmpty() || o.getClass().equals(stack.peek().getClass())){
            stack.push(o);      
            System.out.println("se añadio con exito "+o);  
        }else{
            System.out.println("no se pudo añadir");
        }
    }

    public static void main(String[] args) {
        Pila pila = new Pila();

        pila.push("samuel");
        pila.push("sofia");
        pila.push("andres");
        pila.push(1);
       
    }

}
