import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira sua idade: ");
        int idade = scanner.nextInt();

        boolean temAcompanhante = false;


        if (idade >= 16 && idade <= 17) {
            System.out.print("Você tem acompanhante? (true/false): ");
            temAcompanhante = scanner.nextBoolean();
        }

        Pessoa pessoa = new Pessoa(idade, temAcompanhante);

        Festa festa = new Festa();

        festa.verificaEntrada(pessoa);

        scanner.close();
    }
}
