package DAO;

import EDA.*;
import java.util.ArrayList;

public interface DAOFacade {

	public Administrador login(String login, String senha);
	public Usuario loginBanco(String login, String senha);
	public boolean deposito(Depositar deposito);
	public boolean saque(Sacar saque);
	public boolean emprestar(Emprestimo emprestimo);
        public boolean excluirCliente(Usuario usr);
	public boolean modificarCliente(Usuario usr);
	public boolean cadastrarCliente(Usuario usr);   
        public ArrayList<Usuario> getContas();
        public Usuario getUsuario(String cod);
        public Conta getConta(String cod);
	public ArrayList<Sacar> getSaques();
	public ArrayList<Depositar> getDepositos();
	public ArrayList<Emprestimo> getEmprestimos();

}