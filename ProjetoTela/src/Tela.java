import java.awt.Color;
import javax.swing.*;
import java.awt.*;

public class Tela {

	public static void main(String[] args) {
		
		JButton btBotao;
		btBotao = new JButton("Inserir");
		JButton btBotao2 = new JButton("Salvar");
		JButton btBotao3 = new JButton("Deletar");
		JButton btBotao4 = new JButton("Alterar");
		JLabel texto1 = new JLabel("Grupo botões 1");
		JLabel texto2 = new JLabel("Grupo botões 2");
		JTextArea texto  = new JTextArea();
		JFrame janela = new JFrame("Primeira janela - Versão 1");
		JMenu mnArquivo = new JMenu("Arquivo");
		JMenuBar mn
		
		
		janela.setSize(700, 400); //dimensão da janela
		janela.setLocation(300,300);
		janela.setVisible(true);
		
		//adição de objetos...
		janela.getContentPane().add(btBotao);
		janela.getContentPane().add(btBotao2);
		janela.getContentPane().add(btBotao3);
		janela.getContentPane().add(btBotao4);
		janela.getContentPane().add(texto1);
		janela.getContentPane().add(texto);
		janela.getContentPane().add(texto2);
		janela.getContentPane().add(mnArquivo);
		
		
		//definir o espaço de cada botao
		janela.getContentPane().setLayout(new FlowLayout());//GridLayout
		
//		btBotao.setEnabled(true);
		btBotao.setBackground(Color.GRAY);
		btBotao2.setBackground(Color.GRAY);
		btBotao3.setBackground(Color.GRAY);
		btBotao4.setBackground(Color.GRAY);

		mnArquivo.add("NOVO");
		mnArquivo.setEnabled(true);

//		texto.setText("        ");
//		texto.setEditable(true);//possivel alteraçao feita pelo usuario

		
		
	}

}
