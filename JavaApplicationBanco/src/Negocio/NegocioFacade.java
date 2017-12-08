package Negocio;

import DAO.*;
import EDA.*;
import java.math.BigDecimal;
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

	public static Operacao deposito(BigDecimal valor_deposito, Usuario usuario) {
            Operacao status = new Operacao();
            BigDecimal zero = new BigDecimal("0.00");
            if(valor_deposito.compareTo(zero)<=0){
                status.anexarErro("Valor Invalido!");
            }
            if(!status.getStatus())
                return status;
            else{
                Depositar depos = new Depositar(usuario,valor_deposito);
                boolean retorno = registros.deposito(depos);
                if(!retorno)
                    status.anexarErro("Erro em depositar");
            }
            return status;
	}

	public static Operacao saque(BigDecimal valor_saque, Usuario usuario) {
            Operacao status = new Operacao();
            BigDecimal zero = new BigDecimal("0.00");
            if(valor_saque.compareTo(zero)<=0){
                status.anexarErro("Valor Invalido!");
            }
            if(!status.getStatus())
                return status;
            else{
                Sacar saque = new Sacar(usuario,valor_saque);
                boolean retorno = registros.saque(saque);
                if(!retorno)
                    status.anexarErro("Saldo Indisponivel!");
            }
            return status;
	}

	public static Operacao emprestimo(Emprestimo emp) {
		Operacao status = new Operacao();
                boolean res = registros.emprestar(emp);
                if(!res)
                    status.anexarErro("Valor acima do limite");
                return status;
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

	public static ArrayList<Sacar> getSaques(Usuario usuario) {
            ArrayList<Sacar> saques = new ArrayList();
            for(Sacar aux : registros.getSaques()){
                if(aux.getUsuario()==usuario)
                    saques.add(aux);
                }
            return saques;
	}

	public static ArrayList<Depositar> getDepositos(Usuario usuario) {
		ArrayList<Depositar> depositos = new ArrayList();
                for(Depositar aux : registros.getDepositos()){
                    if(aux.getUsuario()==usuario)
                        depositos.add(aux);
                }
                return depositos;
                
	}

	public static ArrayList<Emprestimo> getEmprestimos(Usuario usuario) {
		ArrayList<Emprestimo> emp = new ArrayList();
                for(Emprestimo aux : registros.getEmprestimos()){
                    if(aux.getUsuario()==usuario)
                        emp.add(aux);
                }
                return emp;
	}

}
