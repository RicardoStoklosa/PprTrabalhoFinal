package EDA;

public class Administrador{
	private String login;
	private String senha;
	private Gerenciar gerenciar;
        public Administrador(String l, String s) {
            this.login = login;
            this.senha = senha;
        }
    
    public String getLogin() {
        return login;
    }

    
    public String getSenha() {
        return senha;
    }
 
}
