package Taller.punto11;

import java.util.LinkedHashSet;

public class AppMusica {
    
    private LinkedHashSet<String> cancionesFavoritas;

    public AppMusica() {
        cancionesFavoritas = new LinkedHashSet<>();
    }

    //agrega una canción a favoritos 
    public void agregarCancion(String cancion) {
        if (cancionesFavoritas.add(cancion)) {
            System.out.println("se agrego la cancion a favoritos: " + cancion);
        } else {
            System.out.println("La canción: " + cancion + " ya esta en favoritos");
        }
    }

    public void mostrarFavoritos() {
        System.out.println("canciones favoritas: " + cancionesFavoritas);
    }

    public static void main(String[] args) {
        AppMusica favoritos = new AppMusica();

        favoritos.agregarCancion("Bohemian Rhapsody - Queen");
        favoritos.agregarCancion("Imagine - John Lennon");
        favoritos.agregarCancion("Shape of You - Ed Sheeran");

        favoritos.mostrarFavoritos();

        favoritos.agregarCancion("Bohemian Rhapsody - Queen"); // Intento de duplicado
        favoritos.mostrarFavoritos();
    }
}
