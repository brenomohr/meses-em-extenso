package ex1;

import java.util.Scanner;

public class Ex1 {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("informe o mês");
			int num = input.nextInt();
			
			switch(num){
			case 1:
		System.out.println("mes de janeiro");
		break;
			case 2:
				System.out.println("mes de fevereiro");
		break;
			case 3:
				System.out.println("mes de março");
		break;
			case 4:
				System.out.println("mes de abril");
		break;
			case 5:
				System.out.println("mes de maio");
		break;
			case 6:
				System.out.println("mes de junho");
		break;
			case 7:
				System.out.println("mes de julho");
		break;
			case 8:
				System.out.println("mes de agosto");
		break;
			case 9:
				System.out.println("mes de setembro");
		break;
			case 10:
				System.out.println("mes de outubro");
		break;
			case 11:
				System.out.println("mes de novembro");
		break;
			case 12:
				System.out.println("mes de dezembro08");
		break;
			default:
				System.out.println("mes inválido");			
			}
			
	}
	
	
	
}
