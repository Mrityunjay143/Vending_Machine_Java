import java.util.Scanner;

public class Mainclass {

    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);
        boolean flag = true;
        char d;
    
        while(flag){
            System.out.println("Select Option to Process\n");
            System.out.println("1. Dispense Beverages\n");
            System.out.println("2. Refile Container\n");
            System.out.println("3. Report\n");
            System.out.println("4. Exit\n");
            d=scan.next().charAt(0);

            switch(d){
                case '1':
                DispenseBeverage beverage= new DispenseBeverage();
                beverage.ShowBeverageOption();
                break;

                case '2':
                ContainerClass c = new ContainerClass();
                c.RefillContainer();
                break;

                case '3':
                System.out.println("Report");
                ContainerClass.ShowReport();
                break;

                case '4':
                System.out.println("Exit");
                flag = false;
                break;
            }
        }
    }
    
}
