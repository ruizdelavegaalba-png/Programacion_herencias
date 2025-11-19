import articulos.Articulo;
import articulos.Libro;
import articulos.Pelicula;
import articulos.AlbumMusica;
import articulos.VideoJuego;
import usuarios.Cliente;
import usuarios.Administrador;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Crear artículo
        Articulo articulo1 = new Articulo( "Botella", 2022, 20);
        Articulo articulo2 = new Articulo("Papel", 2022, 20);
        System.out.println(articulo1);
        System.out.println(articulo2);

        Libro l1 = new Libro("Un mundo feliz", 1937, 29, "Aldous Huxley", 310, Libro.Genero.FANTASIA);
        Libro l2 = new Libro("Sherlock Holmes", 1890, 21, "Julia Navarro", 150, Libro.Genero.MISTERIO);
        System.out.println(l1);
        System.out.println(l2);

        Pelicula p1 = new Pelicula("Inception", 2010, 2.0, "Nolan", 148);
        Pelicula p2 = new Pelicula("Titanic", 1997, 1.8, "Cameron", 195);
        System.out.println(p1);
        System.out.println(p2);

        AlbumMusica a1 = new AlbumMusica("Thriller", 1982, 5.7, "MJ", 9, false);
        AlbumMusica a2 = new AlbumMusica("Single X", 2020, 9.99, "DJ Max", 1, true);
        System.out.println(a1);
        System.out.println(a2);

        VideoJuego v1 = new VideoJuego("The Witcher 3", 2015, 8.5, "CDPR", "PC/PS4", 18);
        VideoJuego v2 = new VideoJuego("Minecraft", 2011, 1.0, "Mojang", "PC", 7);
        System.out.println(v1);
        System.out.println(v2);

        // Crear clientes
        Cliente c1 = new Cliente("juan", "Segura123456", 1, 2000,p1, 100);
        Cliente c2 = new Cliente("maria", "123456", 2, 2010, null, 101);
        System.out.println(c1);
        System.out.println(c2);

        // Crear administrador
        Administrador admin = new Administrador("adminterry", "123456", 3, 1980, Administrador.rol.JEFE);
        System.out.println(admin);

        // Asignar artículo
        admin.asignarArticulo(c2, v1);
        System.out.println("Artículo asignado a María: " + c2.getArticulo());


    }
}