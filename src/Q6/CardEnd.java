package Q6;

import java.util.Scanner;

public class CardEnd {
    static Scanner scan = new Scanner(System.in);
    public void cardEnd() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o telefone:");
        String telefone = scanner.nextLine();

        System.out.println("Digite o email:");
        String email = scanner.nextLine();

        System.out.println("Digite a data de aniversário:");
        String dataAniversario = scanner.nextLine();

        System.out.println("Digite o endereço:");
        String endereco = scanner.nextLine();

        CadernoDeEnderecos caderno = new CadernoDeEnderecos(nome, telefone, email, dataAniversario, endereco);

        System.out.println("\nInformações do caderno de endereços:");
        System.out.println("Nome: " + caderno.getNome());
        System.out.println("Telefone: " + caderno.getTelefone());
        System.out.println("Email: " + caderno.getEmail());
        System.out.println("Data de Aniversário: " + caderno.getDataAniversario());
        System.out.println("Endereço: " + caderno.getEndereco());

        System.out.print("\nAperter 'Enter' para continuar: ");
        scan.nextLine();
    }
}