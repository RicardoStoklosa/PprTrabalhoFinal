<<<<<<< HEAD
package negocio;

import DAO.*;
import EDA.*;
import java.util.ArrayList;

public class NegocioFacade {

	static final DAOFacade registros = (DAOFacade) DAOMemoria.get();

	private NegocioFacade(){ }

	public static boolean login(String login, String senha) {
		return true;
	}

	public static boolean loginBanco(String login, String senha) {
		return true;
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

	public static void excluirCliente(Usuario usr) {
	}

	public static void modificarCliente(Usuario usr) {
	}

	/**
	 *  
	 */
	public static boolean cadastrarCliente(Usuario usr) {
		return true;
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
=======
package negocio;

import DAO.*;
import EDA.*;
import java.util.ArrayList;

public class NegocioFacade {

	static final DAOFacade registros = DAOMemoria.get();

	private NegocioFacade(){ }

	public static boolean login(String login, String senha) {
		return true;
	}

	public static boolean loginBanco(String login, String senha) {
		return true;
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

	public static void excluirCliente(Usuario usr) {
	}

	public static void modificarCliente(Usuario usr) {
	}

	public static boolean cadastrarCliente(Usuario usr) {
		return true;
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
>>>>>>> 01f2181cb1ae729ea91cf3bf7c517a424b6b8864
