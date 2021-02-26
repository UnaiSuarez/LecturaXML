package com.sergiojavierre.LecturaXML.dao.moviles;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.sergiojavierre.LecturaXML.entities.Movil;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class DAOMovilesXML implements DAOMoviles {
    @Override
    public void save(List<Movil> movil) {
        XmlMapper xmlMapper = new XmlMapper();
        try {
            xmlMapper.writeValue(new File("moviles.xml"), movil);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Movil> read() {
        List<Movil> moviles = null;
        XmlMapper xmlMapper = new XmlMapper();
        try {
            String xml = new String(Files.readAllBytes(Path.of("moviles.xml")));
            moviles = xmlMapper.readValue(xml, new TypeReference<List<Movil>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return moviles;
    }
}
