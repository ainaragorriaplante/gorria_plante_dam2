package examen.gorria.ainara.dao;

import java.util.ArrayList;

import examen.gorria.ainara.motores.MotorSQL;

public class AbstractDAO<T> implements DAO <T>{
    protected MotorSQL motorSQL;

    public AbstractDAO(MotorSQL motorSQL){
        this.motorSQL = motorSQL;
    }

    
    public AbstractDAO() {
    }


    @Override
    public void add(Object object) {
        
        
    }

    @Override
    public void delete(int id) {
        
        
    }

    @Override
    public Object find(int id) {
        
        return null;
    }

    @Override
    public ArrayList findAll() {
        
        return null;
    }

    @Override
    public void update(int id, Object object) {
        
    }
    
}
