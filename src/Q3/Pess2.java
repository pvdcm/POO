package Q3;

import java.util.Scanner;

public class Pess2 {
    static Scanner scan = new Scanner(System.in);
    public void pess2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o curso: ");
        String curso = scanner.nextLine();

        System.out.print("Digite a quantidade de disciplinas: ");
        int quantidadeDisciplinas = scanner.nextInt();
        scanner.nextLine();

        Disciplina[] disciplinas = new Disciplina[quantidadeDisciplinas];
        for (int i = 0; i < quantidadeDisciplinas; i++) {
            System.out.print("Digite o nome da disciplina " + (i + 1) + ": ");
            String nomeDisciplina = scanner.nextLine();
            disciplinas[i] = new Disciplina(nomeDisciplina);
        }

        Q3.Aluno2 aluno = new Q3.Aluno2(cpf, nome, idade, curso, disciplinas);

        System.out.println("\nDados do Q2.Q3.Aluno:");
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Disciplinas:");
        for (Disciplina disciplina : aluno.getDisciplinas()) {
            System.out.println("- " + disciplina.getNome());
        }

        System.out.print("\nAperter 'Enter' para continuar: ");
        scan.nextLine();
    }
}