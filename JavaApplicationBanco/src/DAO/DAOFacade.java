package DAO;

import EDA.*;
import java.util.ArrayList;

public interface DAOFacade {

	public Administrador login(String login, String senha);
	public Usuario loginBanco(String login, String senha);
	public boolean deposito(Depositar deposito);
	public void saque(Double valor_saque, Usuario usuario);
	public boolean solicitarEmprestimo(Double valor_emprestimo, Usuario usuario);
	public void realizarEmprestimo(double valor_emprestimo, Usuario usuario);
        public boolean excluirCliente(Usuario usr);
	public boolean modificarCliente(Usuario usr);
	public boolean cadastrarCliente(Usuario usr);
	public boolean verificaDispSaldo(float Valor, Usuario usr);      
	
        public ArrayList<Usuario> getContas();
        public Usuario getConta(String cod);
	public ArrayList<Administrador> getGerente(Administrador login);
	public ArrayList<Sacar> getSaques(Usuario cpf);
	public ArrayList<Depositar> getDepositos();
	public ArrayList<Emprestimo> getEmprestimos(Usuario cpf);

}