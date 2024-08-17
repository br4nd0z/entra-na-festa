public class Festa {
    public void verificaEntrada(Pessoa pessoa) {

        int idade = pessoa.getIdade();

        if (pessoa.podeEntrarNaFesta()) {
            if (idade >= 18) {
                System.out.println("Liberado");
            } else {
                System.out.println("Permitido entrar acompanhado");
            }
        } else {
            System.out.println("Barrado");
        }
    }
}
