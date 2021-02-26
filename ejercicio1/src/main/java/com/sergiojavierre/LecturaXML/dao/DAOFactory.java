package com.sergiojavierre.LecturaXML.dao;

import com.sergiojavierre.LecturaXML.dao.meses.DAOMeses;
import com.sergiojavierre.LecturaXML.dao.meses.DAOMesesXML;
import com.sergiojavierre.LecturaXML.dao.users.DAOUsers;
import com.sergiojavierre.LecturaXML.dao.users.DAOUsersXML;

public class DAOFactory {

    private static DAOFactory daoFactory;

    private DAOUsers daoUsers;
    private DAOMeses daoMeses;

    private DAOFactory(){}

    public static DAOFactory getInstance() {
        if(daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public DAOUsers getDaoUsers() {
        if(daoUsers == null){
            daoUsers = new DAOUsersXML();
        }
        return daoUsers;
    }

    public DAOMeses getDaoMeses() {
        if(daoMeses == null){
            daoMeses = new DAOMesesXML();
        }
        return daoMeses;
    }
}
