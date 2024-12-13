/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RevisãoEventos;

import java.awt.TextArea;
import java.awt.TextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class ARevisãoEventos extends javax.swing.JFrame {
    
    public ARevisãoEventos(){
        JFrame frame = new JFrame("Minha janela");
        frame.setSize(1000,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        
        JButton botao1 = new JButton("Clique aqui");
        panel.add(botao1);
        
        JLabel texto1 = new JLabel("Este é meu texto");
        
        Icon icon = new ImageIcon(getClass().getResource("flecha.png"));
        texto1.setIcon(icon);
        panel.add(texto1);
        
        TextField campoTexto = new TextField("Escreva aqui");
        campoTexto.setEditable(false);
        panel.add(campoTexto);
        
        JTextArea comentario = new JTextArea("");
        comentario.append("Texto adicionado");
        panel.add(comentario);
        comentario.setLineWrap(true);
        comentario.setWrapStyleWord(true);
        panel.add(comentario);
    }
    
    public static void main(String[] args){
        ARevisãoEventos frame = new ARevisãoEventos();
        frame.setVisible(true);
    }
}
