import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {
        int brojac1 = 0, brojac2 = 0, brojac3 = 0;

        Scanner skener = new Scanner(System.in);
        int brojacina1 = 0, brojacina2 = 0, brojacina3 = 0;
        for(int i=0; i<2; i++){
            
            
            System.out.println("Igrac broj 1: ");
            int ULAZ1 = skener.nextInt(); 
            brojacina1 = broj(ULAZ1, brojacina1);
            
            System.out.println("Igrac broj 2: ");
            int ULAZ2 = skener.nextInt(); 
            brojacina2 = broj(ULAZ2, brojacina2);

            System.out.println("Igrac broj 2: ");
            int ULAZ3 = skener.nextInt(); 
            brojacina3 = broj(ULAZ3, brojacina3);


            System.out.println("Rezultat je " + brojacina1 + " " + brojacina2 + " " + brojacina3);
            // TREBAJU NAM 3 BROJACINE I DA POVEZEMO BROJACINE ZA SKORBOARD I SKORBORD DA SE IZVRSI NA KRAJU ALI NAIZMENICNO 

        }
        najveciBroj(brojacina1, brojacina2, brojacina3);
    
        


    }
            public static int broj(int input1, int brojacc1){
                // int random = (int)(Math.random()*6);
                int random = 2;

                

                    if (input1 == random){
                        brojacc1++;
                        System.out.println("Pogodjen, random broj je: " + random);
                    }
                    else{
                        System.out.println("noup, random broj je: " + random);
                    }

                    return brojacc1;
                    }


    
    

    public static int[] najveciBroj(int broj1, int broj2, int broj3){
        int broj = 0;
        Scanner skener = new Scanner(System.in);
        String a = "-------------------------------------";
        int[] pana = new int[3];
        pana[0] = broj1;2
        pana[1] = broj2;2
        pana[2] = broj3;0
        int[] sortirani = pana;
        Arrays.sort(sortirani);
        int c = 0;
        c = (int)(Math.max(Math.max(pana[0], pana[1]), pana[2]));
        if(sortirani[2]==sortirani[1] && sortirani[2]==sortirani[0]){
            System.out.println("Still in beta");
        }
        // preko obrnutog metoda razlicito sve zajedno pa unutar toga razlicito svako sa svakim i iz toga se dobija brojigraca1 i brojigraca2

        if(sortirani[2]==sortirani[1]){
            System.out.println("Da li zelite da nastavite ili da bude nereseno? ");
            int nastavi1 = skener.nextInt(); 
            System.out.println("Da li zelite da nastavite ili da bude nereseno? ");
            int nastavi2 = skener.nextInt(); 
            if(nastavi1==1 && nastavi2==1){
                int randomjds = (int)(Math.random()*99+1);
                System.out.println("Generisan je random broj od 1 do 100. Ko je blizi pobedjuje: ");
                System.out.println("Igrac broj" + brojigraca1 + " ");
                int tb1 = skener.nextInt();
                System.out.println("Igrac broj" + brojigraca2 + ": ");
                int tb2 = skener.nextInt();
                System.out.println("Random broj je bio: " + randomjds);
                int rezultat1 = Math.abs(randomjds - tb1);
                int rezultat2 = Math.abs(randomjds - tb2);
                if(rezultat1>rezultat2){
                    // tamo gde je sortirani[2] jednak nekom pani ali kako da matchujem to sa tim panom

                }
                else{
                    
                }
            }

        }
        
        
        for(int i=0;i<pana.length; i++){
        System.out.print(pana[i]+ " ");
        }
        System.out.println("");

        for(int i=0; i<pana.length; i++){
            if(c==pana[i]){
                broj = i+1;
            }
        }
        
        
        System.out.println("Pobedio je igrac broj " + pana[2]);
        System.out.println("Njegov rezultat je: " + c);
        System.out.println(a);

        for(int i=0; i<pana.length; i++){
            System.out.print("Igrac " + (i+1));
           System.out.println(a.substring(0, pana[i]));
        }
        return pana;
    }
        
    public static void sort(){

    }
}
