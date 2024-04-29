package Design_Patterns.StructuralPattern.AdaptorPattern;

public class XmlSoftware implements XmlData{
    @Override
    public void readXmlData() {
        System.out.println("This is XML data");
    }
}
