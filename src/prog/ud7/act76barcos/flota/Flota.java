/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud7.act76barcos.flota;

import prog.ud7.act76barcos.Barco;
import prog.ud7.act76barcos.BarcoDeGuerra;
import prog.ud7.act76barcos.BarcoDePesca;

/**
 *
 * @author batoi
 */
public class Flota {

    private final Barco[] flota;
    private int cantidadBarcos;

    public Flota(int capacidad) {
        flota = new Barco[capacidad];
        cantidadBarcos = 0;
    }

    public void anyadirBarco(Barco barco) {
        if (!existeBarco(barco)) {
            if (cantidadBarcos < flota.length) {
                flota[cantidadBarcos++] = barco;
            }
        }
    }

    private boolean existeBarco(Barco barco) {
        for (int i = 0; i < flota.length; i++) {
            if (flota[i] != null && flota[i].equals(barco)) {
                return true;
            }
        }
        return false;
    }

    public void eliminarBarco(String matricula) {
        for (int i = 0; i < cantidadBarcos; i++) {
            if (flota[i].tieneMatricula(matricula)) {
                for (int j = i; j < cantidadBarcos - 1; j++) {
                    flota[j] = flota[j + 1];
                }
                flota[--cantidadBarcos] = null;
                break;
            }
        }
    }

    public void mostrarInfoBarco(String matricula) {
        boolean encontrado = false;
        for (int i = 0; i < cantidadBarcos; i++) {
            if (flota[i].tieneMatricula(matricula)) {
                System.out.println(flota[i]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No hay ningún barco con esa matrícula.");
        }
    }

    public void listarBarcos() {
        for (int i = 0; i < cantidadBarcos; i++) {
            System.out.println(flota[i]);
        }
    }

    public void listarBarcosDeGuerra() {
        for (int i = 0; i < cantidadBarcos; i++) {
            if (flota[i] instanceof BarcoDeGuerra) {
                System.out.println(flota[i]);
            }
        }
    }

    public void listarBarcosDePesca() {
        for (int i = 0; i < cantidadBarcos; i++) {
            if (flota[i] instanceof BarcoDePesca) {
                System.out.println(flota[i]);
            }
        }
    }
    
    public double calcularCostoMantenimiento() {
        double costoTotal = 0.0;
        for (int i = 0; i < cantidadBarcos; i++) {
            costoTotal += flota[i].calcularCostoMantenimiento();
        }
        return costoTotal;
    }

    public void aplicarMantenimientoGeneralizado() {
        for (int i = 0; i < cantidadBarcos; i++) {
            flota[i].realizarMantenimiento();
        }
    }
}
