public class Atleta {

    private String nome;
    private String genero;
    private int idade;
    private double altura;
    private double peso;

    public Atleta(String nome, String genero, int idade, double altura, double peso) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
        
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String mostrarAtleta () {
        
        return "---------Atleta-------\n" + "Nome: " + getNome() + "\nGenero: " + getGenero() + "\nIdade: " + getIdade() + "\nAltura: " + getAltura() + "\nPeso: " + getPeso();
    }

}
