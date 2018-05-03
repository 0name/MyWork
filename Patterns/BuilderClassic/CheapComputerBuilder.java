package Patterns.BuilderClassic;

public class CheapComputerBuilder extends AbstractComputerBuilder {
    @Override
    public void buildDisplay() {
        computer.setDisplay("TFT");
    }

    @Override
    public void buildDSystemBlock() {
        computer.setSystemBlock("No name");
    }

    @Override
    public void buildManipulator() {
        computer.setManipulator("mouse+keyboard");
    }
}
