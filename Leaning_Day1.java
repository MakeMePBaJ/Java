// Day 1

public class Main 
{
    public static void main(String[] args) 
    {
        // Input: Define the names of the bank accounts
        String bankAccountSparkasseName = "Sparkasse "; // Sparkasse bank account
        String bankAccountN26Name = "N26 "; // N26 bank account

        // Input: Define the amount of money in each bank account
        int bankAccountSparkasseMoney = 2900; // Money in Sparkasse account
        int bankAccountN26Money = 99; // Money in N26 account

        // Calculate the total money in all accounts
        int totalMoney = bankAccountSparkasseMoney + bankAccountN26Money;

        // Output: Print the amount of money in each account and the total
        System.out.println(
            "There are " + bankAccountSparkasseMoney + "€ in the " + bankAccountSparkasseName + "account."
        );
        System.out.println(
            "There are " + bankAccountN26Money + "€ in the " + bankAccountN26Name + "account."
        );
        System.out.println(
            "There are " + totalMoney + "€ in both accounts."
        );

    }
}
