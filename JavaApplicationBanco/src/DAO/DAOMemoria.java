package DAO;

import java.util.ArrayList;
import EDA.Usuario;

public class DAOMemoria {

	private ArrayList<Usuario> contas;

	private ArrayList<Administrador> gerentes;

	private ArrayList<Sacar> saques;

	private ArrayList<Depositar> deposito;

	private ArrayList<Emprestimo> emprestimos;

	private DAOFacade dAOFacade;

	/**
	 *  
	 */
	private void DAOMemoria() {

	}

	public static DAOMemoria get() {
		return null;
	}

	public int verificarCredenciais(String login, string senha) {
		return 0;
	}

	public int verificarCredenciaisBanco(String login, string senha) {
		return 0;
	}

	public void cadastraCliente(int cl) {

	}

	public ArrayList<Usuario> getContas() {
		return null;
	}

	public ArrayList<Administrador> getGerente() {
		return null;
	}

	public ArrayList<Sacar> getSaques() {
		return null;
	}

	public ArrayList<Depositar> getDepositos() {
		return null;
	}

	public ArrayList<Emprestimo> getEmprestimos() {
		return null;
	}

	public void deposito(double valor_deposito, Usuario usuario) {

	}

	public void saque(Double valor_saque, Usuario usuario) {

	}

	public Void modificarCliente(Usuario usr) {
		return null;
	}

	/**
	 *  
	 */
	public Boolean cadastrarCliente(Usuario usr) {
		return null;
	}

	public boolean verificaDispSaldo(float Valor, Usuario usr) {
		return false;
	}

	public Void excluirCliente(Usuario usr) {
		return null;
	}

	public void realizarEmprestimo(double valor_emprestimo, Usuario usuario) {

	}

}
