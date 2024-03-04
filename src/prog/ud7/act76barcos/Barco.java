/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud7.act76barcos;

import prog.ud7.act76barcos.cualidadesBarcos.TipoBarco;
import prog.ud7.act76barcos.cualidadesBarcos.Data;
import java.util.Objects;

/**
 *
 * @author batoi
 */
public abstract class Barco {

    private final TipoBarco tipo;
    private final String nombre;
    private final String matricula;
    private final int anyoConstruccion;
    private final Data fecha_compra;
    private int horasMantenimiento;

    public Barco(TipoBarco tipo, String nombre, String matricula, int anyoConstruccion, Data fecha_compra) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.matricula = matricula;
        this.anyoConstruccion = anyoConstruccion;
        this.fecha_compra = fecha_compra;
        this.horasMantenimiento = 0;
    }

    @Override
    public String toString() {
        return ("Tipo de barco: " + this.tipo + ", nombre: " + this.nombre + ", matricula: " + this.matricula + ", año de construcción: " + this.anyoConstruccion + ", horas de mantenimiento: " + this.horasMantenimiento);
    }

    protected abstract double getCostoMantenimiento();
    
    protected abstract int getNumHorasMantenimiento();

    public void realizarMantenimiento() {
        this.horasMantenimiento += this.getNumHorasMantenimiento();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Barco other = (Barco) obj;
        return Objects.equals(this.matricula, other.matricula);
    }


    public boolean tieneMatricula(String matricula) {
        if (matricula.equals(this.matricula)) {
            return true;
        } else {
            return false;
        }

    }

    public double calcularCostoMantenimiento() {
        return this.getCostoMantenimiento() * this.horasMantenimiento;
    }

}
