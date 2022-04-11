package nico;
import javax.swing.JOptionPane;
public class Nico {
    public static void main (String [] args) {
        String nome = JOptionPane.showInputDialog ("diga seu nome");
        JOptionPane.showMessageDialog (null, "Bem vindo, "+nome);
        String idade = JOptionPane.showInputDialog ("quantos anos voce tem");
        String msg = "Que top "+nome+", você tem "+idade+" anos.";
        JOptionPane. showMessageDialog (null, msg) ;
        String rl = JoptionPane.showInputDialog ("o que o pato falou pro outro pato");
        if(rl.equals ("quack")) {
             JOptionPane.showMessageDialog (null, "Acertou!");
        }
        else{
            JOptionPane.showMessageDialog (null, "Errou!");
        }
