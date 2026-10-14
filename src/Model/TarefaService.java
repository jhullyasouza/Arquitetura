package Model;

import java.util.ArrayList;
import java.util.List;

public class TarefaService {
    private static int id = 1;
    List<Tarefa> banco = new ArrayList<>();

    public  TerefaService(UsuarioService usuarioService) {
        this.;
    }

    //CADASTRAR
    public void cadastrarTarefa(Usuario responsavel, String descricao){
        Tarefa tarefa = new Tarefa(id++, responsavel, descricao);
        banco.add(tarefa);
    }

    //LISTAR
    public List<Tarefa>ListarTarefa(){
        return banco;
    }

    public void deletarTarefa(int id){
        for(Tarefa f : banco){
            if(f.getId() == id){
                banco.remove(f);
                IO.println("Tarefa excluida com sucesso!");
                break;
            }
        }
    }

    public void atualizarTarefa(int id, String nome){
        for(Tarefa f : banco){
            if(f.getId() == id){
                f.setNome(nome);
                IO.println("Tarefa atualizada com sucesso!");
                break;
            }
        }
    }

}

