public class Box implements IMeasurableContainer{

    private float length, width, depth, weight;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Box(float weight, float depth, float width, float length) {
        this.weight = weight;
        this.depth = depth;
        this.width = width;
        this.length = length;
    }

    @Override
    public float weight()
    {
        return weight;
    }

    @Override
    public float rectangularVolume()
    {
        return length * width * depth;
    }
}
