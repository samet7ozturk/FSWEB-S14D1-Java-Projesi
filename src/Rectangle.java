public class Rectangle {
    private double width;
    private double length;

    public Rectangle() {
        // Parametresiz constructor, herhangi bir şey yapmasına gerek yok.
    }

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setLength(double length) {
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }
}
