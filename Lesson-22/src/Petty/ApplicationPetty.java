package Petty;

public class ApplicationPetty {
public static void main(String[] args) {
	
	Pet cow = () -> "� ������ - ����-����!";
	Pet cat = () -> "� �� - �����-�����!";
	Pet dog = () -> "� ��� - ����� -�����!";
	
	System.out.println(cow.voice());
	System.out.println(cat.voice());
	System.out.println(dog.voice());
}
}
