package Atividade;

import java.util.Scanner;

public class MediaSalario {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double hora ,horasTrabalhadas ;
		
		
		System.out.println("Quanto tu ganha por hora meu patr�o? diz pra mim: " );
		hora = scanner.nextDouble();
		
		System.out.println("Quantas horas tu trabalha no m�s meu patr�o? diz pra mim: " );
		horasTrabalhadas = scanner.nextDouble();
		

		double salario = ( hora * horasTrabalhadas);
		System.out.println("seu salario � baixo em , � : " + salario);
	}

}
