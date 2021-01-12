package Petty;

public class ApplicationPetty {
public static void main(String[] args) {
	
	Pet cow = () -> "ί κξπξβΰ - Μσσσ-Μσσσ!";
	Pet cat = () -> "ί κ³ς - Μÿσσσ-Μÿσσσ!";
	Pet dog = () -> "ί οερ - Γΰσσσ -Γΰσσσ!";
	
	System.out.println(cow.voice());
	System.out.println(cat.voice());
	System.out.println(dog.voice());
}
}
