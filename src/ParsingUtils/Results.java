package ParsingUtils;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ihor Solohub.
 */
@XmlRootElement(name = "results")
public class Results {
    @XmlElement(name = "rate")
    private List<Rate> rateList = new ArrayList<>();

    public Results() {}

    public List<Rate> getRateList() {
        return rateList;
    }

    @Override
    public String toString() {
        return "Results - " +
                " rateList " + rateList;
    }
}
