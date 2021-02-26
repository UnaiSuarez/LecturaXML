package com.sergiojavierre.LecturaXML.dao.moviles;

import com.sergiojavierre.LecturaXML.entities.Movil;

import java.util.List;

public interface DAOMoviles {
    public void save(List<Movil> movil);
    public List<Movil> read();
}
