/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.cliente;

import java.io.DataInputStream;
import java.io.OutputStream;
import javax.swing.JFileChooser;

/**
 *
 * @author william
 */
public class Arquivo {
    private OutputStream saida;
    private DataInputStream leitor;
    private JFileChooser file;
    
    public Arquivo(){
        this.file=new JFileChooser();
        this.leitor=null;
        this.saida=null;
    }
    
    public void EscolherArquivo(){
        int retorno=file.showSaveDialog(null);
        if(retorno==JFileChooser.APPROVE_OPTION){
            String arquivo=file.getSelectedFile().getAbsolutePath();
        }
        
    }
}
