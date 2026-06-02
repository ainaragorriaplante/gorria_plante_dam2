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
