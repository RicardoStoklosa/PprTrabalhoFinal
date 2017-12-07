package EDA;

import java.util.Date;

public class Usuario extends Pessoa{

	private String login;
	private String senha;
        public Usuario(String n, String c, int data,String endereco, String login, String senha) {
            super(n, c, data, endereco);
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

