
public class maiorpalindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		for (int i = 100; i < 999; i++) {
			for (int j = 100; j < 999; j++) {
				int resultado = i*j;
				if(ePalindromo(resultado)) {
					if(resultado > max) {
						max = resultado;
					}
				}
			}
		}
		System.out.println(max);
	}
	
	private static boolean ePalindromo(int num) {
	      
		int n = num;
		int i = 0;
	    int k = 0;
	    int count = 1;
	  
	    while(n/10 != 0) {
	    	count++;
	    	n = n/10;
	    }
	  
	    int numArray[] = new int[count];
	  
	    for(i = 0; i < count; i++) { 
	    	numArray[i] = num%10;
	    	num = num/10;
	    }

	    for(k = 1; k <= count; k++) {
	    	if(numArray[k-1] != numArray[count-k]) return false;
	    	}
	    return true;

	}
}
