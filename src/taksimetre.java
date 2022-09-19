import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        int km;
        double tutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Gittiğiniz Km'yi giriniz : ");
        km = input.nextInt();
        tutar = (km * 2.2) +10;
        if (tutar<20){
            tutar = 20;
        }
        System.out.println("Ücret : " + tutar);
    }
}
