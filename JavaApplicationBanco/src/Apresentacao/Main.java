package Apresentacao;

import EDA.*;

/**
 * @author UDESC
 */
public class Main {
    public static Administrador adm;
    public static Usuario user;
    public static MenuAdm menuAdm;
    public static MenuCaixa menuCaixa;
    public static Login tela;
    
    private Main(){}
    
    public static void main(String args[]){
        tela = new Login();
        tela.setVisible( true );
    }
}