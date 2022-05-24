import java.util.Scanner;

public class TrekkingManiaJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int n = Integer.parseInt(scanner.nextLine());
                int Musala = 0;
                int Montblanc = 0;
                int Kilimanjaro = 0;
                int K2 = 0;
                int Everest = 0;
                for (int i = 1; i <= n ; i++) {
                    int alpinists = Integer.parseInt(scanner.nextLine());

                    if (alpinists <= 5)
                    {
                        Musala += alpinists;
                    }
                    else if (alpinists>=6 && alpinists <= 12)
                    {
                        Montblanc += alpinists;
                    }
                    else if (alpinists >= 13 && alpinists <= 25)
                    {
                        Kilimanjaro += alpinists;
                    }
                    else if (alpinists >= 26 && alpinists <= 40)
                    {
                        K2 += alpinists;
                    }
                    else if (alpinists >= 41)
                    {
                        Everest += alpinists;
                    }
                }
                double allAlpinists = Musala + Montblanc + Kilimanjaro + K2 + Everest;
                System.out.printf("%.2f%%\n",(Musala / allAlpinists) * 100);
                System.out.printf("%.2f%%\n",Montblanc / allAlpinists * 100);
                System.out.printf("%.2f%%\n",Kilimanjaro / allAlpinists * 100);
                System.out.printf("%.2f%%\n",K2 / allAlpinists * 100);
                System.out.printf("%.2f%%\n",Everest / allAlpinists * 100);
            }
        }
