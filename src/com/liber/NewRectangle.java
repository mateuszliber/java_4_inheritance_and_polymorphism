package com.liber;
import java.awt.*;

class NewRectangle extends Rectangle
{
    Point vertex;

    /*funkcja super() służy do wywoływania konstruktorów klasy nadrzędnej*/
    NewRectangle(Point vertex, int height, int width)
    {
        super(width, height);
        this.vertex = vertex;
    }

    /*Służy do zwrócenia informacji o tej klasie, jej konstruktorze*/
    void info()
    {
        System.out.println(this.vertex);
        System.out.println(this);
    }

    boolean ifAdjoins(NewRectangle other){

        System.out.println(this.vertex.x+" "+this.vertex.y+" "+this.height+" "+this.width);
        System.out.println(other.vertex.x+" "+other.vertex.y+" "+other.height+" "+other.width);

        System.out.println(other.vertex.y-other.height);

        if((this.vertex.x == other.vertex.x) && (this.vertex.y >= other.vertex.y) && (this.vertex.y-this.height <= other.vertex.y-other.height)){
            return true;
        } else if((this.vertex.x+this.width == other.vertex.x+other.width) && (this.vertex.y >= other.vertex.y) && (this.vertex.y-this.height <= other.vertex.y-other.height)){
            return true;
        } else if((this.vertex.y == other.vertex.y) && (this.vertex.x <= other.vertex.x) && (this.vertex.x+this.width >= other.vertex.x-other.width)) {
            return true;
        } else if((this.vertex.y-this.height == other.vertex.y-other.height) && (this.vertex.x <= other.vertex.x) && (this.vertex.x+this.width >= other.vertex.x-other.width)) {
            return true;
        } else if((this.vertex.x+this.width == other.vertex.x) && (this.vertex.y >= other.vertex.y) && (this.vertex.y-this.height <= other.vertex.y-other.height)){
            return true;
        } else if((this.vertex.x == other.vertex.x+other.width) && (this.vertex.y >= other.vertex.y) && (this.vertex.y-this.height <= other.vertex.y-other.height)){
            return true;
        } else if(((this.vertex.y - this.height) == other.vertex.y) && (this.vertex.x <= other.vertex.x) && ((this.vertex.x + this.width) >= (other.vertex.x - other.width))) {
            return true;
        } else if((this.vertex.y == (other.vertex.y - other.height)) && (this.vertex.x <= other.vertex.x) && ((this.vertex.x + this.width) >= (other.vertex.x - other.width))) {
            return true;
        } else {
            System.out.println("FALSE");
            return false;
        }
    }
}
