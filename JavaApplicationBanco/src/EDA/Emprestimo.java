package EDA;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Emprestimo {

	private BigDecimal emprestimo;

	private LocalDate dataEmprestimo;
        
        private Usuario user;

	public Emprestimo(Usuario usr, BigDecimal valor) {
		emprestimo = valor;
                dataEmprestimo = LocalDate.now();
                user =usr;
	}
        public BigDecimal getValorEmprestimo(){
            return emprestimo;
        }
        
        public LocalDate getData(){
            return dataEmprestimo;
        }
        
        public Usuario getUsuario(){
            return user;
        }
	

}
