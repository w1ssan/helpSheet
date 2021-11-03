public class MethodTester {
    public static void main(String[] args) {
        PrintMethods.vokalTrekant(5);
        System.out.println(MathHelpMethods.CircleCollision(5, 5, 5, 9, 2, 2));
        System.out.println(MathHelpMethods.isInBox(10, 10, 100, 100, 110, 110));

        System.out.println("Area of a circle = " + MathHelpMethods.areaCircle(15));
        System.out.println("Circumference of a circle = " + MathHelpMethods.circumferenceCircle(15));
        System.out.println("Area of a Ellipse = " + MathHelpMethods.areaEllipse(12, 10));
        System.out.println("Circumference of a Ellipse = " + MathHelpMethods.circumferenceEllipse(12, 10));
        System.out.println("Area of a trapezoid = " + MathHelpMethods.areaTrapezoid(12, 6, 4));
        System.out.println("Arc Area = " + MathHelpMethods.arcArea(20, 145));
        System.out.println("Arc Length = " + MathHelpMethods.arcLength(4, 30));
        System.out.println("Area of a Hexagon = " + MathHelpMethods.areaHexagon(15));
        System.out.println("Area of a Regular Polygon = " + MathHelpMethods.areaRegularPolygon(7, 6));

        System.out.println("Surface Area of a Sphere = " + MathHelpMethods.surfaceAreaSphere(14));
        System.out.println("Volume of a Sphere = " + MathHelpMethods.volumeSphere(14));

        System.out.println("Surface Area of a Cube = " + MathHelpMethods.surfaceAreaCube(14));
        System.out.println("Volume of a Cube = " + MathHelpMethods.volumeCube(14));
        System.out.println("Space Diagonal of a Cube = " + MathHelpMethods.spaceDiagonalCube(14));

        System.out.println("Surface Area of a Cone = " + MathHelpMethods.surfaceAreaCone(15, 10));
        System.out.println("Volume of a Cone = " + MathHelpMethods.volumeCone(14, 15));
        System.out.println("Slant height of a Cone = " + MathHelpMethods.slantHeightCone(15, 10));

        System.out.println("Surface Area of a Cylinder = " + MathHelpMethods.surfaceAreaCylinder(15, 10));
        System.out.println("Volume of a Cylinder = " + MathHelpMethods.volumeCylinder(14, 15));

        System.out.println("Surface Area of a Tetrahedron = " + MathHelpMethods.surfaceAreaTetrahedron(15));
        System.out.println("Volume of a Tetrahedron = " + MathHelpMethods.volumeTetrahedron(15));

        System.out.println("Surface Area of a Cuboid = " + MathHelpMethods.surfaceAreaCuboid(15, 12, 17));
        System.out.println("Volume of a Cuboid = " + MathHelpMethods.volumeCuboid(15, 12, 17));

        System.out.println("Volume of a Triangular prism = " + MathHelpMethods.volumeTriangularPrism(15, 12, 17, 20));

        System.out.println("Surface Area of a Square Pyramid = " + MathHelpMethods.surfaceAreaSquarePyramid(15, 12));
        System.out.println("Volume of a Square Pyramid = " + MathHelpMethods.volumeSquarePyramid(15, 12));

        System.out.println("Surface Area of a Torus = " + MathHelpMethods.areaTorus(15, 12));
        System.out.println("Volume of a Square Torus = " + MathHelpMethods.volumeTorus(15, 12));

        System.out.println("Surface Area of a Ellipsoid = " + MathHelpMethods.surfaceAreaEllipsoid(15, 12, 18));
        System.out.println("Volume of a Square Ellipsoid = " + MathHelpMethods.volumeEllipsoid(15, 12, 18));

        System.out.println("Surface Area of a Octahedron = " + MathHelpMethods.surfaceAreaOctahedron(15));
        System.out.println("Volume of a Square Octahedron = " + MathHelpMethods.volumeOctahedron(15));

        System.out.println("Surface Area of a Hexagonal prism = " + MathHelpMethods.surfaceHexagonalPrism(15, 20));
        System.out.println("Volume of a Square Hexagonal prism = " + MathHelpMethods.volumeHexagonalPrism(15, 20));

        System.out.println("Surface Area of a Pentagonal prism = " + MathHelpMethods.surfacePentPrism(15, 20));
        System.out.println("Volume of a Square Pentagonal prism = " + MathHelpMethods.volumePentPrism(15, 20));

        System.out.println("Surface Area of a Hexagonal pyramid = " + MathHelpMethods.surfaceHexPyramid(15, 20));
        System.out.println("Volume of a Square Hexagonal pyramid = " + MathHelpMethods.volumeHexPyramid(15, 20));

        System.out.println("Surface Area of a octagonal prism = " + MathHelpMethods.surfaceOctaPrism(15, 20));
        System.out.println("Volume of a Square octagonal prism= " + MathHelpMethods.volumeOctaPrism(15, 20));
    }
}
