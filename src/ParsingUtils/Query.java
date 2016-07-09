package ParsingUtils;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Ihor Solohub.
 */
@XmlRootElement(name = "query")
public class Query {

    @XmlElement(name = "results")
    private Results results;

    public Results getResults() {
        return results;
    }

    @Override
    public String toString() {
        return "ParsingUtils.Query{" +
                "results=" + results +
                '}';
    }
}
