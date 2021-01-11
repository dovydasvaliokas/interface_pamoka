public class Trikampis extends FiguraAbstrakti
{
    private int kiekKartuPiesti;

    // Susikuriame tuščią konstruktorių
    public Trikampis()
    {

    }

    // Pilnas konstruktorius
    public Trikampis(int kiekKartuPiesti)
    {
        this.kiekKartuPiesti = kiekKartuPiesti;
    }

    // Klasė turi aprašyti kiekvieną metodą esantyje "Figura" interface
    // Interface aprašomi metodai
  /*  public void piestiFigura()
    {
        // Ciklas, jei pradedant nuo 0 šiuo atveju (tada ženklas bus mažiau)
        for (int i = 0; i < kiekKartuPiesti; i++)
        {
            System.out.print("△");
        }
        System.out.println();
    }*/

    public void piestiTrikampi()
    {
        this.piestiFigura('△', this.kiekKartuPiesti);
    }

    public void isvestiFigurosPavadinima()
    {
        System.out.println("trikampis");
    }
}
