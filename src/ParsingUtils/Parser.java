package ParsingUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Ihor Solohub.
 */
public class Parser {
//    public static void main(String[] args) throws JAXBException, MalformedURLException {
//
//        URL url = new URL("http://query.yahooapis.com/v1/public/yql?format=xml&q=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20(%22USDEUR%22,%20%22USDUAH%22)&env=store://datatables.org/alltableswithkeys");
//        JAXBContext jaxbContext = JAXBContext.newInstance(Query.class);
//        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
//        Query query = (Query) unmarshaller.unmarshal(url);
//        System.out.println(query.getResults().getRateList());
//    }
    public static Query parsFinance (String urlString) throws MalformedURLException, JAXBException {

        URL url = new URL(urlString);
        JAXBContext jaxbContext = JAXBContext.newInstance(Query.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Query query = (Query) unmarshaller.unmarshal(url);
        return query;
    }
}
