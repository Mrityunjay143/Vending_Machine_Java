import java.util.Scanner;

public class DispenseBeverage {

    public void ShowBeverageOption() {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        char d;
        

        while (flag) {
            System.out.println("DespenseBeverages\n");
            System.out.println("Select a Beverages\n");
            System.out.println("1 Strong Coffee\n");
            System.out.println("2 Light Coffee\n");
            System.out.println("3 Strong Tea\n");
            System.out.println("4 Light Tea\n");
            System.out.println("5 Exit\n");

            d = scan.next().charAt(0);

            switch (d) {
                case '1':
                    StrongCoffee coffee = new StrongCoffee();
                    System.out.println("Please enter the no of  strong coffe needed\n");
                    int x = scan.nextInt();
                    for(int i=0; i<x; i++){
                        coffee.prepareCoffee();
                    }
                    
                    break;

                case '2':
                    LightCoffee coffee1 = new LightCoffee();
                    System.out.println("Please enter the no of Light coffee needed\n");
                    int x1 =scan.nextInt();
                    for(int i=0; i<x1; i++){
                        coffee1.prepareCoffee();
                    }
                    break;

                case '3':
                    StrongTea tea = new StrongTea();
                    System.out.println("Please enter the no of  strong Tea needed\n");
                    int y =scan.nextInt();
                    for(int i=0; i<y; i++){
                        tea.prepareTea();
                    }
                    break;

                case '4':
                    LightTea tea1 = new LightTea();
                    System.out.println("Please enter the no of Light Tea needed\n");
                    int y1 =scan.nextInt();
                    for(int i=0; i<y1; i++){
                        tea1.prepareTea();
                    }
                    break;
                
                case '5':
                    System.out.println("exit");
                    flag = false;
                    break;
            }
        }
    }

}
