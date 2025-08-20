package structural.decorator;

// ConcreteDecorator 
public class ItalicTextDecorator extends TextDecorator {
    public ItalicTextDecorator(Text text) {
        super(text);
    }

    @Override
    public String render() {
        return "<i>" + super.render() + "</i>";
    }
}
