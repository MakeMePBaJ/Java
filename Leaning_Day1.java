// Day 1

public class Main 
{
    public static void main(String[] args) 
    {
        // input
        String kontoSparkasseName = "Sparkasse ";
        String kontoN26Name = "N26 ";

        int kontoSparkasseGeld = 2900;
        int kontoN26Geld = 99;

        int alleKonten = kontoSparkasseGeld + kontoN26Geld;

        //output
        System.out.println(
            "Auf seinem " + kontoSparkasseName + "Konto sind " + kontoSparkasseGeld + "€."
        );
        System.out.println(
            "Auf seinem " + kontoN26Name + "Konto sind " + kontoN26Geld + "€."
        );
        System.out.println(
            "Auf beiden Konten sind " + alleKonten + "€."
        );

    }
}