package com.company;
import com.company.NalogType.*;
import com.company.SumOfNalogs.Nalog;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double allNalogs = 0;
        Nalog nal;
        double[] massiv= new double[0];

        while(true) {

            System.out.println("Введите тип дохода. osn - оснойной, dop - дополнительный, aut - авторские вознаграждения, ");
            System.out.println("prod - с продажи имущество, gift- с подарков, tran - переводы, ben - льготы на детей ");
            Scanner sc1 = new Scanner(System.in);
            String vid = sc1.nextLine();
            if (vid.compareTo("osn") == 0)
            {
                nal = new MainJobNalog();
            }
            else if (vid.compareTo("dop") == 0)
            {
                nal = new DopNalog();
            }
            else if (vid.compareTo("aut")==0)
            {
                nal= new AuthorNalog();
            }
            else if (vid.compareTo("prod")==0)
            {
                nal= new ProdashaImush();
            }
            else if (vid.compareTo("gift")==0)
            {
                nal= new GiftNalog();
            }
            else if (vid.compareTo("tran")==0)
            {
                nal= new TransferNalog();
            }
            else if (vid.compareTo("ben")==0)
            {
                nal= new BenefitNalog();
            }
            else
            {
                System.out.println("Введите правильный тип дохода");
                continue;
            }


    System.out.println("Vvedite dohod:");

            Scanner sc2 = new Scanner(System.in);
            double dohod=0;
            try {
                 dohod = sc2.nextInt();
            }
            catch (InputMismatchException es) {System.out.println("Введено нечисловое значения дохода");}

try{
    double nalog = nal.CalcNalog(dohod);

    if (dohod <0) {
        throw new NegativeDohodException();
    }

    if (nalog>dohod) {
        throw new PercentMore100Exception();
    }
    System.out.println("Nalog = " + nalog);
    allNalogs += nalog;

    massiv = new double[massiv.length + 1];
    massiv[massiv.length - 1] = nalog;
}
catch (NegativeDohodException e1) {System.out.println("Введен отрицательный доход");}
catch (PercentMore100Exception e2) {System.out.println("Налог превышает доход");}


            System.out.println("Prodoljit(Y/N)?");
            if(sc1.nextLine().compareTo("Y") != 0){

                System.out.println("Summa nalogov = " + allNalogs);
                return;


            }
        }

    }
}
