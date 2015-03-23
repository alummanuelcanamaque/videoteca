
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Manuel Cañamaque
 */
public class ListaPeliculas {
    ArrayList<Pelicula> listaPeliculas = new ArrayList();
    
    public void anadirPelicula(String titulo, String director, String año){
        Pelicula pelicula = new Pelicula(titulo, director, año);
        listaPeliculas.add(pelicula);
    }
    
    public void anadirPelicula (String titulo, String director, String año, int posicion){
        Pelicula pelicula = new Pelicula(titulo, director, año);
        if(posicion<listaPeliculas.size()){
            listaPeliculas.add(posicion, pelicula);
        }else{
            listaPeliculas.add(pelicula);
        }
    }
    public Object[] getListaPeliculas() {
        return listaPeliculas.toArray();
    }
    
    public void modificarListaPeliculas(String titulo, String director, String año, int posicion){
        Pelicula pelicula = new Pelicula(titulo, director, año);        
        listaPeliculas.set(posicion, pelicula);
    }
    public void borrarLineaPelicula(int index) {
        listaPeliculas.remove(index);        
    }
    
    public void borrarLineaPelicula(Pelicula pelicula) {
        listaPeliculas.remove(pelicula);        
    }
    public void borrarTodo(){
        listaPeliculas.clear();
    }
    public int[] buscar(String titulo){
        int[] index = new int[50];
        for (int i = 0; i < index.length; i++) {
                index[i]=-1;
        }
        int contador=0;
        for (int i = 0; i < listaPeliculas.size(); i++) {
            if(listaPeliculas.get(i).getTitulo().equals(titulo)){
               index[contador]=i;
               contador++;
            }
        }        
        return index;
    }    
    
}
