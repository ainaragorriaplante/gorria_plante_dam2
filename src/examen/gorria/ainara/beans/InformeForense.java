package examen.gorria.ainara.beans;

public class InformeForense {
    private int id_informe;
    private boolean adnPositivo;
    private int nivelRiesgo;
    private String conclusion;

    //CONSTRUCTORES
    public InformeForense() {
    }

    public InformeForense(int id_informe, boolean adnPositivo, int nivelRiesgo, String conclusion) {
        this.id_informe = id_informe;
        this.adnPositivo = adnPositivo;
        this.nivelRiesgo = nivelRiesgo;
        this.conclusion = conclusion;
    }

    //GETTER Y SETTER
    public int getId_informe() {
        return id_informe;
    }

    public void setId_informe(int id_informe) {
        this.id_informe = id_informe;
    }

    public boolean isAdnPositivo() {
        return adnPositivo;
    }

    public void setAdnPositivo(boolean adnPositivo) {
        this.adnPositivo = adnPositivo;
    }

    public int getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setNivelRiesgo(int nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    //TO STRING
    @Override
    public String toString() {
        return "InformeForense [id_informe=" + id_informe + ", adnPositivo=" + adnPositivo + ", nivelRiesgo="
                + nivelRiesgo + ", conclusion=" + conclusion + "]";
    }
}
