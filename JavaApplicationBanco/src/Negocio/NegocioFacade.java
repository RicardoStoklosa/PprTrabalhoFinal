package Negocio;

import DAO.*;
import EDA.*;
import java.util.ArrayList;
import java.util.Calendar;

public class NegocioFacade {

	static final DAOFacade registros = DAOMemoria.get();

	private NegocioFacade(){ }

	public static Administrador login(String login, String senha) {
		senha = Toolbox.encrypt( senha );
                Administrador adm = registros.login( login, senha );
                return adm;
	}

	public static Usuario loginBanco(String login, String senha) {
		senha = Toolbox.encrypt( senha );
                Usuario usr = registros.loginBanco( login, senha );
                return usr;
	}

	public static void deposito(double valor_deposito, Usuario usuario) {

	}

	public static void saque(Double valor_saque, Usuario usuario) {

	}

	public static boolean solicitarEmprestimo(Double valor_emprestimo, Usuario usuario) {
		return true;
	}

	public static void realizarEmprestimo(double valor_emprestimo, Usuario usuario) {

	}

	public static Operacao excluirCliente(Usuario usr) {
            Operacao status = new Operacao();
            boolean res = registros.excluirCliente(usr);
            if(!res)
                status.anexarErro("Erro ao deletar cliente");
            return status;
	}

	public static Operacao modificarCliente(Usuario usr) {
            Operacao status = new Operacao();
            boolean res = registros.modificarCliente(usr);
            if(!res)
                status.anexarErro("Erro ao alterar cliente");
            return status;
	}

	public static Operacao cadastrarCliente(Usuario usuario) {
            Operacao status = new Operacao( );
            //Calendar cal = Calendar.getInstance();
            if( usuario.getNome().length() <= 3 )
                status.anexarErro("O nome é muito curto");
            if( usuario.getEndereco().length() <= 3 )
                status.anexarErro("O endereço é muito curto");
            if( usuario.getCpf().length() < 11 )
                status.anexarErro("O Cpf não é valido");
            //if( usuario.getNasc()>=cal.get(Calendar.YEAR));
            //    status.anexarErro("Data de nacimento invalida");
            if( status.getStatus() ){
                boolean res = registros.cadastrarCliente(usuario);
            if( res == false )
                status.anexarErro("Erro ao registrar dados do usuário!");
            }
            return status;
	}

	public static boolean verificaDispSaldo(float Valor, Usuario usr) {
		return false;
	}

	public static ArrayList<Usuario> getContas() {
		return registros.getContas();
	}
        public static Usuario getConta(String cod){
            return registros.getConta(cod);
        }

	public static ArrayList<Administrador> getGerente(Administrador login) {
		return null;
	}

	public static ArrayList<Sacar> getSaques(Usuario cpf) {
		return null;
	}

	public static ArrayList<Depositar> getDepositos(Usuario cpf) {
		return null;
	}

	public static ArrayList<Emprestimo> getEmprestimos(Usuario cpf) {
		return null;
	}

}
