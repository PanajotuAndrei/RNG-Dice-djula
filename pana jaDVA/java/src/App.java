import java.lang.reflect.Array;
import java.util.*;

/*
    zapazanja iz testiranja: 
    - ako korisnik unese slovo, program puca
    - ne zna se unapred bez citanja koda da li se misli na cifru 0-9 ili 1-6

    potencijalni upgrade:
    - vise igraca 
        napravi lokalnu promenljivu koja vodi racuna ciji je potez
    - varijabilni broj igraca
        na pocetku pitaj koliko igraca igra
 
*/


public class App {

    public static void main(String[] args) throws Exception {
        int brojac1 = 0, brojac2 = 0, brojac3 = 0; //promenljive se nigde ne koriste

        Scanner skener = new Scanner(System.in);
        int brojacina = 0;

        for(int i=0; i<5; i++){            
            
            System.out.println("Igrac broj 1: ");
            int ULAZ1 = skener.nextInt(); 
            
            brojacina += broj(ULAZ1);
            System.out.println("Rezultat je " + brojacina);
            // TREBAJU NAM 3 BROJACINE I DA POVEZEMO BROJACINE ZA SKORBOARD I SKORBORD DA SE IZVRSI NA KRAJU ALI NAIZMENICNO 

        }
    
    }
    public static int broj(int input1){
        int random = (int)(Math.random()*6);       

        if (input1 == random){            
            System.out.println("Pogodjen, random broj je: " + random);
            return 1;
        }
        else{
            System.out.println("noup, random broj je: " + random);
            return 0;
        }        
    }
   
    
    //ovaj kod nije koriscen nigde?
    /*
    public static int[] najveciBroj(int broj1, int broj2, int broj3){
        int broj = 0;
        String a = "-------------------------------------";
        int[] pana = new int[3];
        pana[0] = broj1;
        pana[1] = broj2;
        pana[2] = broj3;
        int c = 0;
        c = (int)(Math.max(Math.max(pana[0], pana[1]), pana[2]));

        System.out.print("Brojevi su: ");
        for(int i=0;i<pana.length; i++){
        System.out.print(pana[i]+ " ");
        }
        System.out.println("");

        System.out.println("Najveci broj je: " + c);
        for(int i=0; i<pana.length; i++){
            if(c==pana[i]){
                broj = i+1;
            }

        }
        

        System.out.println("to je broj " + broj);
        System.out.println(a);

        for(int i=0; i<pana.length; i++){
            System.out.print(i);
           System.out.println(a.substring(0, pana[i]));
        }
        return pana;
    }
    */
}