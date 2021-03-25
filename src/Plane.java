package src;

class Plane
{
    Vector n; // Normalenvektor
    Vector A; // Ortsvektor Aufpunkt

    Plane(Vector n, Vector A) {
        this.n = n;
        this.A = A;
    }    

    @Override
    public boolean equals(Object o) {  
        if (o == this) { 
            return true; 
        } 

        if (!(o instanceof Plane)) { 
            return false; 
        } 

        Plane p = (Plane) o;

        // Kollineare Normalenvektoren?
        boolean collinearNormalvectors = n.isCollinear(p.n);
        
        // A in Plane p?
        boolean planeContainsA = p.contains(new Point(p.A));
        
        return planeContainsA && collinearNormalvectors;
        

    }  

    // Ebene durch 3 Punkte A, B, C
    Plane(Point A, Point B, Point C) {

    }

    // Ebene in Parameterform X = A + a u +  b v
    Plane(Vector A, Vector u, Vector v) {

    }

    double distanceTo(Point A) {
        return 0;        
    }

    boolean contains(Point A) {
        return true;        
    }

    boolean contains(Line l) {
        return true;        
    }


}
