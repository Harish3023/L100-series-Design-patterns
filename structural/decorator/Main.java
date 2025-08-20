package structural.decorator;

// Client Code
public class Main {
    public static void main(String[] args) {
        Text simpleText = new PlainText("This is to demonstrate the Decorator pattern.");
        Text boldText = new BoldTextDecorator(simpleText);
        Text fancyText = new ItalicTextDecorator(boldText);

        System.out.println(fancyText.render());  
    }
}
