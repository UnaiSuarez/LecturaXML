package com.sergiojavierre.LecturaXML.controllers;

import com.sergiojavierre.LecturaXML.dao.DAOFactory;
import com.sergiojavierre.LecturaXML.entities.Fabricante;
import com.sergiojavierre.LecturaXML.entities.Movil;
import com.sergiojavierre.LecturaXML.entities.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MovilRestController {
    @RequestMapping("/lecturaMovilesString")
    public String readString(){
        return DAOFactory.getInstance().getDaoMoviles().read().toString();
    }
    @RequestMapping("/lecturaXMLMovil")
    public List<Movil> readXML(){
        return DAOFactory.getInstance().getDaoMoviles().read();
    }
    @RequestMapping("/escritura")
    public String write() {
        List<Movil> moviles = DAOFactory.getInstance().getDaoMoviles().read();
        Fabricante samnsung = new Fabricante("samsung","Corea del Sur");
        Movil s30 = new Movil(7,samnsung,"S30",123557,"Android");
        moviles.add(s30);
        DAOFactory.getInstance().getDaoMoviles().save(moviles);
        return "guardado";
    }
}
