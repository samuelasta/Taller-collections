package Taller.punto4;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
// Cree una cola (Queue) que almacene objetos de tipo "Tarea" que tengan una
// prioridad asociada. Implemente la cola usando un PriorityQueue y defina la prioridad
// de cada tarea según su importancia.
import java.util.Queue;

public class Cola_Queue implements Queue<Tarea> {
    
    PriorityQueue<Tarea> cola;

    public Cola_Queue(PriorityQueue<Tarea> cola) {
        this.cola = cola;
    }
    public void agregarElemento(Tarea o){
        cola.add(o);
    }
    public static void main(String[] args) {

    Cola_Queue cola = new Cola_Queue(new PriorityQueue<>());
    Tarea tarea1 = new Tarea("tarea3", 1);
    Tarea tarea2 = new Tarea("tarea1", 4);
    Tarea tarea3 = new Tarea("tarea2", 2);

    cola.agregarElemento(tarea1);
    cola.agregarElemento(tarea2);
    cola.agregarElemento(tarea3);
    
    while(!cola.cola.isEmpty()){
        System.out.println(cola.cola.poll());
    }
     
    }
    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }
    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }
    @Override
    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }
    @Override
    public Iterator<Tarea> iterator() {
        return cola.iterator();
    }
    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }
    @Override
    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }
    @Override
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'containsAll'");
    }
    @Override
    public boolean addAll(Collection<? extends Tarea> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }
    @Override
    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }
    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
    }
    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }
    @Override
    public boolean add(Tarea e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    @Override
    public boolean offer(Tarea e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'offer'");
    }
    @Override
    public Tarea remove() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
    @Override
    public Tarea poll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'poll'");
    }
    @Override
    public Tarea element() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'element'");
    }
    @Override
    public Tarea peek() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }
}
