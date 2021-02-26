package com.sergiojavierre.LecturaXML.controllers;

import com.sergiojavierre.LecturaXML.dao.DAOFactory;
import com.sergiojavierre.LecturaXML.entities.Movil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MovilController {

    @GetMapping("/movilesAndroid")
    public String readMovilesHTML(Model model){
        String sistem = "Android";
        List<Movil> moviles = DAOFactory.getInstance().getDaoMoviles().read();
        List<Movil> movilesAndroid = new ArrayList<>();
        for (int i = 0; i < moviles.size(); i++) {
            if (moviles.get(i).getSo().equals(sistem)){
                movilesAndroid.add(moviles.get(i));
            }
        }
        model.addAttribute("movilesAndroid",movilesAndroid);
        return "movilesAndroid";
    }

    @GetMapping("/moviles30")
    public String readmoviles30(Model model){
        List<Movil> moviles = DAOFactory.getInstance().getDaoMoviles().read();
        List<Movil> moviles30 = new ArrayList<>();
        for (int i = 0; i < moviles.size(); i++) {
            if (moviles.get(i).getPrecio() < 300){
                moviles30.add(moviles.get(i));
            }
        }
        model.addAttribute("moviles30",moviles30);
        return "moviles30";
    }

    @GetMapping("/movilesChina")
    public String movilesChina(Model model){
        List<Movil> moviles = DAOFactory.getInstance().getDaoMoviles().read();
        List<Movil> movilesChina = new ArrayList<>();
        for (int i = 0; i < moviles.size(); i++) {
            if (moviles.get(i).getFabricante().getPais().equals("China")){
                movilesChina.add(moviles.get(i));
            }
        }
        model.addAttribute("movilesChina",movilesChina);
        return "movilesChina";
    }

    @GetMapping("/allMoviles")
    public String allMoviles(Model model){
        List<Movil> moviles = DAOFactory.getInstance().getDaoMoviles().read();
        model.addAttribute("moviles",moviles);
        return "moviles";
    }


    @GetMapping("/busqueda")
    public String busqueda(@RequestParam(name = "id") int id, Model model){
        List<Movil> moviles = DAOFactory.getInstance().getDaoMoviles().read();
        List<Movil> busqueda = new ArrayList<>();
        for (int i = 0; i < moviles.size(); i++) {
            if (moviles.get(i).getId() == id){
                busqueda.add(moviles.get(i));
            }
        }
        model.addAttribute("busqueda",busqueda);
        return "busqueda";
    }


}
