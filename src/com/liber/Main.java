package com.liber;
import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        /** ||||||||||||||||||||||| Zadanie 4.4 ||||||||||||||||||||||||| */
        System.out.println("########################4.4###########################");

        Figure z=new Circle(2);
        z.info();

        Figure[] alfa={new Prostokat(3,5),new Circle(8),new Circle(3)};

        Figure x;
        double suma=0;

        Figure triangletest = new RactangularTriangle(2, 4);
        triangletest.info();
        System.out.println(triangletest.pole());
        System.out.println(triangletest.obwod());


        for(int i=0;i<alfa.length;i++)
        {
            x=alfa[i];
            x.info();
            suma=suma+x.pole();
        }

        System.out.println("suma pol figur: "+suma);



        /** ||||||||||||||||||||||| Zadanie 4.1 - 4.3 ||||||||||||||||||||||||| */
        System.out.println("########################4.1###########################");
        Point bVertex = new Point(3,3);
        NewRectangle b=new NewRectangle(bVertex, 1,2);
        b.info();

        Point aVertex = new Point(1,2);
        NewRectangle a=new NewRectangle(aVertex,1, 2);
        a.info();


        if(a.ifAdjoins(b))
        {
            System.out.println("-- przystaje --\n");
        }
        else
        {
            System.out.println("-- NIE przystaje --\n");
        }


        if(a.intersects(b))
        {
            System.out.println("-- przecinaja sie --\n");
        }
        else
        {
            System.out.println("-- NIE przecinaja sie --\n");
        }


        a.translate(5,3);
        a.info();

        if(a.intersects(b))
        {
            System.out.println("-- przecinaja sie --\n");
        }
        else
        {
            System.out.println("-- NIE przecinaja sie --\n");
        }
    }
}
