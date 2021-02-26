package com.sergiojavierre.LecturaXML.dao;
import com.sergiojavierre.LecturaXML.dao.moviles.DAOMoviles;
import com.sergiojavierre.LecturaXML.dao.moviles.DAOMovilesXML;
import com.sergiojavierre.LecturaXML.dao.users.DAOUsers;
import com.sergiojavierre.LecturaXML.dao.users.DAOUsersXML;

public class DAOFactory {

    private static DAOFactory daoFactory;

    private DAOUsers daoUsers;

    private DAOMoviles daoMoviles;


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

    public DAOMoviles getDaoMoviles(){
        if (daoMoviles == null){
            daoMoviles = new DAOMovilesXML();
        }
        return daoMoviles;
    }
}
