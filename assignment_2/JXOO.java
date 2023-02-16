import java.util.Scanner;


public class JXOO{
    public static void main(String[] args){
        Scanner takeInput=new Scanner(System.in);
        System.out.println("Survey information getter of Nuclear reactor JX00-XC-HB1");

        System.out.println("--------------------------------------------------------\n");
        System.out.print("The total number of employees present there: ");

        int totalEmp=takeInput.nextInt();
        takeInput.nextLine();

        System.out.print("\nSupervisor: ");
        String supervisor=takeInput.nextLine();

        System.out.print("\nTimes the Nuclear waste is removed from the core: ");
        int wasteRemove=takeInput.nextInt();

        System.out.print("\nTotal weight of waste produced in every 1 week?Press k or lb");
        char weightingIn=takeInput.nextLine();
        double wasteRemoveKg;
        double wasteRemoveLb;
        if(weightingIn=="k"){
             wasteRemoveKg=takeInput.nextDouble();
             wasteRemoveLb=wasteRemoveKg * 2.20462;
        }
        else{
             wasteRemoveLb=takeInput.nextDouble(); 
             wasteRemoveKg=wasteRemoveLb/2.20462;
        }

        System.out.println("\nElectric Motor being replaced every 18 days?Press 'y' or 'n' for yes/no respectively");
        char y_n=takeInput.next().charAt(0);
        String yes_no;
        if(y_n=='y'){
            yes_no="Yes";
        }
        else{
            yes_no="No";
        }

        System.out.println("The core average temperature of the Nuclear Reactor is: ");
        double temp=takeInput.nextDouble();

        double kelvin= temp + 273.15;

        String kelvin2=String.format("%.2f",kelvin);

        System.out.println("Survey information shower");

        System.out.println("\nTotal employees present: "+totalEmp);
        System.out.println("Supervisor: "+supervisor);
        System.out.println("Waste Removal in: "+wasteRemove);
        System.out.println("Waste Produced every 1 week: "+wasteRemoveKg+"kg/"+wasteRemoveLb+"lbs");
        System.out.println("Electric Motor is being replaced or not: "+yes_no);
        System.out.println("The average temperature of the Nuclear Reactor(CORE): "+temp+"\u00B0C"+"/"+kelvin2+"K");
    }
}