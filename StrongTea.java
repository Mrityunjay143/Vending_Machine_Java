public class StrongTea {

    private float sugar=2f;
    private int milk=30;
    private int coffeePowder=0;
    private int teaLeaves=4;
    private int water=150;
    private float price=15.50f;

    public void prepareTea(){

        ContainerClass.addCoffeePowder(this.coffeePowder);
        ContainerClass.addSugar(this.sugar);
        ContainerClass.addMilk(this.milk);
        ContainerClass.addWater(this.water);
        ContainerClass.TotalSellPrice(this.price);
        ContainerClass.addLeaves(this.teaLeaves);
        ContainerClass.NoOfTeaSell = ContainerClass.NoOfTeaSell+1;


    }
    
}
