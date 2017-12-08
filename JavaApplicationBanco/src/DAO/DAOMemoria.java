//nosso
package DAO;

import java.util.ArrayList;
import EDA.*;
import java.math.BigDecimal;

public class DAOMemoria implements DAOFacade{
        private static DAOMemoria memoria;
    
        private Administrador gerente;
        private Usuario usuario;
	private ArrayList<Usuario> usuarios = new ArrayList();
        private ArrayList<Sacar> saques = new ArrayList();
        private ArrayList<Depositar> depositos = new ArrayList();
	private ArrayList<Emprestimo> emprestimos = new ArrayList();
        private ArrayList<Conta> saldos = new ArrayList();
	BigDecimal zero=new BigDecimal("0.00");
	public static DAOMemoria get(){
            if( memoria == null )
                memoria = new DAOMemoria();
            return memoria;
        }
        
        private DAOMemoria() {
            init();
	}
        
        private void init(){
            
            gerente = new Administrador("udesc", "785b10a64d56af61e802913738e7d567");
            Usuario usr1 = new Usuario("Ricardo", "12345678987", 1998,"joinville", "12345678987", "202cb962ac59075b964b07152d234b70",false);
            Usuario usr2 = new Usuario("jorge", "98765432123", 1998,"joinville", "98765432123", "202cb962ac59075b964b07152d234b70",true);
            usuarios.add(usr1);
            usuarios.add(usr2);
            saldos.add(new Conta(new BigDecimal("450.50"),usr1));
            saldos.add(new Conta(new BigDecimal("500.00"),usr2));
        }


    @Override
	public Administrador login(String login, String senha) {
            
            if( gerente.getLogin().compareTo(login)==0  &&  gerente.getSenha().compareTo(senha)==0 )
                return gerente;
            return null;
	}

        @Override
	public Usuario loginBanco(String login, String senha) {
            
            for( Usuario us : usuarios ){
                if(us.getLogin().compareTo(login)==0){
                    if( us.getLogin().compareTo(login)==0  &&  us.getSenha().compareTo(senha)==0 ) 
                        return us;
                    return null;
                }
             }
            return null;
	}

        @Override
	public boolean cadastrarCliente(Usuario usr) {
            for( Usuario us : usuarios ){
            if( us.getCpf()== usr.getCpf())
                return false;
            }
            saldos.add(new Conta(zero,usr));
            return usuarios.add( usr );
	}
        
       

    
        @Override
	public boolean deposito(Depositar depos) {
                for(Conta aux : saldos){
                    if(aux.getUsuario()==depos.getUsuario()){
                        BigDecimal soma = depos.getValorDeposito().add(aux.getSaldo());
                        System.out.println(soma);
                        saldos.add(new Conta(soma,depos.getUsuario()));
                        saldos.remove(aux);

                    }
                }
                return depositos.add(depos);
	}

        @Override
	public boolean saque(Sacar saque) {
            for(Conta aux : saldos){
                if(aux.getUsuario()==saque.getUsuario()){
                    BigDecimal sub = aux.getSaldo().subtract(saque.getValorSaque());
                    System.out.println(sub);
                    if(sub.compareTo(zero)==-1) 
                        return false;
                    saldos.add(new Conta(sub,saque.getUsuario()));
                    saldos.remove(aux);
                }
            }
            
            return saques.add(saque);
	}
        
        @Override
        public boolean emprestar(Emprestimo emprestimo){
            BigDecimal x=new BigDecimal("75000.00");
            BigDecimal y=new BigDecimal("25000.00");
            for(Conta aux : saldos){
                if(aux.getUsuario()==emprestimo.getUsuario()){
                    BigDecimal soma = aux.getSaldo().add(emprestimo.getValorEmprestimo());
                    if(aux.getUsuario().getJuri() && x.compareTo(emprestimo.getValorEmprestimo())>=0){
                        saldos.add(new Conta(soma,emprestimo.getUsuario()));
                        saldos.remove(aux);
                    }
                    else if(y.compareTo(emprestimo.getValorEmprestimo())>=0){
                        saldos.add(new Conta(soma,emprestimo.getUsuario()));
                        saldos.remove(aux);
                    }
                    else
                        return false;
                    
                }
            }
            
            return emprestimos.add(emprestimo);
	}

        @Override
	public boolean modificarCliente(Usuario usr) {
            for(Usuario aux : usuarios){
                if(aux.getCpf().compareTo(usr.getCpf())==0){
                    usuarios.remove(aux);
                    usuarios.add(usr);
                    return true;
                }
            }
            return false;
	}

        
        @Override
	public boolean excluirCliente(Usuario usr) {
            for(Usuario aux : usuarios){
                if(aux.getCpf().compareTo(usr.getCpf())==0){
                    usuarios.remove(aux);
                    return true;
                }
            }
            return false;
	}
        
        

        
        
        @Override
        public ArrayList<Usuario> getContas() {
		return usuarios;
	}
        public Usuario getUsuario(String cod){
            for(Usuario aux : usuarios){
                if(aux.getCpf().compareTo(cod)==0){
                    return aux;
                }
            }
            return null;
        }
        public Conta getConta(String cod){
            for(Conta aux : saldos){
                if(aux.getUsuario().getCpf().compareTo(cod)==0){
                    return aux;
                }
            }
            return null;
        }
        

        @Override
	public ArrayList<Sacar> getSaques() {
		return saques;
	}

        @Override
	public ArrayList<Depositar> getDepositos() {
		return depositos;
	}

        @Override
	public ArrayList<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

}
