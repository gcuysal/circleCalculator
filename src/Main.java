import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int r;

        Scanner inp = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz: ");
        r = inp.nextInt();

        double area = (int) (3.14 * (Math.pow(r,2)));
        double diameter = (int) (2 * 3.14 * r);
        System.out.println("Dairenin alanı: " + area);
        System.out.println("Dairenin çevresi: " + diameter);

        int angle;
        System.out.println("Merkez açısını giriniz: ");
        angle = inp.nextInt();

        int segmentArea = (int) ((3.14* Math.pow(r,2) * angle)/360);
        System.out.println("Daire diliminin alanı: " + segmentArea);


    }
}
