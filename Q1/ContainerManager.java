import java.util.ArrayList;
import java.util.List;

public class ContainerManager
{
    private List<IMeasurableContainer> containers;

    public ContainerManager()
    {
        containers = new ArrayList<>();
    }

    // Add a container to the list
    public void add(IMeasurableContainer container)
    {
        containers.add(container);
    }

    public float totalWeight() {
        float total = 0;
        for (IMeasurableContainer container : containers)
        {
            total = total + container.weight();
        }
        return total;
    }

    public double totalRectangularVolume()
    {
        double total = 0;
        for (IMeasurableContainer container : containers)
        {
            total += container.rectangularVolume();
        }
        return total;
    }

    public void clearAll()
    {
        for (IMeasurableContainer container : containers)
        {
            containers.remove(container);
        }
    }

    // Return the list of all containers
    public List<IMeasurableContainer> getAllContainers()
    {
        return containers;
    }
}