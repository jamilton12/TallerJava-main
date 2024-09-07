package taller;

public class Cancion {
    private String titulo;
    private String artista;
    private String genero;
    private String album;
    private int duracion;
    static final int SEGUNDOS_POR_MINUTO = 60;

    public Cancion() {
        titulo = "No hay titulo";
        artista = "Desconocido"; 
        genero = "Desconocido";
        album = "Desconocido";
        duracion = 0;       
    }
    public Cancion(String titulo, String artista, String genero, String album, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.album = album;
        this.duracion = duracion;
    }
    
    public int calcularDuracionMinutos() {
        int duracionMinutos = duracion / SEGUNDOS_POR_MINUTO ; 
        return duracionMinutos;
    }

    public void mostrarInformacion() {
        System.out.println("El nombre es: " + titulo + ", el artista es:" + artista + ", el genero de la cancion es: " + genero + ", el albun es: " + album + ", la duracion de la cancion es: " + duracion );
    }
    public void mostrarInformacion(String nomrbe) {
        System.out.println("El nombre es: " + titulo + ", el artista es:" + artista + ", el genero de la cancion es: " + genero + ", el albun es: " + album + ", la duracion de la cancion es: " + duracion + ", el nombre del ususario es: " +nomrbe );
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

}
