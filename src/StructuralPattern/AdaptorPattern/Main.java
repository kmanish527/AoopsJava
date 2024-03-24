package StructuralPattern.AdaptorPattern;

public class Main {
    public static void main(String[] args) {

        //to convert XML data to JSON data
        XmlData xd = new XmlSoftware();
        JsonData jd = new XmlToJsonAdaptor(xd);
        jd.readJsonData();

        //to convert JSON data to XML data
        JsonData jd1 = new JsonSoftware();
        XmlData xd1 = new JsonToXmlAdaptor(jd1);
        xd1.readXmlData();
    }
}
