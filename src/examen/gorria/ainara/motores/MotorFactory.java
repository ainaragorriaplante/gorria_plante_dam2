/*
=========================================
AUTOR: AINARA GORRÍA PLANTÉ
GRUPO: DAM2
EXAMEN JDBC AWS RDS
FECHA: 28/05/2026
=========================================
*/

package examen.gorria.ainara.motores;

public class MotorFactory {
    public static final String POSTGRE = "POSTGRE";
    public static MotorSQL create(String tipoMotor) {
        switch (tipoMotor) {
        case POSTGRE:
        return new PostgreMotorSQL();
        default:
                throw new IllegalArgumentException(
                        "Motor no soportado");
        }
    }
}
