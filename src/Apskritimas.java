public class Apskritimas implements Figura
{
    // Susikuriame tuščią konstruktorių
    public Apskritimas()
    {

    }

    // Klasė turi aprašyti kiekvieną metodą esantyje "Figura" interface
    // Interface aprašomi metodai
    public void piestiFigura(int kiekKartuPiesti)
    {
        // Ciklas, jei pradedant nuo 1 šiuo atveju (tada ženklas bus mažiau arba lygu)
        for (int i = 1; i <= kiekKartuPiesti; i++)
        {
            System.out.print("○");
        }
        System.out.println("");
    }


    public void isvestiFigurosPavadinima()
    {
        System.out.println("apskritimas");
    }
}
