package src;

class Vector
{
    double x;
    double y;
    double z;

    Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Vector from A to B
     */
    Vector(Point A, Point B) {
        x = B.x - A.x;
        y = B.y - A.y;
        z = B.z - A.z;
    }
    
    Vector(Point p) {
        // TODO
    }


    static Vector crossProduct(Vector u, Vector v) {
        double x = u.y * v.z - u.z * v.y;
        double y = u.z * v.x - u.x * v.z;
        double z = u.x * v.y - u.y * v.x;
        return new Vector(x, y, z);
    }

    static double dotProduct(Vector u, Vector v) {
        return u.x * v.x + u.y * v.y + u.z * v.z;
    }

    @Override
    public boolean equals(Object o) {  
        if (o == this) { 
            return true; 
        } 

        if (!(o instanceof Vector)) { 
            return false; 
        } 

        Vector v = (Vector) o; 

        return 
        Double.compare(x, v.x) == 0 &&         
        Double.compare(y, v.y) == 0 &&
        Double.compare(z, v.z) == 0;
    }     

    public double length() {
        double l = Math.sqrt(x*x + y*y + z*z);
        return l;
    }

    Vector times (double t) {
        x = x * t;
        y = y * t;
        z = z * t;
        return new Vector(x, y, z);      
    }

    double winkelZu(Vector v) {
        double phi = Math.acos(dotProduct(this, v)/(this.length() * v.length()))/Math.PI*180;
        return phi;   
    }

}
