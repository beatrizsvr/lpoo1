import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private long codigo;
    private String nome;
    private List<Aluno> alunoList = new ArrayList<>();

    public Disciplina() {
    }

    public Disciplina(long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Disciplina(long codigo, String nome, List<Aluno> alunoList) {
        this.codigo = codigo;
        this.nome = nome;
        this.alunoList = alunoList;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    public void setAlunoList(List<Aluno> alunoList) {
        this.alunoList = alunoList;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", alunoList=" + alunoList +
                '}';
    }
}
