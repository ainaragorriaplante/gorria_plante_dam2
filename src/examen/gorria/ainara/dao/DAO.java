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

public interface DAO<T> {
    void add(T object);
    void update(int id, T object);
    void delete(int id);
    T find(int id);
    ArrayList<T> findAll();
}