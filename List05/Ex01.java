package List05;

class Hacker {
  public static void main(String[] args) {
    Usuario usuario = new Usuario();
    UsuarioProtegido usuarioProtegido = new UsuarioProtegido();

    // Sem o uso do encapsulamento, o usuario pode ser hackeado
    usuario.login = "hackeado@gmail.com";
    usuario.senha = "nova_senha_hackeada";

    // Com o encapsulamento isso não é possível (ERROR)
    // usuarioProtegido.login = "tentativa_fustrada@gmail.com";
    // usuarioProtegido.senha = "hack_falhou";
  }
}

class Usuario {
  String login = "email@gmail.com";
  String senha = "123456";

  String getLogin() {
    return login;
  }

  String getSenha() {
    return senha;
  }
}

class UsuarioProtegido {
  private String login = "email@gmail.com";
  private String senha = "123456";

  String getLogin() {
    return login;
  }

  String getSenha() {
    return senha;
  }
}