import java.util.ArrayList;
import java.util.Random;

public class StackGame {
    public static void main(String[] args) {
        Random random = new Random();
        

        int balance = 100;
        int listSize = 10;

        ArrayList<Integer> randomList = new ArrayList<>();
        ArrayList<Boolean> conditionResults = new ArrayList<>();
        ArrayList<String> elementDiePairs = new ArrayList<>();

        // Generate random list
        for (int i = 0; i < listSize; i++) {
            randomList.add(random.nextInt(12) + 1);
        }

        System.out.println("🔢 Random Array: " + randomList);
        System.out.println("💰 Starting Balance: " + balance);
        System.out.println("====================================");

        for (int i = 0; i < randomList.size(); i++) {
            
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int sum = die1 + die2;

            int element = randomList.get(i);

            System.out.println("🎲 Dice Rolled: " + die1 + " + " + die2 + " = " + sum);
            System.out.println("🔍 Comparing (element, sum): (" + element + ", " + sum + ")");

            // Save the (element, sum) pair as a string
            elementDiePairs.add("(" + element + "," + sum + ")");

            // Condition 1
            boolean cond1 = (sum == 7 && element == 7);
            conditionResults.add(cond1);
            if (cond1) {
                balance += 20;
                System.out.println("Condition 1 → ✅ TRUE → +20");
            } else {
                balance -= 20;
                System.out.println("Condition 1 → ❌ FALSE → -20");
            }

            // Condition 2
            boolean cond2 = (sum > 7 && element > 7);
            conditionResults.add(cond2);
            if (cond2) {
                balance += 10;
                System.out.println("Condition 2 → ✅ TRUE → +10");
            } else {
                balance -= 10;
                System.out.println("Condition 2 → ❌ FALSE → -10");
            }

            // Condition 3
            boolean cond3 = (sum < 7 && element < 7);
            conditionResults.add(cond3);
            if (cond3) {
                balance += 10;
                System.out.println("Condition 3 → ✅ TRUE → +10");
            } else {
                balance -= 10;
                System.out.println("Condition 3 → ❌ FALSE → -10");
            }

            System.out.println("💰 Current Balance: " + balance);
            System.out.println("====================================");

            if (balance < 60) {
                System.out.println("❌ Game Over! Balance dropped below 60.");
                break;
            }
        }

        System.out.println("🏁 Final Balance: " + balance);
        System.out.println("🎮 Game Finished.");

        // Print all condition results and pairs
        System.out.println("🧾 Condition Results: " + conditionResults);
        System.out.println("🎲 (element, sum) Pairs: " + elementDiePairs);
    }
}

// // import java.util.ArrayList;
// // import java.util.List;
// // import java.util.Random;
// import java.util.*;

// public class RandomList {
//     public static void main(String[] args) {
//         Random random = new Random();
//         int listSize = 10; // Size of the random list
//         int no = 12;   // Numbers will be between 1 and 12

//         ArrayList<Integer> randomList = new ArrayList<>();
//         ArrayList<String> elementDiePairs = new ArrayList<>();
//         ArrayList<Boolean> conditionResults = new ArrayList<>();
        
//         for (int i = 0; i < listSize; i++) {
//             int randomNumber = random.nextInt(no);
//             randomList.add(randomNumber);
//         }

//         System.out.println("Random List: " + randomList);

//         int balance = 100;
//         System.out.println("Starting Balance is : " + balance);
//          System.out.println("====================================");
//         // random dies and condition
//         for (int i = 0; i < randomList.size(); i++) {
            
//             int die1 = random.nextInt(6) + 1;
//             int die2 = random.nextInt(6) + 1;
//             int sum = die1 + die2;

//             int element = randomList.get(i);

//             System.out.println("Dice Rolled: " + die1 + " + " + die2 + " = " + sum);
//             System.out.println("Comparing with element: " + element);

//             elementDiePairs.add("(" + element + "," + sum + ")");

//             // condition
//             if(sum == 7 && element == 7) {
//                 conditionResults.add(true);
//                 balance += 20;
//                 System.out.println("( " + element + ", " + sum + " ) == 7 +20");
//             }else if(sum > 7 && element > 7){
//                 conditionResults.add(true);
//                 balance += 10;
//                 System.out.println("( " + element + ", " + sum + " ) > 7 +10");
//             }else if(sum < 7 && element < 7){
//                 conditionResults.add(true);
//                  balance += 10;
//                 System.out.println("( " + element + ", " + sum + " ) < 7  +10");
//             }
//             else{
//                 if((element>7 && sum<7) || (element<7 && sum>7) ){
//                 conditionResults.add(false);
//                     balance -= 10;
//                     System.out.println("( " + element + ", " + sum + " )  > 7 →  -10");
//                 }
//                 else{
//                     conditionResults.add(false);
//                     balance -= 20;
//                     System.out.println("( " + element + ", " + sum + " ) != 7 → -20");
//                 }
//             }
            
//             System.out.println("Balance: " + balance);
//             System.out.println("====================================");

//             // Game ends if balance < 60
//             if (balance < 60) {
//                 System.out.println("Game Over! Balance is below 60.");
//                 break;
//             }
            
//         }
            
//         System.out.println("Final Balance: " + balance);
//         System.out.println(" Game Finished.");
        
//         System.out.println("Condition Results: " + conditionResults);
//         System.out.println("(element, sum) Pairs: " + elementDiePairs);
//     }
// }