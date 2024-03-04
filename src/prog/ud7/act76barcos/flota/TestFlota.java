/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud7.act76barcos.flota;

import prog.ud7.act76barcos.BarcoDeGuerra;
import prog.ud7.act76barcos.BarcoDePesca;
import prog.ud7.act76barcos.cualidadesBarcos.Data;

/**
 *
 * @author batoi
 */
public class TestFlota {
    public static void main(String[] args) {
        BarcoDeGuerra barco1 = new BarcoDeGuerra("Missiling", "AAAA", 2012, new Data(), 0, 0, "Lanza cohetes", "Detector misiles", "Bombardero");
        BarcoDeGuerra barco2 = new BarcoDeGuerra("Naviero feroz", "BBBB", 2013, new Data(), 0, 0, "Bombardero", "Lanza cohetes", "Detector misiles");
        BarcoDeGuerra barco3 = new BarcoDeGuerra("Tiatomic", "CCCC", 2014, new Data(), 0, 0, "Lanza cohetes", "Detector misiles", "Machete");
        BarcoDeGuerra barco4 = new BarcoDeGuerra("Hunter", "DDDD", 2015, new Data(), 0, 0, "Lanza granadas", "Detector misiles");
        BarcoDeGuerra barco5 = new BarcoDeGuerra("Terrorific", "EEEE", 2016, new Data(), 0, 0, "Bombardero", "Detector misiles");
        BarcoDePesca barco6 = new BarcoDePesca("Sardina Express", "SE-123", 2005, new Data(), 0, 80);
        BarcoDePesca barco7 = new BarcoDePesca("Pez Payaso", "PP-456", 2010, new Data(), 0, 70);
        BarcoDePesca barco8 = new BarcoDePesca("Calamar Cautivador", "CC-789", 2018, new Data(), 0, 85);
        BarcoDePesca barco9 = new BarcoDePesca("Bacalao Bromista", "BB-101", 2008, new Data(), 0, 75);
        BarcoDePesca barco10 = new BarcoDePesca("Atún Travieso", "AT-234", 2015, new Data(), 0, 65);

        Flota flota = new Flota(10);
        flota.anyadirBarco(barco1);
        flota.anyadirBarco(barco2);
        flota.anyadirBarco(barco3);
        flota.anyadirBarco(barco4);
        flota.anyadirBarco(barco5);
        flota.anyadirBarco(barco6);
        flota.anyadirBarco(barco7);
        flota.anyadirBarco(barco8);
        flota.anyadirBarco(barco9);
        flota.anyadirBarco(barco10);

        System.out.println("------ Todos Los Barcos --------");
        flota.listarBarcos();
        System.out.println("------------------------");

        System.out.println("------ Coste de mantenimiento actual --------");
        System.out.printf("El coste mensual en mantenimiento es %.2f €\n", flota.calcularCostoMantenimiento());
        System.out.println("------------------------");

        System.out.println("------ Mantenimiento generalizado --------");
        flota.aplicarMantenimientoGeneralizado();
        System.out.printf("El coste mensual en mantenimiento es %.2f €\n", flota.calcularCostoMantenimiento());
        System.out.println("------------------------");

        System.out.println("------ Todos los barcos de guerra --------");
        flota.listarBarcosDeGuerra();

        System.out.println("------ Todos los barcos pesqueros --------");
        flota.listarBarcosDePesca();

        System.out.println("------ Eliminar barco con matrícula PP-456 y mostrar todos los barcos --------");
        flota.eliminarBarco("PP-456");
        flota.listarBarcos();
    }
}




