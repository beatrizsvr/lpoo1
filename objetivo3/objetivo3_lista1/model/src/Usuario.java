import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private long id;
    private String nome;
    private String email;
    private String telefone;
    private List<Corrida> corridaList = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(long id, String nome, String email, String telefone, List<Corrida> corridaList) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.corridaList = corridaList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Corrida> getCorridaList() {
        return corridaList;
    }

    public void setCorridaList(List<Corrida> corridaList) {
        this.corridaList = corridaList;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", corridaList=" + corridaList +
                '}';
    }
}
