package Design_Patterns.StructuralPattern.BridgePattern;

public class Assemble implements Workshop {
    @Override
    public void manufacture() {
        System.out.println(" and Assembled");
    }
}
