package BuilderPatternOne;

public class Directeur {

	public Pizza construire(MonteurPizza monteurPizza) {
		monteurPizza.creerNouvellePizza();
		monteurPizza.monterPate();
		monteurPizza.monterSauce();
		monteurPizza.monterGarniture();
		return monteurPizza.getPizza();	
	}
}
