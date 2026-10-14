package Controller;
import Model.UsuarioService;

import java.util.List;

public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public void cadastrar() {
        usuarioService.cadastrarUsuario("Julia", "juliakarolinny@gmail.com");
        usuarioService.cadastrarUsuario("Sthefany", "sthefany@gmail.com");
        usuarioService.cadastrarUsuario("Ester", "estersantina@gmail.com");
        usuarioService.cadastrarUsuario("Kimberli", "kimberli@gmail.com");
        usuarioService.cadastrarUsuario("Nicolas", "nicolasbernadito@gmail.com");
        usuarioService.cadastrarUsuario("Jhennyfer", "jhennyfersouza@gmail.com");
        usuarioService.cadastrarUsuario("David", "davidteles@gmail.com");
    }

    public List<?> mostrar() {
        return usuarioService.ListarUsuario();
    }

    public void deletarr(int id){
        usuarioService.deletarUsuario(id);
    }

    public void atualizar(int id, String nome){
        usuarioService.atualizarUsuario(id,nome);
    }

}
