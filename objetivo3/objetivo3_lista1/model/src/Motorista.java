public class Motorista {
    private long id;
    private String nome;
    private String email;
    private String telefone;
    private Corrida corrida;

    public Motorista() {
    }

    public Motorista(long id, String nome, String email, String telefone, Corrida corrida) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.corrida = corrida;
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

    public Corrida getCorrida() {
        return corrida;
    }

    public void setCorrida(Corrida corrida) {
        this.corrida = corrida;
    }

    @Override
    public String toString() {
        return "Motorista{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", corrida=" + corrida +
                '}';
    }
}
