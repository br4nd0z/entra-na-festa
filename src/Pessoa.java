public class Pessoa {
    private int idade;
    private boolean temAcompanhante;

    public Pessoa(int idade, boolean temAcompanhante) {
        this.idade = idade;
        this.temAcompanhante = temAcompanhante;
    }

    public int getIdade() {
        return idade;
    }

    public boolean podeEntrarNaFesta() {
        if (idade >= 18) {
            return true;
        } else if (idade >= 16) {
            return temAcompanhante;
        } else {
            return false;
        }
    }
}
