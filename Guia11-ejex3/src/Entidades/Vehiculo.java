/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Joaquin
 */
public class Vehiculo {
    private String marca;
    private int modelo;
    private int anio;
    private int nroDeMotor;
    private String chasis;
    private String color;
    private String tipo;
    private Poliza poliza;
    private Cliente cliente;

    public Vehiculo() {
    }

    public Vehiculo(String marca, int modelo, int anio, int nroDeMotor, String chasis, String color, String tipo, Poliza poliza, Cliente cliente) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.nroDeMotor = nroDeMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
        this.poliza = poliza;
        this.cliente = cliente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNroDeMotor() {
        return nroDeMotor;
    }

    public void setNroDeMotor(int nroDeMotor) {
        this.nroDeMotor = nroDeMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    
    
}
