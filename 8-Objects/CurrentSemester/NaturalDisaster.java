import java.util.ArrayList;

public class NaturalDisaster
{
    private double damageCost = 0.0;
    private int fatalityCount = 0;
    private int casualtyCount = 0;
    private ArrayList<String> areasAffected = new ArrayList<>();

    // table 1: write the constructor
    public NaturalDisaster(double damageCost, int fatalities, int injured, ArrayList<String> areasAffected)
    {
        setDamageCost(damageCost);
        setFatalityCount(fatalities);
        setCasualtyCount(injured);
        setAreasAffected(areasAffected);
    }

    @Override
    public String toString()
    {
        String out = String.format("Natural Disaster caused $%,.2f of damage. Fatality percent was %.2f%%", damageCost, getFatalityPercent());
        out = out + "\nAreas affected include:\n-----------------------\n";
        for (String area : areasAffected)
        {
            out += area + "\n";
        }
        return out;
    }

    // table 2: getter/setter for damageCost
    public double getDamageCost()
    {
        return damageCost;
    }

    public void setDamageCost(double damageCost)
    {
        if (damageCost < 0)
        {
            this.damageCost = 0;
        }
        else
        {
            this.damageCost = damageCost;
        }
    }

    // table 3: getter/setter for fatalityCount
    public int getFatalityCount()
    {
        return fatalityCount;
    }

    public void setFatalityCount(int people)
    {
        int oldFatalityCount = fatalityCount;

        if (people < 0)
        {
            fatalityCount = 0;
        }
        else
        {
            this.fatalityCount = people;
        }
        // set the injured count = casualties - old fatality count
        setCasualtyCount(casualtyCount - oldFatalityCount);
    }


    // table 4: getter/setter for casualtyCount
    public int getCasualtyCount()
    {
        return casualtyCount;
    }

    public void setCasualtyCount(int injuredCount)
    {
        if (injuredCount >= 0)
        {
            this.casualtyCount = injuredCount + fatalityCount;
        }
        else
        {
            System.out.println("Injured count must be positive.");
        }
    }

    // table 5: getter/setter for areasAffected
    public ArrayList<String> getAreasAffected()
    {
        return areasAffected;
    }

    public void setAreasAffected(ArrayList<String> areasAffected)
    {
        this.areasAffected = areasAffected;
    }


    // table 6: write a method that calculates the fatality percent versus casualty
    // write a method that divides the damageCost across the total number of areas affected

    public double getFatalityPercent()
    {
        return ((double) fatalityCount / casualtyCount) * 100;
    }

    public double getCostPerNumAreaAffected()
    {
        return damageCost / areasAffected.size();
    }
}
