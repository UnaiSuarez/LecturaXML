package com.sergiojavierre.LecturaXML.controllers;


import com.sergiojavierre.LecturaXML.entities.Mes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sergiojavierre.LecturaXML.dao.DAOFactory;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MesesRestController {

    @RequestMapping("/meses")
    public String meses(){
        List<Mes> meses = DAOFactory.getInstance().getDaoMeses().readAll();
        List<String> nombreMeses = new ArrayList<>();
        for (int i = 0; i < meses.size(); i++) {
            nombreMeses.add(meses.get(i).getNombre());
        }
        return nombreMeses.toString();
    }

    @RequestMapping("/meses30")
    public String meses30(){
        List<Mes> meses = DAOFactory.getInstance().getDaoMeses().readAll();
        List<String> meses30 = new ArrayList<>();
        for (int i = 0; i < meses.size(); i++) {
            if (meses.get(i).getDias() >30){
                meses30.add(meses.get(i).toString());
            }

        }
        return meses30.toString();
    }

    @RequestMapping("/mesesO")
    public String mesesO(){
        List<Mes> meses = DAOFactory.getInstance().getDaoMeses().readAll();
        List<String> mesesO = new ArrayList<>();
        String nombre = null;
        for (int i = 0; i < meses.size(); i++) {
            if (meses.get(i).getNombre().contains("o")){
                mesesO.add(meses.get(i).toString());
            }
        }
        return mesesO.toString();
    }

}
