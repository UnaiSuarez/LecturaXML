package com.sergiojavierre.LecturaXML.dao.meses;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.sergiojavierre.LecturaXML.entities.Mes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class DAOMesesXML implements DAOMeses{
    @Override
    public List<Mes> readAll() {
        XmlMapper xmlMapper = new XmlMapper();
        try {
            String xml = new String(Files.readAllBytes(Path.of("meses.xml")));
            return xmlMapper.readValue(xml, new TypeReference<List<Mes>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
