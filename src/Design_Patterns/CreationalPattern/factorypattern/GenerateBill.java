package Design_Patterns.CreationalPattern.factorypattern;

import java.util.Scanner;

public class GenerateBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String planType;
        while (true){
            System.out.println("Enter the Plan type\n1.CP\n2.CP\n3.IP\n");
             planType = sc.nextLine();
             if (planType.equalsIgnoreCase("DP")||planType.equalsIgnoreCase("CP")||planType.equalsIgnoreCase("IP")){
                 break;
             }
             else {
                 System.out.println("Enter the plan type correctly !!!!!!!");
             }
        }
            System.out.println("Enter the number of units consumed\n");
            int Units = sc.nextInt();
            BillFactory BF = new BillFactory();
            BillPlanAbstact bpa = BF.getPlanObject(planType);
            bpa.getRate();
            bpa.getBills(Units);
        }
    }
