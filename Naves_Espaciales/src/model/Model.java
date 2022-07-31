/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Luz Angela Melo
 */
public class Model {

    //ATRIBUTOS
    private Integer id;
    private String nombre;
    private String tipo;
    private String pais;
    private Double combustible;
    private Double empuje;

    //CONSTRUCTOR VACIO PARA AÑADIR REGISTROS
    public Model() {
    }

    //CONSTRUCTOR DE LA CLASE MODELO PARA GENERAR OBJETO
    public Model(Integer id, String nombre, String tipo, String pais, Double combustible, Double empuje) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.pais = pais;
        this.combustible = combustible;
        this.empuje = empuje;
    }

    //GETTERS & SETTERS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Double getCombustible() {
        return combustible;
    }

    public void setCombustible(Double combustible) {
        this.combustible = combustible;
    }

    public Double getEmpuje() {
        return empuje;
    }

    public void setEmpuje(Double empuje) {
        this.empuje = empuje;
    }

}
