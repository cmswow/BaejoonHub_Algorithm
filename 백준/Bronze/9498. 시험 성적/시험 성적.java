import java.util.Scanner; 
public class Main { 
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
		
        int score = scan.nextInt(); 
       
        switch(score/10) { // switch(정수)
        case 10:
        case 9:
        	System.out.println('A');
        	break; // break문 반드시 작성
        case 8:
        	System.out.println('B');
        	break;
        case 7:
        	System.out.println('C');
        	break;
        case 6:
        	System.out.println('D');
        	break;
        	default:
        		System.out.println('F');
        }
		scan.close();
    }
}