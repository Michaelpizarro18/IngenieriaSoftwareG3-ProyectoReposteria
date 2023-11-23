/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.examen.Controller;


public class Categoria {
    
    private int idcategoria;
    private int nombrecategoria;

    public Categoria() {
    }

    public Categoria(int idcategoria, int nombrecategoria) {
        this.idcategoria = idcategoria;
        this.nombrecategoria = nombrecategoria;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public int getNombrecategoria() {
        return nombrecategoria;
    }

    public void setNombrecategoria(int nombrecategoria) {
        this.nombrecategoria = nombrecategoria;
    }
    
    
    
    
}
