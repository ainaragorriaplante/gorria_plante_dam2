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

import examen.gorria.ainara.beans.CentroForense;
import examen.gorria.ainara.motores.MotorSQL;
public class CentroForenseImpl extends AbstractDAO<CentroForense>{

    

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        super.delete(id);
    }

    @Override
    public CentroForense find(int id_centro) {
        // TODO Auto-generated method stub
        return find(id_centro);
    }

    @Override
    public ArrayList findAll() {
        // TODO Auto-generated method stub
        return super.findAll();
    }

    @Override
    public void update(int id_centro, CentroForense centroForense) {
        // TODO Auto-generated method stub
        super.update(id_centro, centroForense);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    public void add(CentroForense object) {
        // TODO Auto-generated method stub
        
    }

    public void check() {
        try {
             motorSQL.connect();
            if (motorSQL.conn != null &&
                    !motorSQL.conn.isClosed()) {
                System.out.println("CONEXION OK");
            }
        } 
        catch (Exception e) {
            printError(e);
        } finally {
            motorSQL.close();
        }
    }
}

