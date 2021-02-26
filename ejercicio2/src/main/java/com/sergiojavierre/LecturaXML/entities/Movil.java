package com.sergiojavierre.LecturaXML.entities;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import org.thymeleaf.spring5.processor.SpringInputGeneralFieldTagProcessor;

@JacksonXmlRootElement(localName="moviles")
public class Movil {
    @JacksonXmlProperty(isAttribute = true)
    private int id;

    private Fabricante fabricante;
    @JacksonXmlProperty(isAttribute = true)
    private String modelo;
    @JacksonXmlProperty(isAttribute = true)
    private int precio;
    @JacksonXmlProperty(isAttribute = true)
    private String so;

    public Movil(){}

    public Movil(int id, Fabricante fabricante, String modelo, int precio, String so) {
        this.id = id;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.so = so;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getSo() {
        return so;
    }

    public void setSO(String so) {
        this.so = so;
    }

    @Override
    public String toString() {
        return "Movil{" +
                "id=" + id +
                ", fabricante=" + fabricante +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", SO='" + so + '\'' +
                '}';
    }
}
