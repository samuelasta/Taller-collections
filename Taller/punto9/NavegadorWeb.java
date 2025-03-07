package Taller.punto9;

import java.util.Stack;

public class NavegadorWeb {
    private Stack<String> historial;

    public NavegadorWeb() {
        historial = new Stack<>();
    }

    //visita una nueva página osea que se agrega al stack
    public void visitarPagina(String url) {
        historial.push(url);
        System.out.println("Visitaste: " + url);
    }

    //retroceder a la página anterior
    public void retroceder() {
        if (historial.size() > 1) {
            String paginaActual = historial.pop();
            System.out.println("Retrocediendo desde: " + paginaActual);
            System.out.println("Página actual: " + historial.peek());
        } else {
            System.out.println("No hay más páginas a las que retroceder.");
        }
    }
    public void mostrarHistorial() {
        System.out.println("Historial de navegación: " + historial);
    }

    public static void main(String[] args) {
        NavegadorWeb navegador = new NavegadorWeb();

        navegador.visitarPagina("google.com");
        navegador.visitarPagina("pornhub.com");
        navegador.visitarPagina("tiktok.com");

        navegador.mostrarHistorial();

        navegador.retroceder();
        navegador.mostrarHistorial();

        navegador.retroceder();
        navegador.mostrarHistorial();
    }
}

