/**
 * 
 */
package dado;

import java.util.Scanner;

/**
 * @author chfar
 *
 */
public class JogoDado {
	public static void main(String[] args) {
		char  opcao = 's';
		Scanner teclado = new Scanner(System.in);
		while (opcao=='s') {
			System.out.println("Lan�amento do Dado......");
			int dado = (int) (Math.random()*6 +1);
			System.out.println("Face: " + dado );
			System.out.println("Deseja lan�ar o dado novamente(s/n)?");
			opcao=teclado.next().charAt(0); 
		}
		

	}

}
