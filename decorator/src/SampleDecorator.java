public class SampleDecorator extends AbstractDecorator {
    private double width = 0;
    private double length = 0;

    public SampleDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public String print() {
        String msg = decoratedShape.print() + "\nWidth: " + getWidth(decoratedShape) + "\nLength: " + getLength(decoratedShape);
        return msg;
    }

    private double getWidth(Shape decoratedShape) {
        return width;
    }

    private double getLength(Shape decoratedShape) {
        return length;
    }
}
