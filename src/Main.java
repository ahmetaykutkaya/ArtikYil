import java.util.Scanner;
public class Main {
    public static void main(String[] args)

    {
        Scanner data = new Scanner(System.in);
        int year;
        System.out.print("Yili Giriniz :");
        year = data.nextInt();

        if (year %100 == 0) {
            if (year %400 ==0){
                System.out.print("Artik Yildir...");
            }
            else {
                System.out.print("Artik Yil Degildir ..");
            }

        }
        else if (year %4 ==0) {

                System.out.print("Artik Yildir...");



        }else {
            System.out.print("Artik yil degildir.");
        }

    }
}