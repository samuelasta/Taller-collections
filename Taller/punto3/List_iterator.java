package Taller.punto3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class List_iterator { //Crear una lista de elementos que no permite duplicados 
    //e imprima el contenido de la lista usando iteradores.
    
     Set <String> list;

    public List_iterator(Set<String> list) {
        this.list = list;
    }

    public void agregar(String e){
        list.add(e);
    }

    public Iterator<String> iterator() {
       return list.iterator();
    }
    //@Override
    //public String toString() {
           // return list.toString();
        //}
        public static void main(String[] args) {
            List_iterator list = new List_iterator(new TreeSet<>());
            list.agregar("perro");
            list.agregar("gato");
            list.agregar("perro"); // no lo va a agregar
            Iterator <String> iterator = list.iterator();
                        
            while(iterator.hasNext()){
                String auxIterator = iterator.next();
                System.out.println(auxIterator);
             }
        }
                    
}
