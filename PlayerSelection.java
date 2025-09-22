//TASK 1
import java.util.Scanner;

public class PlayerSelection {
    public static void main (String[] args) {
        String name;
        int age;
        double height;
        double weight;
        int jerseyNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Player name? - ");
        name = input.nextLine();
        System.out.print("Player age? - ");
        age = input.nextInt();
        System.out.print("Player height? - ");
        height = input.nextDouble();
        System.out.print("Player weight? - ");
        weight = input.nextDouble();
        System.out.print("Player Jersey number? - ");
        jerseyNumber = input.nextInt();
//        System.out.println("Player Name - "+name);
//        System.out.println("Age - "+age);
//        System.out.println("Height - "+height+"m");
//        System.out.println("Weight - "+weight+"lbs");
//        System.out.println("Jersey Number - "+jerseyNumber);

        //TASK 2
        System.out.println(" ");
        final double pound = 0.45359237;
        final int meter = 100;
        double heightInCentimeters = height * meter;
        double weightInKg = weight * pound;
//        System.out.println("Player Name - "+name);
//        System.out.println("Age - "+age);
//        System.out.println("Height in centimeters - "+(int)heightInCentimeters+"cm");
//        System.out.println("Weight in kilograms - "+(int)weightInKg+"kg");
//        System.out.println("Jersey Number - "+jerseyNumber);

        //TASK 3
        System.out.println(" ");
//        System.out.println("Player's age now - "+age);
        int newAge = age;
        int newJerseyNumber = jerseyNumber;
//        System.out.print("Player's age next season - ");
//        System.out.print(++newAge+"\n");
//        System.out.print("Player's jersey number next season - ");
//        System.out.print(--newJerseyNumber+"\n");

        //TASK 4
        String playerEligibility = "";
        if (age < 18 || weightInKg > 90)
            playerEligibility = "Player has a problem (either too young or too heavy)";
        else if (!(age >= 18 && age <=35 && weightInKg < 90))
            playerEligibility = "Not Eligible";
        else
            playerEligibility = "Eligible";
//        System.out.println(playerEligibility);


        //TASK 5
        String category = "";
        if (age < 20)
            category = "Rising star";
        else if (age > 20 && age < 30)
            category = "Prime Player";
        else if (age > 30)
            category = "Veteran";
//        System.out.println("Player Category - "+category);


        //TASK 6 & 7
        Scanner bInput = new Scanner(System.in);
        System.out.print("Enter jersey number of the player(coach) : ");
        int bJerseyNumber = bInput.nextInt();
        String position;
        switch (bJerseyNumber){
            case 1:
                position = "Goalkeeper";
//                System.out.println(position);
                break;
            case 2:
            case 5:
                position = "Defender";
//                System.out.println(position);
                break;
            case 6:
            case 8:
                position = "Midfielder";
//                System.out.println(position);
                break;
            case 7:
            case 11:
                position = "Winger";
//                System.out.println(position);
                break;
            case 9:
                position = "Striker";
//                System.out.println(position);
                break;
            case 10:
                position = "Playmaker";
//                System.out.println(position);
                break;
            default :
                position = "Player position not known";
//                System.out.println(position);
        }


        //TASK 8
        String lineupDecision = "";
        if (category.equals("Prime Player"))
            if (weightInKg < 80)
                lineupDecision = "Starting lineup";
            else
                lineupDecision = "Bench";
//        System.out.println(lineupDecision);


        //TASK 9
        String finalStatus = (age >= 18 && age <=35 && weightInKg < 90) ? "Play" : "Rest";
//        System.out.println(finalStatus);


        //TASK 10
        //PLAYER REPORT
        String attackerJersey = "";
        if (position.equals("Winger") || position.equals("Striker") || position.equals("Playmaker"))
            attackerJersey = "Yes";
        else
            attackerJersey = "No";
//        System.out.println(attackerJersey);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("PLAYER REPORT");
        System.out.println("------------------------------------------");

        System.out.println("Player: "+name);
        System.out.println("Age: "+age +" "+category);
        System.out.println("Height: "+heightInCentimeters);
        System.out.println("Weight: "+weightInKg);
        System.out.println("Jersey: "+bJerseyNumber);
        System.out.println("Position: "+position);
        System.out.println("Attacker jersey: "+attackerJersey);
        System.out.println("Eligibility: "+playerEligibility);
        System.out.println("Lineup Decision: "+lineupDecision);
        System.out.println("Final Decision: "+finalStatus);
    }
}