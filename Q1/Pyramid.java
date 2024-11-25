public class Pyramid implements IMeasurableContainer{

    private float length, sideLength, weight;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getSideLength() {
        return sideLength;
    }

    public void setSideLength(float sideLength) {
        this.sideLength = sideLength;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Pyramid(float length, float sideLength, float weight) {
        this.length = length;
        this.sideLength = sideLength;
        this.weight = weight;
    }

    @Override
    public float weight() {
        return weight;
    }

    @Override
    public float rectangularVolume() {
        return length*length*sideLength;
    }
}
