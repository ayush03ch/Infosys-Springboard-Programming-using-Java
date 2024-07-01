class Point {
    private double xCoordinate;
    private double yCoordinate;

    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public double calculateDistance() {
        double distance = Math.sqrt(xCoordinate * xCoordinate + yCoordinate * yCoordinate);
        distance = Math.round(distance * 100.0) / 100.0; // Round to 2 decimal places
        return distance;
    }

    public double calculateDistance(Point point) {
        double deltaX = this.xCoordinate - point.xCoordinate;
        double deltaY = this.yCoordinate - point.yCoordinate;
        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        distance = Math.round(distance * 100.0) / 100.0; // Round to 2 decimal places
        return distance;
    }

    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getxCoordinate() {
        return xCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }
}



class Tester {
    public static void main(String[] args) {
        Point point1 = new Point(3.5, 1.5);
        Point point2 = new Point(6, 4);

        System.out.println("Distance of point1 from origin is " + point1.calculateDistance());
        System.out.println("Distance of point2 from origin is " + point2.calculateDistance());
        System.out.println("Distance between point1 and point2 is " + point1.calculateDistance(point2));

        // Additional test cases
        Point origin = new Point(0, 0);
        System.out.println("Distance of origin from itself is " + origin.calculateDistance());
        System.out.println("Distance of point1 from itself is " + point1.calculateDistance(point1));
        System.out.println("Distance of point2 from itself is " + point2.calculateDistance(point2));
    }
}

