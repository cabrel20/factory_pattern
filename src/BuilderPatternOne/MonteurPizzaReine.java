package BuilderPatternOne;

public class MonteurPizzaReine extends MonteurPizza {
	
	@Override
		public void creerNouvellePizza() {
			// TODO Auto-generated method stub
			super.creerNouvellePizza();
		}
	
 public void monterPate() {
	 pizza.setPate("croiseé");
 }
 
 public void monterSauce() {
	 pizza.setSauce("douce");
 }
 
 public void monterGarniture() {
	 pizza.setGarniture("Jambon+champignon");
 }
}
