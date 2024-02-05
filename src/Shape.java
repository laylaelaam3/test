class Shape {
    // Method
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// Subclasses (Derived classes)
class Circle extends Shape {
    // Override method
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    // Override method
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
