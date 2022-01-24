package ru.danilsibgatullin.lesson1.ex3;

public class Ex3AppStart {
    public static void main(String[] args) {

        Paper paper = new Paper();
        Shape shape1 = new Oval();
        Shape shape2 = new Triangle();

        paper.drawOnPaper(shape1);
        paper.drawOnPaper(shape2);

    }
}
