public class Kvadratas implements Figura
{
    // Susikuriame tuščią konstruktorių
    public Kvadratas()
    {

    }

    // Klasė turi aprašyti kiekvieną metodą esantyje "Figura" interface
    // Interface aprašomi metodai
    public void piestiFigura(int kiekKartuPiesti)
    {
        for (int i = 1; i <= kiekKartuPiesti; i++)
        {
            System.out.print("□");
        }
        System.out.println("");
    }

    public void isvestiFigurosPavadinima()
    {
        System.out.println("kvadratas");
    }
}
