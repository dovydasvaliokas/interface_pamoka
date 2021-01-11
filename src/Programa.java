import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa
{
    public static void main (String[] args)
    {
        // Sukuriame tekstinio failo objektą (naudojamos Java klasės)
        String failoNuoroda = "duomenys.txt";            // nuoroda į failą esanį projekto aplanke
        File failas = new File(failoNuoroda);              // File klasės naujo objekto konstruktoriuj paduodame failo nuorodą

        // Susikuriame figūrų sąrašą(arraylist)
        ArrayList<Kvadratas> figuruSarasas = new ArrayList<>();
        ArrayList<Object> visuFiguruSarasas = new ArrayList<>();

      /*  String[] eiluciuMasyvas;
        ArrayList<String> eiluciuSarasas; */

        // Bandome atsidaryti failą (tikrinama ar egzistuoja jis)
        try
        {
            // Failo skaitytuvo susikūrimas
            // Scanner arba BufferedReader yra populiariausios/plačiam vartojimui tinkamiausios
            Scanner failoSkaitytuvas = new Scanner(failas);

       //     int eilutesNumeris = 0;

            // Einame per visą failą ir kol yra eilučių, tol jas nuskaitome ir kiekvienai eilutei atliekame veiksmus:
            // Šiuo atveju išsaugome duomenis kažkur į savo programos kintamuosius
            while (failoSkaitytuvas.hasNextLine())
            {
                // Nuskaitome eilutę ir ją priskiriame laikinajam kintamajui
                String eilute = failoSkaitytuvas.nextLine();
                // Eilutę išskaidome (per kablelį) į skirtingus kintamuosius (naudojant String.split(",") metodą
                String[] eilutesKintamieji = eilute.split(",");

                // Jeigu eilutėje yra nurodyta Kvadrato figūros tipas
                if (eilutesKintamieji[0].equals("k"))
                {
                    int laikinasKiekPiesti = Integer.parseInt(eilutesKintamieji[1]);
                    Kvadratas laikinasKv = new Kvadratas(laikinasKiekPiesti);
                    visuFiguruSarasas.add(laikinasKv);
                }

                // Jeigu eilutėje yra nurodyta Trikampio figūros tipas
                if (eilutesKintamieji[0].equals("t"))
                {
                    int laikinasKiekPiesti = Integer.parseInt(eilutesKintamieji[1]);
                    Trikampis laikinasTrikamp = new Trikampis(laikinasKiekPiesti);
                    visuFiguruSarasas.add(laikinasTrikamp);
                }

                // Jeigu eilutėje yra nurodyta Trikampio figūros tipas
                if (eilutesKintamieji[0].equals("a"))
                {
                    int laikinasKiekPiesti = Integer.parseInt(eilutesKintamieji[1]);
                    Apskritimas laikinasApsk = new Apskritimas(laikinasKiekPiesti);
                    visuFiguruSarasas.add(laikinasApsk);
                }

                /* Isvedame nuskaityta eilutę - ištestuojame ar veikia nuskaitymas iš failo
                System.out.println(eilute); */

                // Jeigu eilutesNumeris yra lygus 0, tada reiškiasi, jog čia yra pirmoji tekstinio failo eilutė
                // Pabandysime tą eilutę išsisaugoti į Kvadratas klasės objektą
                // Bei po to pratestuosime tu pačia eilute ir kitus Klasės objektus ar jie veikia
           /*     if (eilutesNumeris == 0)
                {
                    // Kiek kartų piešti kintamasis yra String tipo, kadangi nuskaito iš tekstinio failo
                    // Todėl mums jį reikia konvertuoti iš String į int tipo kintamąjį
                    // Papildomas/pasirinktinis: galima su try ir catch "įvertinti" NumberFormatException
                    int kiekKartuPiestiInt = Integer.parseInt(eilutesKintamieji[1]);

                    Kvadratas testPirmasKvad = new Kvadratas(kiekKartuPiestiInt);            // susikuriame nauja Kvadrato objektą
                    Trikampis testPirmasTr = new Trikampis(kiekKartuPiestiInt);
                    Apskritimas testPirmasApsk = new Apskritimas(kiekKartuPiestiInt); */
                 /*   // Bandoma įdėti pirmos eilutės variantus (visų klasių) į tą vieną sąrašą (figuruSarasas)
                    // Kvadrato objektas prisidės - kadangi ArrayList Kvadrato klasės, tačiau Trikampis mes klaidą - nes netinkami tipai.
                    figuruSarasas.add(testPirmasKvad);
                    figuruSarasas.add(testPirmasTr); */
             /*       visuFiguruSarasas.add(testPirmasKvad);
                    visuFiguruSarasas.add(testPirmasTr);
                    visuFiguruSarasas.add(testPirmasApsk);

                    System.out.println(visuFiguruSarasas.size());

                    // Išvedama pirma eilutė kiekvienai klasei - patikrinti ar klasių išvedimas vienai eilutei veikia kiekvienos
                    testPirmasKvad.piestiFigura();
                    testPirmasTr.piestiFigura();
                    testPirmasApsk.piestiFigura();
                }
                Baigiasi vienos eilutės testavimas*/
            //    eilutesNumeris++;

            }
        }
        // Jeigu išmestų "nėra tokio failo" išimtį (exception)
        catch (FileNotFoundException exceptionKintamasis)
        {
            // Daryti kažkokius veiksmus, jeigu išmestų "nėra failo" exceptioną
            System.out.println("Nėra failo");
            exceptionKintamasis.printStackTrace();              // išveda į konsolę erroro kodą
        }

        /*// Susikuriame naują Kvadratas klasės objektą, jog išestuotume ar Kvadratas klasė tikrai veikia.
        Kvadratas testKvadratas = new Kvadratas();
        testKvadratas.piestiFigura(5);
        testKvadratas.piestiFigura(8);
        testKvadratas.isvestiFigurosPavadinima();*/


        // Atlikus veiksmus su tekstiniu failu (tai po try ir catch programos blokų)
        // Galime atlikti veiksmus su objektų sąrašu, į kurį ir išsaugojome tekstinio failo duomenis
        for (int i = 0; i < visuFiguruSarasas.size(); i++)
        {
            System.out.println("Nupiešta figūra: ");
            // Jeigu visu figūrų sąrašo (Object klasės sąrašo) elementas yra Kvadratas
            if (visuFiguruSarasas.get(i) instanceof Kvadratas)
            {
                ((Kvadratas) visuFiguruSarasas.get(i)).piestiFigura();
                ((Kvadratas) visuFiguruSarasas.get(i)).isvestiFigurosPavadinima();
            }

            // Jeigu visu figūrų sąrašo (Object klasės sąrašo) elementas yra Trikampis
            if (visuFiguruSarasas.get(i) instanceof Trikampis)
            {
                ((Trikampis) visuFiguruSarasas.get(i)).piestiTrikampi();
                ((Trikampis) visuFiguruSarasas.get(i)).isvestiFigurosPavadinima();
            }

            // Jeigu visu figūrų sąrašo (Object klasės sąrašo) elementas yra Apskritimas
            if (visuFiguruSarasas.get(i) instanceof Apskritimas)
            {
                ((Apskritimas) visuFiguruSarasas.get(i)).piestiApskritima();
                ((Apskritimas) visuFiguruSarasas.get(i)).isvestiFigurosPavadinima();
            }
        /*    Kvadratas kv = (Kvadratas) visuFiguruSarasas.get(0);
            kv.piestiFigura();
          //  visuFiguruSarasas.get(i).piestiFigura(); */
        }
    }
}
