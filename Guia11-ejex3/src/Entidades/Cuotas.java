/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author Joaquin
 */
public class Cuotas {
    private int nroCuota;
    private int montoTotalCuota;
    private boolean pagado;
    private Date fechaVencimiento;
    private String formaDePago;

    public Cuotas() {
    }

    
    
    public Cuotas(int nroCuota, int montoTotalCuota, boolean pagado, Date fechaVencimiento, String formaDePago) {
        this.nroCuota = nroCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.pagado = pagado;
        this.fechaVencimiento = fechaVencimiento;
        this.formaDePago = formaDePago;
    }

    public int getNroCuota() {
        return nroCuota;
    }

    public void setNroCuota(int nroCuota) {
        this.nroCuota = nroCuota;
    }

    public int getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(int montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }
    
    
}
