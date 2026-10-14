package Model;
import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    private static int id = 1;
    List<Usuario> banco = new ArrayList<>();

    //CADASTRAR
    public void cadastrarUsuario(String nome, String email){
        Usuario usuario = new Usuario(id++, nome, email);
        banco.add(usuario);
    }

    //LISTAR
    public List<Usuario>ListarUsuario(){
        return banco;
    }

    public void deletarUsuario(int id){
        for(Usuario u : banco){
            if(u.getId() == id){
                banco.remove(u);
                IO.println("Pessoa excluida com sucesso!");
                break;
            }
        }
    }

    public void atualizarUsuario(int id, String nome){
        for(Usuario u : banco){
            if(u.getId() == id){
                u.setNome(nome);
                IO.println("Pessoa atualizada com sucesso!");
                break;
            }
        }
    }

}
