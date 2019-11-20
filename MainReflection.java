import java.lang.reflect.Method;
import java.util.Scanner;

public class MainReflection {

	public static void main(String[] args) {
		
		//Simulando qual tecla foi apertada
		
		System.out.println("arrowUp / arrowDown / arrowRight / arrowLeft");
		String entrada = new Scanner( System.in ).nextLine();
		
		try {
			
			//Obtendo metodo do AcceptedMovesA para ser executado
			Method moveFunction = AcceptedMovesA.class.getMethod(entrada);
			
			//Executando metodo
			moveFunction.invoke(new AcceptedMovesA());
		
		} catch (NoSuchMethodException e) {
			System.out.println("Metodo não encontrado");
		} catch (Exception e) {
			System.out.println("Erro --> " + e.getMessage());
			e.printStackTrace();
		}
	}

}

class AcceptedMovesA {
	
	public void arrowUp() {
		System.out.println("Movendo Player para cima");
	}
	
	public void arrowDown() {
		System.out.println("Movendo Player para baixo");
	}
	
	public void arrowRight() {
		System.out.println("Movendo Player para direita");
	}
	
	public void arrowLeft() {
		System.out.println("Movendo Player para esquerda");
	}
	
}

