package Taller.punto8;
import java.util.Vector;

public class EditorTexto {
    private Vector<String> cambiosTexto;

    public EditorTexto() {
        cambiosTexto = new Vector<>();
    }

    // agrega un cambio al historial
    public void agregarCambio(String cambio) {
        cambiosTexto.add(cambio);
        System.out.println("cambio agregado: " + cambio);
    }

    // deshace el ultimo cambio 
    public void deshacerCambio() {
        if (!cambiosTexto.isEmpty()) {
            String ultimoCambio = cambiosTexto.remove(cambiosTexto.size() - 1);
            System.out.println("cambio deshecho: " + ultimoCambio);
        } else {
            System.out.println("no hay cambios para deshacer");
        }
    }

    // muestra el historial de cambios
    public void mostrarHistorial() {
        System.out.println("historial de cambios: " + cambiosTexto);
    }

    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();

        editor.agregarCambio("primer cambio");
        editor.agregarCambio("nuevo texto");
        editor.agregarCambio("ahora un nuevo texto");

        editor.mostrarHistorial();
        // elimina "ahora un nuevo texto"
        editor.deshacerCambio(); 
        editor.mostrarHistorial();
        
        // elimina "nuevo texto"
        editor.deshacerCambio(); 
        editor.mostrarHistorial();
    }
}

