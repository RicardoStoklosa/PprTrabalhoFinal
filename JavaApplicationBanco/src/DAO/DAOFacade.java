package DAO;

import EDA.*;
import java.util.ArrayList;

public interface DAOFacade {

	public Administrador login(String login, String senha);
	public Usuario loginBanco(String login, String senha);
	public void deposito(double valor_deposito, Usuario usuario);
	public void saque(Double valor_saque, Usuario usuario);
	public boolean solicitarEmprestimo(Double valor_emprestimo, Usuario usuario);
	public void realizarEmprestimo(double valor_emprestimo, Usuario usuario);
        public void excluirCliente(Usuario usr);
	public void modificarCliente(Usuario usr);
	public boolean cadastrarCliente(Usuario usr);
	public boolean verificaDispSaldo(float Valor, Usuario usr);      
	
        public ArrayList<Usuario> getContas(Administrador login);
	public ArrayList<Administrador> getGerente(Administrador login);
	public ArrayList<Sacar> getSaques(Usuario cpf);
	public ArrayList<Depositar> getDepositos(Usuario cpf);
	public ArrayList<Emprestimo> getEmprestimos(Usuario cpf);

}