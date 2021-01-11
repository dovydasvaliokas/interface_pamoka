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

    public void piestiKvadrata()
    {
        this.piestiFigura('□', this.kiekKartuPiesti);
    }


    public void isvestiFigurosPavadinima()
    {
        System.out.println("kvadratas");
    }
}
