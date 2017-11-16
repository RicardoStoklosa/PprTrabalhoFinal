package negocio;

import DAO.*;
import EDA.*;
import java.util.ArrayList;

public class NegocioFacade {

	static final DAOFacade registros = (DAOFacade) DAOMemoria.get();

	private NegocioFacade(){ }

	public static Boolean login(String login, String senha) {
		return null;
	}

	public static Boolean loginBanco(String login, String senha) {
		return null;
	}

	public static void deposito(double valor_deposito, Usuario usuario) {

	}

	public static void saque(Double valor_saque, Usuario usuario) {

	}

	public static Boolean solicitarEmprestimo(Double valor_emprestimo, Usuario usuario) {
		return null;
	}

	public static void realizarEmprestimo(double valor_emprestimo, Usuario usuario) {

	}

	public static Void excluirCliente(Usuario usr) {
		return null;
	}

	public static Void modificarCliente(Usuario usr) {
		return null;
	}

	/**
	 *  
	 */
	public static Boolean cadastrarCliente(Usuario usr) {
		return null;
	}

	public static boolean verificaDispSaldo(float Valor, Usuario usr) {
		return false;
	}

	public static ArrayList<Usuario> getContas(Administrador login) {
		return null;
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
