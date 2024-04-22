public class Competidor extends Atleta {

    private String modalidade;
    private String pais;

    public Competidor (String modalidade, String pais, String nome, String genero, int idade, double altura, double peso) {
        super (nome, genero, idade, altura, peso);
        this.modalidade = modalidade;
        this.pais = pais;
    }

    public String getModalidade() {
        return modalidade;
    }
    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public String mostrarCompetidor () {
        return "---------Competidor-------\n" + "Modalidade: " + modalidade + "\nPais: " + pais + "\nNome: " + getNome() + "\nGenero: " + getGenero() + "\nIdade: " + getIdade() + "\nAltura: " + getAltura() + "\nPeso: " + getPeso();
    }

    

}
