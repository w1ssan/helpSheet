public class MathHelpMethods {

    /**
     * checks if circle 1 intersects with circle 2 and returns true if it does
     * @param x1 int circle 1 x
     * @param y1 int circle 1 y
     * @param x2 int circle 2 x
     * @param y2 int circle 2 y
     * @param r1 int circle 1 radius
     * @param r2 int circle 2 radius
     * @return boolean
     */
    public static boolean CircleCollision(double x1, double y1, double x2, double y2, double r1, double r2){
        double d = Math.abs(Math.sqrt(((x2 - x1) * (x2 - x1))+ ((y2 - y1) * (y2 - y1))));
        System.out.println(d);
        return d < (r1 + r2);
    }

    /**
     * checks if given point(pX, pY) is inside of the given box and returns true if it does
     * @param x double box x
     * @param y double box y
     * @param width double box width
     * @param height double box height
     * @param pX double point x
     * @param pY double point y
     * @return boolean
     */
    public static boolean isInBox(double x, double y, double width, double height, double pX, double pY){
        if (pX >= x && pX <= (x + width) && pY >= y && pY <= (y + height)){
            return true;
        }else return false;
    }

    public static double volumBox(double l, double b, double h){
        return (l * b * h);
    }

    //Geometry

    //triangle
    /**
     * calculates and returns the area of a triangle
     * @param h double height
     * @param b double base
     * @return double area
     */
    public static double areaTriangle(double h, double b){
        return b * h/2;
    }

    /**
     * calculates and returns the circumference of a triangle
     * @param a double side a
     * @param b double side b
     * @param c double side c
     * @return double circumference
     */
    public static double circumferenceTriangle(double a, double b, double c){
        return a + b + c;
    }

    //rectangle
    /**
     * calculates and returns the area of a rectangle
     * @param l double length
     * @param h double height
     * @return double area
     */
    public static double areaRectangle(double l, double h){
        return l * h;
    }

    /**
     * calculates and returns the circumference of a rectangle
     * @param l double length
     * @param h double height
     * @return double circumference
     */
    public static double circumferenceRectangle(double l, double h){
        return (l*2) + (h*2);
    }

    //circle
    /**
     * calculates and returns the area of a circle
     * @param r double radius
     * @return double area
     */
    public static double areaCircle(double r){
        return Math.PI * (r * r);
    }

    /**
     * calculates and returns the circumference of a circle
     * @param r double radius
     * @return double circumference
     */
    public static double circumferenceCircle(double r){
        return 2 * Math.PI * r;
    }

    //ellipse
    /**
     * calculates and returns the area of a ellipse
     * @param a double big radius
     * @param b double small radius
     * @return double area
     */
    public static double areaEllipse(double a, double b){
        return Math.PI * a * b;
    }

    /**
     * calculates and returns the circumference of a ellipse
     * @param a double big radius
     * @param b double small radius
     * @return double circumference
     */
    public static double circumferenceEllipse(double a, double b){
        return 2 * Math.PI * Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / 2);
    }

    //trapezoid
    /**
     * calculates and returns the area of a trapezoid
     * @param a double base
     * @param b double second base
     * @param h double height
     * @return double area
     */
    public static double areaTrapezoid(double a, double b, double h){
        return 0.5 * (a + b) * h;
    }

    /**
     * calculates and returns the circumference of a trapezoid
     * @param a double side a
     * @param b double side b
     * @param c double side c
     * @param d double side d
     * @return double circumference
     */
    public static double circumferenceTrapezoid(double a, double b, double c, double d){
        return a + b + c + d;
    }

    //parallelogram
    /**
     * calculates and returns the area of a parallelogram
     * @param b double base
     * @param h double height
     * @return double area
     */
    public static double areaParallelogram(double b, double h){
        return b * h;
    }

    /**
     * calculates and returns the circumference of a parallelogram
     * @param l double length
     * @param w double height
     * @return double circumference
     */
    public static double circumferenceParallelogram(double l, double w){
        return (l*2) + (w*2);
    }

    //arc
    /**
     * calculates and returns the area of an arc
     * @param r double radius
     * @param a double angle
     * @return double area
     */
    public static double arcArea(double r, double a){
        if (a > 360 || a < 0){
            return 0;
        }
        return (Math.PI * Math.pow(r, 2)) * (a / 360);
    }
    /**
     * calculates and returns the length of an arc
     * @param r double radius
     * @param angle double angle
     * @return double arc length
     */
    public static double arcLength(double r, double angle){
        if (angle > 360 || angle < 0){
            return 0;
        }
        return (angle / 360.0) * (2 * Math.PI * r);
    }

    //hexagon
    /**
     * calculates and returns the area of a Hexagon
     * @param a double side
     * @return double area
     */
    public static double areaHexagon(double a){
        return (3 * Math.sqrt(3)) / 2 * (a * a);
    }

    /**
     * calculates and returns the circumference of a hexagon
     * @param a double side
     * @return double circumference
     */
    public static double circumferenceHexagon(double a){
        return a * 6;
    }

    //polygon
    /**
     * calculates and returns the area of a regular polygon
     * @param n double sides
     * @param ln double side length
     * @return double area
     */
    public static double areaRegularPolygon(double n, double ln){
        double angle = Math.toRadians(180 / n);
        angle = Math.tan(angle);
        return  ((ln * ln * n)/ (4 * angle));
    }

    /**
     * calculates and returns the circumference of a regular polygon
     * @param n double sides
     * @param ln double side length
     * @return double circumference
     */
    public static double circumferenceRegularPolygon(double n, double ln){
        return ln * n;
    }

    //3d geometry
    //sphere
    /**
     * calculates and returns the surface area of a sphere
     * @param r double radius
     * @return double surface area
     */
    public static double surfaceAreaSphere(double r){
        return 4 * Math.PI * (r * r);
    }

    /**
     * calculates and returns the volume of a sphere
     * @param r double radius
     * @return double volume
     */
    public static double volumeSphere(double r){
        return (4.0/3.0) * Math.PI * (r*r*r);
    }
    //cube

    /**
     * calculates and returns the surface area of a cube
     * @param a double edge
     * @return double surface area
     */
    public static double surfaceAreaCube(double a){
        return 6 * (a * a);
    }

    /**
     * calculates and returns the volume of a cube
     * @param a double edge
     * @return double volume
     */
    public static double volumeCube(double a){
        return a * a * a;
    }

    /**
     * calculates and returns the space diagonal of a cube
     * @param a double edge
     * @return double space diagonal
     */
    public static double spaceDiagonalCube(double a){
        return Math.sqrt(3) * a;
    }
    //cone

    /**
     * calculates and returns the surface area of a right circular Cone
     * @param r double radius
     * @param h double height
     * @return double surface area
     */
    public static double surfaceAreaCone(double r, double h){
        return Math.PI * r * (r + Math.sqrt((h*h) + (r * r)));
    }

    /**
     * calculates and returns the volume of a right circular Cone
     * @param r double radius
     * @param h double height
     * @return double surface area
     */
    public static double volumeCone(double r, double h){
        return Math.PI * (r * r) * (h / 3.0);
    }

    /**
     * calculates and returns the slant height of a right circular Cone
     * @param r double radius
     * @param h double height
     * @return double surface area
     */
    public static double slantHeightCone(double r, double h){
        return Math.sqrt((r * r) + (h * h));
    }

    //cylinder
    /**
     * calculates and returns the surface area of a Cylinder
     * @param r double radius
     * @param h double height
     * @return double surface area
     */
    public static double surfaceAreaCylinder(double r, double h){
        return 2 * Math.PI * r * h + 2 * Math.PI * (r * r);
    }

    /**
     * calculates and returns the volume of a cylinder
     * @param r double radius
     * @param h double height
     * @return double volume
     */
    public static double volumeCylinder(double r, double h){
        return Math.PI * (r * r) * h;
    }
    //tetrahedron
    /**
     * calculates and returns the surface area of a tetrahedron
     * @param a double edge
     * @return double surface area
     */
    public static double surfaceAreaTetrahedron(double a){
        return Math.sqrt(3) * (a * a);
    }

    /**
     * calculates and returns the volume of a tetrahedron
     * @param a double edge
     * @return double volume
     */
    public static double volumeTetrahedron(double a){
        return (a * a * a) / (6 * Math.sqrt(2));
    }
    //cuboid
    /**
     * calculates and returns the surface area of a cuboid
     * @param l double length
     * @param w double width
     * @param h double height
     * @return double surface area
     */
    public static double surfaceAreaCuboid(double l, double w, double h){
        return 2 * (w * l + h * l + h * w);
    }

    /**
     * calculates and returns the volume of a cuboid
     * @param l double length
     * @param w double width
     * @param h double height
     * @return double volume
     */
    public static double volumeCuboid(double l, double w, double h){
        return w * h * l;
    }

    //icosahedron

    //torus
    /**
     * calculates and returns the area of a torus
     * @param R double Major radius
     * @param r double Minor radius
     * @return double area
     */
    public static double areaTorus(double R, double r){
        return (2 * Math.PI * R) * (2 * Math.PI * r);
    }

    /**
     * calculates and returns the volume of a torus
     * @param R double Major radius
     * @param r double Minor radius
     * @return double volume
     */
    public static double volumeTorus(double R, double r){
        return (Math.PI * Math.pow(r, 2)) * (2 * Math.PI * R);
    }

    //ellipsoid
    /**
     * calculates and returns the surface area of an ellipsoid
     * @param a double axis
     * @param b double axis
     * @param c double axis
     * @return double surface area
     */
    public static double surfaceAreaEllipsoid(double a, double b, double c){
        return 4 * Math.PI * Math.pow((Math.pow(a * b, 1.6) +
                Math.pow(a * c, 1.6) + Math.pow(b * c, 1.6)) /
                3, 1 / 1.6);
    }

    /**
     * calculates and returns the volume of an ellipsoid
     * @param a double axis
     * @param b double axis
     * @param c double axis
     * @return double volume
     */
    public static double volumeEllipsoid(double a, double b, double c){
        return (4.0 / 3.0) * Math.PI * a * b * c;
    }

    //octahedron
    /**
     * calculates and returns the surface area of an octahedron
     * @param a double edge
     * @return double surface area
     */
    public static double surfaceAreaOctahedron(double a){
        return 2 * Math.sqrt(3) * Math.pow(a , 2);
    }

    /**
     * calculates and returns the volume of a octahedron
     * @param a double edge
     * @return double volume
     */
    public static double volumeOctahedron(double a){
        return (Math.sqrt(2) / 3) * Math.pow(a,3);
    }

    //square pyramid
    /**
     * calculates and returns the surface area of a Square pyramid
     * @param a double base edge
     * @param h double height
     * @return double surface area
     */
    public static double surfaceAreaSquarePyramid(double a, double h){
        return (a * a) + 2 * a * Math.sqrt((Math.pow(a, 2)/4.0) + Math.pow(h, 2));
    }

    /**
     * calculates and returns the volume of a square pyramid
     * @param a double base edge
     * @param h double height
     * @return double volume
     */
    public static double volumeSquarePyramid(double a, double h){
        return (a * a) * (h / 3);
    }

    //pentagonal pyramid

    //hexagonal pyramid

    //triangular prism
    /**
     * calculates and returns the volume of a triangular prism
     * @param a double side a
     * @param b double side b
     * @param c double side c
     * @param h double height
     * @return double volume
     */
    public static double volumeTriangularPrism(double a, double b, double c, double h){
        return (1.0 / 4.0) * h * Math.sqrt(-(Math.pow(a, 4)) + 2 * Math.pow((a * b), 2) + 2 * Math.pow((a * c), 2) - Math.pow(b, 4) + 2 * Math.pow((b * c), 2) - Math.pow(c, 4));
    }

    //hexagonal prism
    /**
     * calculates and returns the surface area of a hexagonal prism
     * @param a double base edge
     * @param h double height
     * @return double surface area
     */
    public static double surfaceHexagonalPrism(double a, double h){
        return 6 * a * h + 3 * Math.sqrt(3) * Math.pow(a, 2);
    }

    /**
     * calculates and returns the volume of a hexagonal prism
     * @param a double base edge
     * @param h double height
     * @return double volume
     */
    public static double volumeHexagonalPrism(double a, double h){
        return (3 * Math.sqrt(3) / 2) * Math.pow(a, 2) * h;
    }
    //pentagonal prism
    //octagonal prism


}
