public class LightCoffee {

    private float sugar = 1.5f;
    private int milk= 60;
    private int coffeePowder=2;
    private int teaLeaves=0;
    private int water=100;
    private float price= 16.5f;

    public void prepareCoffee(){
        ContainerClass.addCoffeePowder(this.coffeePowder);
        ContainerClass.addSugar(this.sugar);
        ContainerClass.addMilk(this.milk);
        ContainerClass.addWater(this.water);
        ContainerClass.TotalSellPrice(this.price);
        ContainerClass.addLeaves(this.teaLeaves);
        ContainerClass.NoOfTeaSell = ContainerClass.NoOfTeaSell+1;



    }
    
}
