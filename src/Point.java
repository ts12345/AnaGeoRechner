package src;

class Point
{
    double x;
    double y;
    double z;

    Point() {
        x = 0;
        y = 0;
        z = 0;
    }

    Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    int whichOctant() {
        if(x >= 0 && y >= 0 && z >= 0) return 1;
        if(x < 0 && y >= 0 && z >= 0) return 2;
        if(x < 0 && y < 0 && z >= 0) return 3;
        if(x >= 0 && y < 0 && z >= 0) return 4;
        if(x >= 0 && y >= 0 && z < 0) return 5;
        if(x < 0 && y >= 0 && z < 0) return 6;
        if(x < 0 && y < 0 && z < 0) return 7;
        if(x >= 0 && y < 0 && z < 0) return 8;
        return 0;
    }

     double distanceTo(Point p) {
        double dx = p.x - x;
        double dy = p.y - y;
        double dz = p.z - z;
        return Math.sqrt(dx*dx + dy*dy + dz*dz);
    }

         
}
