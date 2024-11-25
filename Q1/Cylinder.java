public class Cylinder implements IMeasurableContainer{
    private float height, diameter, weight;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Cylinder(float height, float diameter, float weight) {
        this.height = height;
        this.diameter = diameter;
        this.weight = weight;
    }

    @Override
    public float weight()
    {
        return weight;
    }

    @Override
    public float rectangularVolume()
    {
        float radius = diameter / 2;
        return (float)(Math.PI*(radius*radius)*height);
    }
}