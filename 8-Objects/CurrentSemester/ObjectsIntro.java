import java.util.ArrayList;
import java.util.Arrays;

public class ObjectsIntro
{
    public static void main(String[] args)
    {
        ArrayList<String> hurricaneAreas = new ArrayList<>(Arrays.asList("Beavercreek", "Fairborn", "Dayton"));
        NaturalDisaster hurricane = new NaturalDisaster(3875193.679, 35, 620, hurricaneAreas);

        System.out.println(hurricane);
        System.out.println();

        ArrayList<String> tornadoAreas = new ArrayList<>(Arrays.asList("Kansas", "Kentucky"));
        Tornado t1 = new Tornado(4388932.18183, 18, 64, tornadoAreas, 4, 120, true);
        System.out.println(t1);

//        ArrayList<String> fireTornadoAreas = new ArrayList<>(Arrays.asList("Hell", "Texas"));
//        FireTornado ft1 = new FireTornado(18943.28, 131289132, 10, fireTornadoAreas);
//        System.out.println(ft1);
    }
}
