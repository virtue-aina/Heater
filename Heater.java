
/**
 * Simple Temperature Regulator.
 *
 * @author (Ayo Aina)
 * @version (v1.0)
 */
public class Heater
{

    private double temperature;

    /**
     * Constructor for objects of class Heater
     */
    public Heater()
    {
        // set temperature baseline
        this.temperature = 15.0;
    }

    // make temperature warmer"s
    public void warmer()
    {
      //set increment
      temperature += 5.0;
    }
    
    public void cooler ()
    {
        //set reduction
        temperature -= 5.0;
    }
}
