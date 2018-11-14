package com.liber;

abstract class Figure //nie mozna tworzyc instancji tej klasy
{
    abstract double pole(); //metoda abstrakcyjna
    abstract double obwod();

    void info()
    {
        System.out.println(this);
    }
}