package com.liber;

class Circle extends Figure
{
    double promien;

    Circle(double promien)
    {
        this.promien=promien;
    }

    double pole()
    {
        return 3.14*promien*promien;
    }

    double obwod()
    {
        return 2*3.14*promien;
    }

    public String toString()
    {
        return "okrag o pr. "+promien;
    }
}