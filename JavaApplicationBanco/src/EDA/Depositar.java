package EDA;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Depositar {

	private LocalDate data_deposito;

	private BigDecimal valor_deposito;

	private Usuario usuario;

    
    public Depositar(Usuario usu, BigDecimal valor) {
            usuario = usu;
            valor_deposito=valor;
            data_deposito=LocalDate.now();
    
	}
        public BigDecimal getValorDeposito(){
            return valor_deposito;
        }
        
        public LocalDate getData(){
            return data_deposito;
        }
        
        public Usuario getUsuario(){
            return usuario;
        }

}
