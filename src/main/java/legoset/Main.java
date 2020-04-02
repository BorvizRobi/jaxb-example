package legoset;


import jaxb.JAXBHelper;
import java.time.Year;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) throws Exception{

        LegoSet legoSet = new LegoSet();
        legoSet.setNumber("75211");
        legoSet.setName("Imperial TIE Fighter");
        legoSet.setTheme("Star Wars");
        legoSet.setSubtheme("Solo");
        legoSet.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");
        legoSet.setYear(Year.of(2018));
        legoSet.setPieces(519);
        legoSet.setWeight(new Weight("kg",0.89));

        ArrayList<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig("Imperial Mudtrooper", 2));
        minifigs.add(new Minifig("Imperial Pilot", 1));
        minifigs.add(new Minifig("Mimban Stormtrooper", 1));
        legoSet.setMinifigs(minifigs);

        Set<String> tags = new TreeSet<>();
        tags.add("Starfighter");
        tags.add("Stormtrooper");
        tags.add("Star Wars");
        tags.add("Solo");
        legoSet.setTags(tags);


        JAXBHelper.toXML(legoSet,System.out);





    }
}
