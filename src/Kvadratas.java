public class Kvadratas extends FiguraAbstrakti
{
    private int kiekKartuPiesti;

    // Susikuriame tuščią konstruktorių
    public Kvadratas()
    {

    }

    // Susikuriame pilną konstruktorių
    public Kvadratas(int kiekKartuPiesti)
    {
        this.kiekKartuPiesti = kiekKartuPiesti;
    }

    // Klasė turi aprašyti kiekvieną metodą esantyje "Figura" interface
    // Interface aprašomi metodai
 /*   public void piestiFigura()
    {
        // Ciklas, jei pradedant nuo 1 šiuo atveju (tada ženklas bus mažiau arba lygu)
        for (int i = 1; i <= kiekKartuPiesti; i++)
        {
            System.out.print("□");
        }
        System.out.println("");
    } */

    // Naudojant antrąjį būdą - susikuriant metodus su skirtingais vardais
    public void piestiKvadrata()
    {
        this.piestiFigura('□', this.kiekKartuPiesti);
    }

    // Trečiasis būdas - perrašant abstrakčios klasės "default" metodą
    // Iš tikrųjų kadangi skiriasi parametrų skaičius, tai šiuo atveju overloadinamas yra metodas.
    public void piestiFigura()
    {
        super.piestiFigura('□', this.kiekKartuPiesti);
    }

    // "Dirbtinis" metodo perrašymas. Kadangi tiesiog vis vien išvesdami objektą nenorėsime paduoti parametrų papildomų,
    // O tiesiog naudoti Overloadintą metodą, kuris yra viršuja per vieną nuo šito.
    @Override
    public void piestiFigura(char simbolis, int kiekKartuPiesti)
    {
        // Ciklas, jei pradedant nuo 1 šiuo atveju (tada ženklas bus mažiau arba lygu)
        for (int i = 1; i <= kiekKartuPiesti; i++)
        {
            System.out.print('□');
        }
        System.out.println("");
    }

    @Override
    public void isvestiFigurosPavadinima()
    {
        super.isvestiFigurosPavadinima();
        System.out.print(" kvadratas");
        System.out.println();
    }

    /* figuros atskiras išvedimas užkomentuotas
    public void isvestiFigurosPavadinima()
    {
        System.out.println("kvadratas");
    }*/
}
