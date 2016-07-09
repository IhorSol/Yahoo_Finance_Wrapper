package ParsingUtils;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Ihor Solohub.
 */
@XmlRootElement(name = "rate")
public class Rate {
    private String name;
    private float rate;
    private float ask;
    private float bid;

    public Rate(String name, float rate, float ask, float bid) {
        this.name = name;
        this.rate = rate;
        this.ask = ask;
        this.bid = bid;
    }

    public Rate() {}

    public String getName() {
        return name;
    }
@XmlElement(name = "Name")
    public void setName(String name) {
        this.name = name;
    }

    public float getRate() {
        return rate;
    }

@XmlElement(name = "Rate")
    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getAsk() {
        return ask;
    }
@XmlElement(name = "Ask")
    public void setAsk(float ask) {
        this.ask = ask;
    }

    public float getBid() {
        return bid;
    }
@XmlElement(name = "Bid")
    public void setBid(float bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "Rate: " +
                "name " + name +
                " rate " + rate +
                " ask " + ask +
                " bid " + bid;
    }
}
