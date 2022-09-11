public class StrongCoffee {

    private int sugar=2;
    private int milk=50;
    private int coffeePowder=4;
    private int teaLeaves=0;
    private int water=100;
    private float price=17.5f;

    public void prepareCoffee(){
    
        ContainerClass.addCoffeePowder(this.coffeePowder);
        ContainerClass.addSugar(this.sugar);
        ContainerClass.addMilk(this.milk);
        ContainerClass.addWater(this.water);
        ContainerClass.TotalSellPrice(this.price);
        ContainerClass.addLeaves(this.teaLeaves);
        ContainerClass.NoOfCoffeeSell = ContainerClass.NoOfCoffeeSell+1;
    }   
}
