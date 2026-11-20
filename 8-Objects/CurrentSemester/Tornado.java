import java.util.ArrayList;

public class Tornado extends NaturalDisaster
{
    private int EFRating = 0;
    private int maxWindSpeed = 0;
    private boolean EASWarningDeployed = false;

    public Tornado(double damageCost, int fatalities, int injured, ArrayList<String> areasAffected, int EFRating, int maxWindSpeed, boolean EASWarningDeployed)
    {
        super(damageCost, fatalities, injured, areasAffected);
        setEFRating(EFRating);
        setMaxWindSpeed(maxWindSpeed);
        setEASWarningDeployed(EASWarningDeployed);
    }

    @Override
    public String toString()
    {
        String parentString = super.toString();
        String tornadoString = "EF-" + EFRating + " tornado with max wind speed of " + maxWindSpeed + "mph";
        if (EASWarningDeployed)
        {
            tornadoString = tornadoString + "\nEAS Warning successfully broadcasted";
        }
        tornadoString = tornadoString + "\n" + parentString;
        return tornadoString;
    }

    public int getEFRating()
    {
        return EFRating;
    }

    public void setEFRating(int EFRating)
    {
        if (EFRating >= 0 && EFRating <= 5)
        {
            this.EFRating = EFRating;
        }
    }

    public int getMaxWindSpeed()
    {
        return maxWindSpeed;
    }

    public void setMaxWindSpeed(int maxWindSpeed)
    {
        if (maxWindSpeed > 0)
        {
            this.maxWindSpeed = maxWindSpeed;
        }
    }

    public boolean isEASWarningDeployed()
    {
        return EASWarningDeployed;
    }

    public void setEASWarningDeployed(boolean EASWarningDeployed)
    {
        this.EASWarningDeployed = EASWarningDeployed;
    }
}
