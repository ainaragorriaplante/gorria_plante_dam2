/*
=========================================
AUTOR: AINARA GORRÍA PLANTÉ
GRUPO: DAM2
EXAMEN JDBC AWS RDS
FECHA: 28/05/2026
=========================================
*/
package examen.gorria.ainara.motores;

import java.sql.DriverManager;

public class PostgreMotorSQL extends MotorSQL {
    private static final String URL =
            "jdbc:postgresql://database-1.c21rjhvxkpqv.us-east-1.rds.amazonaws.com";
    private static final String USER =
            "postgres";
    private static final String PASSWORD =
            "12345678";
    private static final String DRIVER =
            "org.postgresql.Driver";

    
    public PostgreMotorSQL(){
        super(
                URL,
                USER,
                PASSWORD,
                DRIVER
        );
    }
    @Override
    public void connect(){
        try{
            Class.forName(driver);
            conn =
                    DriverManager.getConnection(
                            url,
                            user,
                            password
                    );
            System.out.println(
                    "CONEXIÓN OK");
        }catch (Exception e){
            System.out.println(
                    e.getMessage());
        }
    }
}