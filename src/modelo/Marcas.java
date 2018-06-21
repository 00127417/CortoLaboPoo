/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 *
 */
public class Marcas {
    
    private String marca;
    private boolean existencia;
    private String coidgo;
    
    public Marcas(){}
    
    public Marcas(String marca, boolean existencia, String codigo){
        this.marca = marca;
        this.existencia = existencia;
        this.coidgo = codigo;
    }
    public Marcas(String marca, boolean existencia){
        this.marca = marca;
        this.existencia = existencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isExistencia() {
        return existencia;
    }

    public void setExistencia(boolean existencia) {
        this.existencia = existencia;
    }

    public String getCoidgo() {
        return coidgo;
    }

    public void setCoidgo(String coidgo) {
        this.coidgo = coidgo;
    }   
}
