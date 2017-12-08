package EDA;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Sacar {

	private LocalDate data_saque;

	private BigDecimal valor_saque;

	private Usuario usuario;

	public Sacar(Usuario usu, BigDecimal valor) {
            usuario = usu;
            valor_saque=valor;
            data_saque=LocalDate.now();
    
	}
        public BigDecimal getValorSaque(){
            return valor_saque;
        }
        
        public LocalDate getData(){
            return data_saque;
        }
        
        public Usuario getUsuario(){
            return usuario;
        }
	

}
