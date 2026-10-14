package Controller;

import Model.TarefaService;
import Model.UsuarioService;

import java.util.List;

public class TarefaController {

    private final TarefaService tarefaService;
    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    public void cadastrarTarefas() {
        tarefaService.cadastrarTarefa("Julia",);

    }

    public List<?> mostrar() {
        return tarefaService.ListarTarefa();
    }

    public void deletarr(int id){
        tarefaService.deletarTarefa(id);
    }

    public void atualizar(int id, String nome){
        tarefaService.atualizarTarefa(id,nome);
    }

}
