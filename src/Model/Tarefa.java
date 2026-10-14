package Model;

public class Tarefa {

    private int id;
    private Usuario responsavel;
    private String nome;
    private String descricao;

    public Tarefa(int id, String responsavel, String email, String descricao){

    }

    public Tarefa(int id, Usuario responsavel, String nome, String descricao) {
        this.id = id;
        this.responsavel = responsavel;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "\nTarefa{" +
                "id=" + id +
                ", responsavel=" + responsavel +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}' + "\n";
    }
}
