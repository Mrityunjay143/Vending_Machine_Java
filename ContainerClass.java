import java.util.Scanner;

public class ContainerClass {
    private static int TeaLeaves = 500;
    private static int coffeePowder = 500;
    private static float sugar = 600;
    private static int milk = 8000;
    private static int water = 15000;

    private static float TeaLeavesCostPerUnit = 1;
    private static float CoffeePowderCostPerUnit = 2;
    private static float SugarCostPerUnit = 1.5f;
    private static float MilkCostPerUnit = 0.15f;
    private static float WaterCostPerUnit = 0.02f;

    public static float TotalSell = 0.0f;
    public static float costPrice = 0.0f;

    public static int NoOfCoffeeSell = 0;
    public static int NoOfTeaSell = 0;

    private static int TotalTeaLeaves = 500;
    private static int TotalcoffeePowder = 500;
    private static float Totalsugar = 600;
    private static int Totalmilk = 8000;
    private static int Totalwater = 15000;

    public void RefillContainer() {

        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        char d;
        while (flag) {
            System.out.println("Refill Container");
            System.out.println("Select Option to Process\n");
            System.out.println("1 Sugar \n");
            System.out.println("2 Milk\n");
            System.out.println("3 Tea Leaves\n");
            System.out.println("4 Coffe\n");
            System.out.println("5 Water\n");
            System.out.println("6 Exit\n");
            d = scan.next().charAt(0);

            switch (d) {
                case '1':
                    System.out.println("Please enter the sugar Quantity\n");
                    int s = scan.nextInt();
                    sugar = sugar+s;
                    Totalsugar=sugar;
                    break;

                case '2':
                    System.out.println("Please enter the Milk Quantity\n");
                    int M = scan.nextInt();
                    milk = milk+M;
                    Totalmilk=milk;
                    break;

                case '3':
                    System.out.println("Please enter the Coffee Quantity\n");
                    int c = scan.nextInt();
                    coffeePowder = coffeePowder+c;
                    TotalcoffeePowder=coffeePowder;
                    break;

                case '4':
                    System.out.println("Please enter the Tea Leaves Quantity\n");
                    int T = scan.nextInt();
                    TeaLeaves = TeaLeaves+T;
                    TotalTeaLeaves=TeaLeaves;
                    break;

                    
                case '5':
                System.out.println("Please enter the Water Quantity\n");
                int W = scan.nextInt();
                water = water+W;
                Totalwater=water;
                break;

                case '6':
                    System.out.println("exit");
                    flag = false;
                    break;
            }

        }
    }

    public static void addSugar(float val) {
        sugar = sugar - val;
        costPrice = costPrice + (val * SugarCostPerUnit);
        System.out.println("Sugar amount left:" + sugar);
        if (sugar <= 50) {
            System.out.println("Sugar Level is Down");
        }
    }

    public static void addLeaves(int val) {
        TeaLeaves = TeaLeaves - val;
        costPrice = costPrice + (val * TeaLeavesCostPerUnit);
        System.out.println("TeaLeaves is Left:" + TeaLeaves);

        if (TeaLeaves <= 50) {
            System.out.println("TeaLeaves is Down");
        }

    }

    public static void addCoffeePowder(int val) {
        coffeePowder = coffeePowder - val;
        costPrice = costPrice + (val * CoffeePowderCostPerUnit);
        System.out.println("CoffeePowder is Left:" + coffeePowder);

        if (coffeePowder <= 50) {
            System.out.println("CoffeePowder is Down");
        }

    }

    public static void addMilk(int val) {
        milk = milk - val;
        costPrice = costPrice + (val * MilkCostPerUnit);
        System.out.println("Milk is Left:" + milk);

        if (milk <= 4000) {
            System.out.println("Milk is Down");
        }
        if ((Totalmilk-milk)%200==0) {
            System.out.println("Due to Milk Leakage loss of 10 Unit on every 200 unit:" + (milk-10));
        }

    }

    public static void addWater(int val) {
        water = water - val;
        costPrice = costPrice + (val * WaterCostPerUnit);
        System.out.println("Water is Left:" + water);

        if (milk <= 4000) {
            System.out.println("Water is Down");
        }
        if ((Totalwater-water)%500==0) {
            System.out.println("Due to water Leakage loss of 25 Unit on every 500 unit:" + (water-25));
        }

    }

    public static void TotalSellPrice(float val) {
        TotalSell = TotalSell + val;
        System.out.println("Total sell:" + TotalSell);
    }

    public static void TotalProfitOrLoss(float val) {
        System.out.println("Profit and Loss:" + (TotalSell - costPrice));
    }

    public static void ShowReport() {
        System.out.println("TeaLeaves Left:" + TeaLeaves + "\n" + "Tea Leaves Consume:" + (500 - TeaLeaves));
        System.out.println("Milk amount Left:" + milk +  "\n" +"Milk Consume:" + (8000 - milk));
        System.out.println("Sugar left:" + sugar +  "\n" + "Sugar Consume:" + (600 - sugar));
        System.out.println("Water amount Left:" +  "\n" + water + "Water Consume:" + (15000 - water));
        System.out.println("Coffee amount Left:" +  "\n" +coffeePowder + "CoffePowder:" + (500 - coffeePowder));
        System.out.println("CostPrice:" + costPrice);
        System.out.println("TotalSell:" + TotalSell);
        System.out.println("Total Profit Or Loss:" + (TotalSell - costPrice));
        System.out.println("Total Coffee Sell:" + NoOfCoffeeSell);
        System.out.println("Total Tea Sell:" + NoOfTeaSell);
    }

}
