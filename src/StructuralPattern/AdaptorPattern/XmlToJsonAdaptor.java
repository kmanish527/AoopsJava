package StructuralPattern.AdaptorPattern;

public class XmlToJsonAdaptor implements JsonData{
    XmlData xmlData; // here we have created Xmldata type member variable
    XmlToJsonAdaptor(XmlData xmlData){
        this.xmlData=xmlData;
    }

    @Override
    public void readJsonData() {
        xmlData.readXmlData();
        System.out.println("XML data --> JSON data");
    }
}
//like this we can add one more adaptor JsontoXmladaptor
