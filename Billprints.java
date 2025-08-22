import java.util.*;
class Billprints{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.println("=====================================================================================");
		System.out.println("__          __  _                            _           _ __  __            _");
		System.out.println("\\ \\        / / | |                          | |         (_)  \\/  |          | |");
		System.out.println(" \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___     _| \\  / | __ _ _ __| |_");
		System.out.println("  \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ' _ \\ / - \\ | __/ _ \\   | | |\\/| |/ _` | `__| __|");
		System.out.println("   \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) |  | | |  | | (_| | |  | |_ " );
		System.out.println("    \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/   |_|_|  |_|\\__,_|_|   \\__|");
		System.out.println("=====================================================================================");
		System.out.println();
		
		System.out.print("Enter Customer Phone Number _ ");
		String cpnum=input.nextLine();
		System.out.println();
		System.out.print("Enter Customer Name         - ");
		String cname=input.nextLine();
		System.out.println();
		
		System.out.println("=====================================================================================");
		System.out.println();
		
		System.out.print("Basmathi Qty(kg)  - ");
		int basmathi=input.nextInt();
		System.out.println();
		System.out.print("Dhal Qty(kg)      - ");
		int dhal=input.nextInt();
		System.out.println();
		System.out.print("Sugar Qty(kg)     - ");
		int sugar=input.nextInt();
		System.out.println();
		System.out.print("Highlan Qty       - ");
		int highland=input.nextInt();
		System.out.println();
		System.out.print("Yoghurt Qty       - ");
		int yog=input.nextInt();
		System.out.println();
		System.out.print("Flour Qty(kg)     - ");
		int flour=input.nextInt();
		System.out.println();
		System.out.print("Soap Qty          - ");
		int soap=input.nextInt();
		System.out.println();
		
		
		double bup=250, dhaup=180, sugarup=150, hlandup=1200, yup=50, fup=120, soapup=160;
		
		double bp=bup*(double)basmathi;
		double dhap=dhaup*(double)dhal;
		double sugarp=sugarup*(double)sugar;
		double hlandp=hlandup*(double)highland;
		double yp=yup*(double)yog;
		double fp=fup*(double)flour;
		double soapp=soapup*(double)soap;
		
		             
		
		double total=bp+dhap+sugarp+hlandp+yp+fp+soapp;
		double dis=0.10*total;
		double price=total-dis;
		
		
		
		
		
	}
}
		
