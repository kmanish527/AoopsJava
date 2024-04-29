package Design_Patterns.StructuralPattern.AdaptorPattern;

public class JsonToXmlAdaptor implements XmlData{
    JsonData jsonData;
    JsonToXmlAdaptor(JsonData jsonData){
        this.jsonData = jsonData;
    }
    @Override
    public void readXmlData() {
        jsonData.readJsonData();
        System.out.println("JSON Data --> XML Data");
    }
}
