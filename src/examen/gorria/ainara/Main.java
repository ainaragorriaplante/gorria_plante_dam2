package examen.gorria.ainara;

import examen.gorria.ainara.motores.MotorFactory;

public class Main{
    public static void Main (String[] args){
    PeliculaDAOImpl peliculaDAO =
                new PeliculaDAOImpl(MotorFactory.
                        create(
                                MotorFactory.POSTGRE));
        peliculaDAO.check();
        // Prueba Unitaria: ADD
    }
}