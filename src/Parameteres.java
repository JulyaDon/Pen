import java.util.Scanner;

/**
 * Created by July on 18.04.2016.
 */
public class Parameteres {
    float PenLength;
    double WeightInGrammes;
    double Diameter = 0.8;
    double LengthOfShank;
    double DiameterOfShank;
    int NumberOfSymbols = 50;
    String Color;
    String Matherial;
    String Sentence;
    String[] WordArray;



    public void Write(String H) {
/*
        System.out.println(H);
        WordArray = H.split(" ");
*/
        System.out.println("Write the text you want (remember that you can write just 50 symbols with one pen, then you can take new one):");

            for(int j = 0; j<100; j++) {
                Scanner sc = new Scanner(System.in);
                Sentence = sc.nextLine();

                WordArray = Sentence.split("");
                for (int i = 0; i < WordArray.length; i++) {
                    //FinalText[i] = WordArray[i];
                    //if(FinalText[i]!= " ")
                    if (NumberOfSymbols > 0) {
                        if (!WordArray[i].equals(" "))
                            NumberOfSymbols--;
                        System.out.print(WordArray[i]);
                    }
                }

                System.out.println("\r\n" + "Now you have a new pen. If you want you can go on writing.");
            }

    }

}








