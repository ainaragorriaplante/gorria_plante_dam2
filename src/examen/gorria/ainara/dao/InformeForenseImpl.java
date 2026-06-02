/*
=========================================
AUTOR: AINARA GORRÍA PLANTÉ
GRUPO: DAM2
EXAMEN JDBC AWS RDS
FECHA: 28/05/2026
=========================================
*/
package examen.gorria.ainara.dao;

import java.util.ArrayList;

import examen.gorria.ainara.beans.InformeForense;
import examen.gorria.ainara.motores.MotorSQL;

public class InformeForenseImpl extends AbstractDAO<InformeForense>{

    @Override
    public void add(InformeForense informeForense) {
        // TODO Auto-generated method stub
        super.add(informeForense);
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        super.delete(id);
    }

    @Override
    public InformeForense find(int id) {
        // TODO Auto-generated method stub
        return find(id);
    }

    @Override
    public ArrayList findAll() {
        // TODO Auto-generated method stub
        return super.findAll();
    }

    @Override
    public void update(int id, InformeForense informeForense) {
        // TODO Auto-generated method stub
        
    }
    
}
