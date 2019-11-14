// Author Carlos Torres <ct059489@gmail.com>
package com.flota.flotavehiculos;

import javax.persistence.*;

@Entity
@Table(name = "Vehiculo")
public class Vehiculo {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String placa;
    @Column
    private String marca;
    @Column
    private String referenciaVehi;
    @Column
    private int modelo;
    @Column
    private int idtipoV;


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    } 
      public String getReferencia() {
        return referenciaVehi;
    }

    public void setReferencia(String referenciaVehi) {
        this.referenciaVehi = referenciaVehi;
    }    

      public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    } 

     public int getIdtipovehi() {
        return idtipoV;
    }

    public void setIdtipovehi(int idtipoV) {
        this.idtipoV = idtipoV;
    }
    
}
