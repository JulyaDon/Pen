import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by July on 16.04.2016.
 */
public class Pen {
    public static void main(String[] args) {
    Parameteres myPen = new Parameteres();
        myPen.PenLength = 14;
        myPen.WeightInGrammes = 4.3;
        myPen.LengthOfShank = 12.8;
        myPen.DiameterOfShank = 0.23;
        myPen.Color = "Green";
        myPen.Matherial = "Plastic";

        System.out.println(myPen.Diameter);
        System.out.println(myPen.Color);
        System.out.println(myPen.DiameterOfShank);

        System.out.println(myPen.NumberOfSymbols);

        myPen.Write("hello world!");

        System.out.println(myPen.NumberOfSymbols);
    }
}
