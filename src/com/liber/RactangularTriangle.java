package com.liber;
import static java.lang.Math.*;

class RactangularTriangle extends Figure
{
    double height;
    double width;
    double hypotenuse;

    RactangularTriangle(double height,double width)
    {
        this.height=height;
        this.width=width;
        this.hypotenuse = Math.sqrt((height*height)+(width*width));
    }

    double pole()
    {
        return height*width*(0.5);
    }

    double obwod()
    {
        return height+width+hypotenuse;
    }

    public String toString()
    {
        return "trójkąt prostokątny o bokach. a:"+height+" b:"+width+" c:"+hypotenuse;
    }
}