package com.sidgs.dao;


import com.sidgs.dao.jdbc.MemberDaoImplementation;

import java.io.IOException;

public class DAOFactory {

    private DAOFactory(){}

    static DAOFactory instance = null ;

    public static DAOFactory getInstance() {
        if( instance == null) instance = new DAOFactory();
        return instance;
    }

    MemberDao memberDao;

    public MemberDao getMemberDao() {
        if ( memberDao == null ) {
            try {
                memberDao = new MemberDaoImplementation();
                return memberDao;
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null ;
    }
}
