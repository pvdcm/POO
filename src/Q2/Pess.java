package Q2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pess {
    static Scanner scan = new Scanner(System.in);
    public void pess() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o CPF: ");
            String cpf = scanner.nextLine();

            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite o curso: ");
            String curso = scanner.nextLine();

            System.out.print("Digite a disciplina: ");
            String disciplina = scanner.nextLine();

            Aluno aluno = new Aluno(cpf, nome, idade, curso, disciplina);

            System.out.println("Dados do Aluno:");
            System.out.println("CPF: " + aluno.getCpf());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println("Disciplina: " + aluno.getDisciplina());
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de inserir os dados corretamente.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.print("\nAperter 'Enter' para continuar: ");
        scan.nextLine();
    }
}