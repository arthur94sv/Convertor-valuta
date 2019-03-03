import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String raspuns;
		do {
		System.out.print("Introduceti suma in lei: ");
		double lei=input.nextDouble();
		
		System.out.print("In ce ati dori sa convertiti suma (1 - euro; 2 - dolari; 3 - lire sterline): ");
        int varianta = input.nextInt();
        
        switch(varianta) {
        case 1:
        	Convertor cv= new Euro();
        	cv.conversie(lei);
        	break;
        
        case 2:
        	Convertor cv2 = new Dolar();
        	cv2.conversie(lei);
        	break;
        
        case 3:
        	Convertor cv3 = new Lira();
        	cv3.conversie(lei);
        	break;
                        
        }
        System.out.print("Mai doriti sa continuati (da sau nu): ");
		raspuns = input.next();
	}while (raspuns.equals("da"));
		input.close();
	}

}
