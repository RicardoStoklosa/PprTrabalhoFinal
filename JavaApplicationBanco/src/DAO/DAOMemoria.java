//nosso
package DAO;

import java.util.ArrayList;
import EDA.*;

public class DAOMemoria implements DAOFacade{
        private static DAOMemoria memoria;
    
        private Administrador gerente;
	private ArrayList<Usuario> usuarios = new ArrayList();
	private ArrayList<Administrador> gerentes = new ArrayList();
        private ArrayList<Sacar> saques = new ArrayList();
        private ArrayList<Depositar> depositos = new ArrayList();
	private ArrayList<Emprestimo> emprestimos = new ArrayList();
	
	public static DAOMemoria get(){
            if( memoria == null )
                memoria = new DAOMemoria();
            return memoria;
        }
        
        private DAOMemoria() {
            init();
	}
        
        private void init(){
            gerente = new Administrador("adm","123");
        }

      
        @Override
	public Administrador login(String login, String senha) {
            if( gerente.getLogin().compareTo(login)==0  &&  gerente.getSenha().compareTo(senha)==0 )
                return gerente;
            return null;
	}

        @Override
	public Usuario loginBanco(String login, String senha) {
		return null;
	}

        @Override
	public boolean cadastrarCliente(Usuario usr) {
                return true;
	}

    /**
     *
     * @param valor_deposito
     * @param usuario
     */
    @Override
	public void deposito(double valor_deposito, Usuario usuario) {
                
	}

        @Override
	public void saque(Double valor_saque, Usuario usuario) {

	}

        @Override
	public void modificarCliente(Usuario usr) {
	}

        @Override
	public boolean verificaDispSaldo(float Valor, Usuario usr) {
		return false;
	}

        @Override
	public void excluirCliente(Usuario usr) {
	}
        
        @Override
        public boolean solicitarEmprestimo(Double valor_emprestimo, Usuario usuario){
            return true;
        }

        @Override
	public void realizarEmprestimo(double valor_emprestimo, Usuario usuario) {

	}
        
        @Override
        public ArrayList<Usuario> getContas(Administrador login) {
		return usuarios;
	}

        @Override
	public ArrayList<Administrador> getGerente(Administrador login) {
		return gerentes;
	}

        @Override
	public ArrayList<Sacar> getSaques(Usuario cpf) {
		return saques;
	}

        @Override
	public ArrayList<Depositar> getDepositos(Usuario cpf) {
		return depositos;
	}

        @Override
	public ArrayList<Emprestimo> getEmprestimos(Usuario cpf) {
		return emprestimos;
	}

}
