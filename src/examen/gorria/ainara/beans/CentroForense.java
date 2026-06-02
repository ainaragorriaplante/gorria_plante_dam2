package examen.gorria.ainara.beans;

public class CentroForense {
    private int id_centro;
    private String nombre;
    private String pais;
    private int nivelSeguridad;

    //CONSTRUCTORES
    public CentroForense() {
    }

    public CentroForense(int id_centro, String nombre, String pais, int nivelSeguridad) {
        this.id_centro = id_centro;
        this.nombre = nombre;
        this.pais = pais;
        this.nivelSeguridad = nivelSeguridad;
    }

    //GETTER Y SETTER
    public int getId_centro() {
        return id_centro;
    }
    public void setId_centro(int id_centro) {
        this.id_centro = id_centro;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public int getNivelSeguridad() {
        return nivelSeguridad;
    }
    public void setNivelSeguridad(int nivelSeguridad) {
        this.nivelSeguridad = nivelSeguridad;
    }

    //TO STRING
    @Override
    public String toString() {
        return "CentroForense [id_centro=" + id_centro + ", nombre=" + nombre + ", pais=" + pais + ", nivelSeguridad="
                + nivelSeguridad + "]";
    }

    
}
