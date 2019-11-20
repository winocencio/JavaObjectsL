import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainLambda {

	public static void main(String[] args) {
		
		//Simulando qual tecla foi apertada
		
		System.out.println("arrowUp / arrowDown / arrowRight / arrowLeft");
		String entrada = new Scanner( System.in ).nextLine();
		
		AcceptedMovesB.ruleMove(entrada);
			
	}
}

interface RuleMoveInterface {
	void ruleMove();
}

class AcceptedMovesB {
	
	private static Map<String, RuleMoveInterface> ruleMap = new HashMap<>();
	
	static {
		ruleMap.put("arrowUp", () -> System.out.println("Movendo Player para cima"));
		ruleMap.put("arrowDown", () -> System.out.println("Movendo Player para baixo"));
		ruleMap.put("arrowRight", () -> System.out.println("Movendo Player para direita"));
		ruleMap.put("arrowLeft", () -> System.out.println("Movendo Player para esquerda"));
	}
	
	public static void ruleMove(String entrada) {
		RuleMoveInterface ruleMoveInterface =  ruleMap.get(entrada);
		
		if(ruleMoveInterface != null) {
			ruleMoveInterface.ruleMove();
		}
	}
}

