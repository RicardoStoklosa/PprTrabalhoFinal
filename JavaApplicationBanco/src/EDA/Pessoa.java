package EDA;
//corrigir

import java.util.Date;

public class Pessoa {

	private String nome;

	private String cpf;

	private int anoNasc;

	private String endereco;
        
        public Pessoa( String n, String c, int data, String end){
            nome = n;
            cpf = c;
            anoNasc = data;
            endereco = end;
        }

}
