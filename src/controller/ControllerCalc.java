package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.vinicius.pilhaint.Pilha;



public class ControllerCalc {
	public void insereValor(Pilha p, int dado) {
		p.push(dado);
	}
	
	public int npr(Pilha p, String dado) {
		
		boolean validador = false;
		int resultado = 0;
		
		int valor1 = 0;
		int valor2 = 0;
				
		try {
			valor1 = p.pop();		
			valor2 = p.pop();
		} catch (Exception e1) {
			validador = true;
		}
		
		if(validador==false) {
			switch (dado) {
			case "+":
				System.out.print(dado);
				resultado = valor1 + valor2;
				p.push(resultado);
				break;
			case "-":
				System.out.print(dado);
				resultado =  valor2 - valor1;
				p.push(resultado);
				break;
			case "/":
				System.out.print(dado);
				resultado = valor2/valor1;
				p.push(resultado);
				break;
			case "*":
				System.out.print(dado);
				resultado = valor1 * valor2;
				p.push(resultado);
				break;
			default:
				JOptionPane.showMessageDialog(null,"Op��o Invalida");
				break;
			}
		}else {
			JOptionPane.showMessageDialog(null," N�o h� numeros para desempilhar");
			resultado = 0;
		}
		JOptionPane.showMessageDialog(null, valor1 +" "+  dado +" "+ valor2);
		return resultado;
	}
}
