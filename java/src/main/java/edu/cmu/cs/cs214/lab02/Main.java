package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Rectangle(2, 3);

        Renderer renderer = new Renderer(shape);

        renderer.draw();
        Shape shape2 = new Circle(3);
        Renderer renderer2 = new Renderer(shape2);
        renderer2.draw();
        Shape shape3 = new Square (4);
        Renderer renderer3 = new Renderer(shape);
        renderer3.draw();
        }

    }
