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

      /*  String[] eiluciuMasyvas;
        ArrayList<String> eiluciuSarasas; */

        // Bandome atsidaryti failą (tikrinama ar egzistuoja jis)
        try
        {
            // Failo skaitytuvo susikūrimas
            // Scanner arba BufferedReader yra populiariausios/plačiam vartojimui tinkamiausios
            Scanner failoSkaitytuvas = new Scanner(failas);

            // Einame per visą failą ir kol yra eilučių, tol jas nuskaitome ir kiekvienai eilutei atliekame veiksmus:
            // Šiuo atveju išsaugome duomenis kažkur į savo programos kintamuosius
            while (failoSkaitytuvas.hasNextLine())
            {
                // Nuskaitome eilutę ir ją priskiriame laikinajam kintamajui
                String eilute = failoSkaitytuvas.nextLine();

                /* Isvedame nuskaityta eilutę - ištestuojame ar veikia nuskaitymas iš failo
                System.out.println(eilute); */

            }
        }
        // Jeigu išmestų "nėra tokio failo" išimtį (exception)
        catch (FileNotFoundException exceptionKintamasis)
        {
            // Daryti kažkokius veiksmus, jeigu išmestų "nėra failo" exceptioną
            System.out.println("Nėra failo");
            exceptionKintamasis.printStackTrace();              // išveda į konsolę erroro kodą
        }

        // Susikuriame naują Kvadratas klasės objektą, jog išestuotume ar Kvadratas klasė tikrai veikia.
        Kvadratas testKvadratas = new Kvadratas();
        testKvadratas.piestiFigura(5);
        testKvadratas.piestiFigura(8);
        testKvadratas.isvestiFigurosPavadinima();

    }
}
