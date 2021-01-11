public abstract class FiguraAbstrakti implements Figura
{
    // Norime padaryti, jog visos 3 klasės (Kvadrato, Apskritimo, Trikampio) turėtų "skirtingus" metodus - vienas išvestų kvadratą ir t..t.
    // Tą galime 3 būdais:
    // 1-asis būdas: kiekviena klasė turi skirtingą metodą, jie skirtingai aprašyti bei deklaruojami - kitaip sakant,
    // Abstrakčioje klasėje to metodo neaprašinėjame - tiesiog kiekviena klasė atskirai implementuoja
    // 2-asis būdas: pasirašyti "bendrą" metodą šioje abstrakčioje klasėje, o po to specifinėse klasėse (Kv, Apsk, Trikamp)
    // Susikurti papildomus metodus, pvz.: piestiKvadrata(), piestiApskritima(), piestiTrikampi()
    // Tuose metoduose "kreiptumėmės" į šį pagrindinį metodą abstrakčioje klasėje
    // 3-asis būdas: susikurti bendrą "griautinį" metodą abstrakčioje klasėje
    // Ir specifinėse klasėse jį "overridinti" - kitaip sakant tam pačiam metodo vardui suteikti naują body (kūną/vidų)

    public void piestiFigura(char simbolis, int kiekKartuPiesti)
    {
        // Ciklas, jei pradedant nuo 1 šiuo atveju (tada ženklas bus mažiau arba lygu)
        for (int i = 1; i <= kiekKartuPiesti; i++)
        {
            System.out.print(simbolis);
        }
        System.out.println("");
    }

    public void isvestiFigurosPavadinima()
    {
        System.out.print("Šios figūros pavadinimas yra: ");
    }
}
