package com.sergiojavierre.LecturaXML.entities;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName="meses")
public class Mes {

    @JacksonXmlProperty(isAttribute = true)
    private String nombre;
    @JacksonXmlProperty(isAttribute = true)
    private Integer dias;

    public Mes(){}

    public Mes(String nombre, Integer dias) {
        this.nombre = nombre;
        this.dias = dias;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDias() {
        return dias;
    }

    @Override
    public String toString() {
        return "Mes{" +
                "nombre='" + nombre + '\'' +
                ", dias=" + dias +
                '}';
    }
}
