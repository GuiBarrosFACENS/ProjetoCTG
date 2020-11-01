
package ctg;

import CtgDAO.ConnectionModule;
import javax.swing.JOptionPane;


public class Ctg {

    public static void main(String[] args) {
        
       ConnectionModule.getConexao();
       int sair = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja sair?","Atenção",JOptionPane.YES_NO_OPTION);  
    }
    
}
