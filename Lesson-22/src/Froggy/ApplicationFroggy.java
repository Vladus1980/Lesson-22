package Froggy;

public class ApplicationFroggy {
	
	public interface Printable{
		void print();
	}
	public class Amphibia implements Printable{
		Printable eat = () -> System.out.println("Їсть комах");
		Printable sleep = () -> System.out.println("Спить на лататті");
		Printable swim = () -> System.out.println("Плаває в болоті");
		Printable wolk = () -> System.out.println("Гуляє на березі");

		@Override
		public void print() {
			
			
		}
	}
	
	public class Frog extends Amphibia{
		public Frog() {
		}
	}

	public static void main(String[] args) {
		
		
		
		Printable eat = () -> System.out.println("Їсть комах");
		Printable sleep = () -> System.out.println("Спить на лататті");
		Printable swim = () -> System.out.println("Плаває в болоті");
		Printable wolk = () -> System.out.println("Гуляє на березі");
		
		wolk.print();
		sleep.print();
		swim.print();
		eat.print();
	
	
	
		

	}

}
