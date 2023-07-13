package Q3;

public class Pessoa2 {
    private String cpf;
    private String nome;
    private int idade;

    public Pessoa2(String cpf, String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

class Aluno2 extends Q3.Pessoa2 {
    private String curso;
    private Disciplina[] disciplinas2;

    public Aluno2(String cpf, String nome, int idade, String curso, Disciplina[] disciplinas) {
        super(cpf, nome, idade);
        this.curso = curso;
        this.disciplinas2 = disciplinas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas2;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas2 = disciplinas;
    }
}

class Disciplina {
    private String nome;

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

