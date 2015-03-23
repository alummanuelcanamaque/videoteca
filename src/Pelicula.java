
import java.text.NumberFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Manuel Cañamaque
 */
public class Pelicula {
    private String titulo;
    private String director;
    private String año;    
    public static final int ANCHO_TITULO = 50;
    public static final int ANCHO_DIRECTOR = 50;
    public static final int ANCHO_AÑO = 50;

    public Pelicula(String titulo, String director, String ano) {
        this.titulo = titulo;
        this.director = director;
        this.año = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }    

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }
    
    
    public String peliculaToString() {
        String datos = "T: "+ titulo + " D:" + director + " A: " + año;
        return datos;
    }
    @Override
    public String toString() {
        
        String strTitulo = String.format("%"+ANCHO_TITULO+"s", titulo);        
        
        String strDirector = String.format(" %"+ANCHO_DIRECTOR+"s", director);
               
        String strAño = String.format(" %"+ANCHO_AÑO+"s", año);  
        
        return strTitulo+ strDirector + strAño;
    }
}
