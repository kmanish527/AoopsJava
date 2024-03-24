package StructuralPattern.BridgePattern;

public class Produce implements Workshop{
    @Override
    public void manufacture() {
        System.out.print(" is produced");
    }
}
