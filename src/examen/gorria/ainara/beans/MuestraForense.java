package examen.gorria.ainara.beans;

public class MuestraForense {
    private int id_muestra;
    private int codigoCaso;
    private String tipoMuestra;
    private String fechaRecogida;
    private boolean estadoCustodia;
    private CentroForense centro;
    private InformeForense informe;

    //CONSTRUCTORES
    public MuestraForense() {
    }

    public MuestraForense(int id_muestra, int codigoCaso, String tipoMuestra, String fechaRecogida,
            boolean estadoCustodia, CentroForense centro, InformeForense informe) {
        this.id_muestra = id_muestra;
        this.codigoCaso = codigoCaso;
        this.tipoMuestra = tipoMuestra;
        this.fechaRecogida = fechaRecogida;
        this.estadoCustodia = estadoCustodia;
        this.centro = centro;
        this.informe = informe;
    }

    //GETTER Y SETTER
    public int getId_muestra() {
        return id_muestra;
    }

    public void setId_muestra(int id_muestra) {
        this.id_muestra = id_muestra;
    }

    public int getCodigoCaso() {
        return codigoCaso;
    }

    public void setCodigoCaso(int codigoCaso) {
        this.codigoCaso = codigoCaso;
    }

    public String getTipoMuestra() {
        return tipoMuestra;
    }

    public void setTipoMuestra(String tipoMuestra) {
        this.tipoMuestra = tipoMuestra;
    }

    public String getFechaRecogida() {
        return fechaRecogida;
    }

    public void setFechaRecogida(String fechaRecogida) {
        this.fechaRecogida = fechaRecogida;
    }

    public boolean isEstadoCustodia() {
        return estadoCustodia;
    }

    public void setEstadoCustodia(boolean estadoCustodia) {
        this.estadoCustodia = estadoCustodia;
    }

    public CentroForense getCentro() {
        return centro;
    }

    public void setCentro(CentroForense centro) {
        this.centro = centro;
    }

    public InformeForense getInforme() {
        return informe;
    }

    public void setInforme(InformeForense informe) {
        this.informe = informe;
    }

    //TO STRING
    @Override
    public String toString() {
        return "MuestraForense [id_muestra=" + id_muestra + ", codigoCaso=" + codigoCaso + ", tipoMuestra="
                + tipoMuestra + ", fechaRecogida=" + fechaRecogida + ", estadoCustodia=" + estadoCustodia + ", centro="
                + centro + ", informe=" + informe + "]";
    }    
}
