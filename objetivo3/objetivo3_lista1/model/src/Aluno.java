import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private long matricula;
    private String nome;
    private String sobrenome;
    private List<Disciplina> disciplinaList = new ArrayList<>();

    public Aluno() {
    }

    public Aluno(long matricula, String nome, String sobrenome) {
        this.matricula = matricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Aluno(long matricula, String nome, String sobrenome, List<Disciplina> disciplinaList) {
        this.matricula = matricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.disciplinaList = disciplinaList;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public List<Disciplina> getDisciplinaList() {
        return disciplinaList;
    }

    public void setDisciplinaList(List<Disciplina> disciplinaList) {
        this.disciplinaList = disciplinaList;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", disciplinaList=" + disciplinaList +
                '}';
    }
}
