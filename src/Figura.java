public interface Figura
{
    // Interface'o metodai yra automatiškai visi public (vieši) bei abstract (abstraktūs, nereikia to pačio metodo "body"/vidus)
    public abstract void piestiFigura(char simbolis, int kiekKartuPiesti);
    // Todėl nereikia rašyti public ir abstract
    void isvestiFigurosPavadinima();
}
