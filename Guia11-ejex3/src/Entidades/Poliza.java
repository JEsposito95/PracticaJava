/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Entidades.Vehiculo;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Joaquin
 */
public class Poliza {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private int nroPoliza;
    private Date fechaInicio;
    private Date fechaFin;
    private Integer cantidadCuotas;
    private ArrayList <Cuotas> cuotas; 
    private String formaDePago;
    private int montoTotal;
    private boolean granizo;
    private int montoMaxGranizo;
    private String cobertura;

    public Poliza() {
    }

    public Poliza(Vehiculo vehiculo, Cliente cliente, int nroPoliza, Date fechaInicio, Date fechaFin, Integer cantidadCuotas, ArrayList<Cuotas> cuotas, String formaDePago, int montoTotal, boolean granizo, int montoMaxGranizo, String cobertura) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.nroPoliza = nroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantidadCuotas = cantidadCuotas;
        this.cuotas = cuotas;
        this.formaDePago = formaDePago;
        this.montoTotal = montoTotal;
        this.granizo = granizo;
        this.montoMaxGranizo = montoMaxGranizo;
        this.cobertura = cobertura;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNroPoliza() {
        return nroPoliza;
    }

    public void setNroPoliza(int nroPoliza) {
        this.nroPoliza = nroPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(Integer cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public ArrayList<Cuotas> getCuotas() {
        return cuotas;
    }

    public void setCuotas(ArrayList<Cuotas> cuotas) {
        this.cuotas = cuotas;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public int getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(int montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

   
    
}
