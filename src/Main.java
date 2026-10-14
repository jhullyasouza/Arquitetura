import Controller.TarefaController;
import Controller.UsuarioController;
import Model.TarefaService;
import Model.UsuarioService;

void main() {
//Padrão MVC

    UsuarioService service = new UsuarioService();
    UsuarioController controller = new UsuarioController(service);
    TarefaService service1 = new TarefaService();
    TarefaController controller1 = new TarefaController(service1);

    controller.cadastrar();
    IO.println(controller.mostrar());

    controller.deletarr(7);

    controller.atualizar(5,"Nicolas");
    IO.println(controller.mostrar());


    //PARTE DAS TAREFAS ABAIXO



    controller.cadastrar();
    IO.println(controller.mostrar());

    controller.deletarr(7);

    controller.atualizar(5,"Nicolas");
    IO.println(controller.mostrar());

}
