package Froggy;

public class ApplicationFroggy {
	
	public interface Printable{
		void print();
	}
	public class Amphibia implements Printable{
		Printable eat = () -> System.out.println("���� �����");
		Printable sleep = () -> System.out.println("����� �� ������");
		Printable swim = () -> System.out.println("����� � �����");
		Printable wolk = () -> System.out.println("����� �� �����");

		@Override
		public void print() {
			
			
		}
	}
	
	public class Frog extends Amphibia{
		public Frog() {
		}
	}

	public static void main(String[] args) {
		
		
		
		Printable eat = () -> System.out.println("���� �����");
		Printable sleep = () -> System.out.println("����� �� ������");
		Printable swim = () -> System.out.println("����� � �����");
		Printable wolk = () -> System.out.println("����� �� �����");
		
		wolk.print();
		sleep.print();
		swim.print();
		eat.print();
	
	
	
		

	}

}
