package EDA;
//corrigir

import java.util.Date;

public class Pessoa {

	private String nome;

	private String cpf;

	private int anoNasc;

	private String endereco;
        
        private boolean juridico;
        
        public Pessoa( String n, String c, int data, String end,boolean jur){
            nome = n;
            cpf = c;
            anoNasc = data;
            endereco = end;
            juridico = jur;
        }
        public String getNome(){
            return nome;
        }
        
        public String getCpf(){
            return cpf;
        }
        
        public int getNasc(){
            return anoNasc;
        }
        
        public String getEndereco(){
            return endereco;
           
        }
        
        public boolean getJuri(){
            return juridico;
        }
        

}
