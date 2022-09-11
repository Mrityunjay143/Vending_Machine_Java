public class LightTea {

    private float sugar=1.5f;
    private int milk=40;
    private int coffeePowder=0;
    private int teaLeaves=3;
    private int water=150;
    private float price=15f;

    public void prepareTea(){

        ContainerClass.addCoffeePowder(this.coffeePowder);
        ContainerClass.addSugar(this.sugar);
        ContainerClass.addMilk(this.milk);
        ContainerClass.addWater(this.water);
        ContainerClass.TotalSellPrice(this.price);
        ContainerClass.addLeaves(this.teaLeaves);

    }
    
    
}
