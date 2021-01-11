public class Trikampis implements Figura
{
    // Susikuriame tuščią konstruktorių
    public Trikampis()
    {

    }

    // Klasė turi aprašyti kiekvieną metodą esantyje "Figura" interface
    // Interface aprašomi metodai
    public void piestiFigura(int kiekKartuPiesti)
    {
        // Ciklas, jei pradedant nuo 0 šiuo atveju (tada ženklas bus mažiau)
        for (int i = 0; i < kiekKartuPiesti; i++)
        {
            System.out.print("△");
        }
        System.out.println();
    }

    public void isvestiFigurosPavadinima()
    {
        System.out.println("trikampis");
    }
}
