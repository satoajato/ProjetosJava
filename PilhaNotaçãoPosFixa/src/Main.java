import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a expressão infixa para transformar em posfixa: ");
		String exp = scan.nextLine();
//		char[] ch = EntrePar(exp);
		char[] ch = exp.toCharArray();
		System.out.println(InPos(ch));
	}
	
//	public static char[] EntrePar(String x) { //coloca a expressão entre parenteses.
//		int j = 0;
//		char[] array = new char[x.length()+2];
//		for (int i = 0; i < array.length; i++) {
//			if(i==0) {
//				array[i] = '(';
//			}
//			else if (i==array.length-1) {
//				array[i] = ')';
//			}
//			else {
//				array[i] = x.charAt(j);
//				j++;
//			}
//        }
//		return array;
//	}
	
	public static String InPos(char expr[]) { //infixa para posfixa
		String posfixa = "";
		Pilha p = new Pilha(expr.length);
		int cont = 0;
		char c;
		
    	while(cont < expr.length) {
    		c = expr[cont];
    		switch(c) {
    			case '*':
	         	case '/':
	         	case '+':
	         	case '-':
	         	case '^':
	         		while((!p.isEmpty()) && prioridade(c) <= prioridade(p.top())) {
	         			posfixa += (p.pop());
	         		}
	         		p.push(c);
	         		break;
	         		
	         	case '(':
	         		p.push(c);
	         		break;
	         		
	         	case ')':
	         		while(p.top() != '(') {
	         			posfixa += (p.pop());
	         		}
	         		
	         		if(p.top() == '(') {
	         			p.pop();
	         		}
	         		break;
	         		
	         	default:
	         		posfixa += expr[cont];
	         		break;
	         }
    		cont++;
    	}
    	
    	while(p.size() > 0) {
    		if(p.top() != '(') {
    			posfixa += (p.pop());
    		}
    		else {
    			p.pop();
    		}
    	}
    	return posfixa;
	}
	
	
	public static int prioridade(char elemento) { //prioridade da expressão
		int prioridade;
		switch(elemento) {
			case '+':
			case '-':
				prioridade = 1;
				break;
				
			case '*':
			case '/':
				prioridade = 2;
				break;
				
			case '^':
				prioridade = 3;
				break;
				
			default:
				prioridade = 0;
				break;
		}
		
		return prioridade;
	}
	
}
