package legoset;


import java.time.Year;
import java.util.List;
import java.util.Set;
import lombok.Data;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"name","theme","subtheme","year","pieces","tags","minifigs","weight","url"})
@Data
public class LegoSet {

    private String name;
    private String theme;
    private String subtheme;
    private String url;
    private Weight weight;

    @XmlAttribute
    private String number;

    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;
    private int pieces;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private Set<String> tags;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private List<Minifig> minifigs;



}
