package person.liber;
import java.lang.String;

class Osoba
{
    String pesel;
    String name;
    String surname;
    int yearOfBirth;

    Osoba(String pesel, String name, String surname, int yearOfBirth){
        this.pesel = pesel;
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public String toString()
    {
        return "Pesel: "+pesel+", Imię: "+name+", Nazwisko: "+surname+", Rok urodzenia:"+yearOfBirth;
    }
}


interface Przeszukiwalne
{
    boolean czyPasuje(String wzorzec);
}


abstract class Dokument implements Przeszukiwalne
{

}


class Paszport extends Dokument
{
    Osoba owner;
    int passNumber;

    Paszport(Osoba other, int passNumber)
    {
        this.owner = other;
        this.passNumber = passNumber;
    }

    public boolean czyPasuje(String wzorzec)
    {
        return false;
    }

    public String toString()
    {
        return "";
    }
}


class DowodOsobisty extends Dokument
{
    Osoba owner;
    String serial;

    DowodOsobisty(Osoba other, String serial)
    {
        this.owner = other;
        this.serial = serial;
    }

    public boolean czyPasuje(String wzorzec)
    {
        return false;
    }

    public String toString()
    {
        return "";
    }
}


public class Program
{
    public static void main(String[] args)
    {
        Osoba person96290034040 = new Osoba("96290034040", "Maciej", "Gorniak", 1994);
        System.out.println(person96290034040);

        Dokument[] bazaDanych={new Paszport(),new DowodOsobisty(),new Paszport()};
        System.out.println(bazaDanych);

        Dokument z;
        String wzorzec="Gorniak";

        for(int i=0; i<bazaDanych.length; i++)
        {
            z = bazaDanych[i];
            if(z.czyPasuje(wzorzec))System.out.println("znaleziono: "+z);
        }
    }
}