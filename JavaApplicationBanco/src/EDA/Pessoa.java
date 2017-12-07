package EDA;
//corrigir

import java.util.Date;

public class Pessoa {

	private String nome;

	private int cpf;

	private int cnpj;

	private Date dataNasc;

	private String endereco;
        
        public Pessoa( String n, int c, Date data, String end){
            nome = n;
            cpf = c;
            dataNasc = data;
            endereco = end;
        }

}
