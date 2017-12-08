package EDA;

import java.math.BigDecimal;

public class Conta{

	private final BigDecimal saldo;

        private final Usuario usuario;
       
        public Conta(BigDecimal s, Usuario usr){
            saldo = s;
            usuario = usr;
        }
        
        public BigDecimal getSaldo(){
            
            return saldo;
        }
        
        public Usuario getUsuario(){
            return usuario;
        }
        
       
        
        
                

}
