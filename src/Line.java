package src;

public class Line
{
    // Geradengleichung X = A + l B

    Point A;
    Vector B;

    Line(Point A, Vector B){
        this.A = A;
        this.B = B;
    }

    Point intersects(Line d) {
        return null;
    }
    
    double distanceTo(Line l) {
        return 0;
        // TODO
    }
    
    // Schnittwinkel mit einer Ebene bestimmen
    double angleTo(Plane p) {
        return 0;
    }
    
    // "Schnittwinkel" mit einer anderen Geraden bestimmen
    double angleTo(Line l) {
        return 0;
    }
    
    
    
}
