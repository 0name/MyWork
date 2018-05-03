package Patterns.BuilderClassic;

public class TopComputerBuilder extends AbstractComputerBuilder {
    @Override
    public void buildDisplay() {
        computer.setDisplay("Top Display");
    }

    @Override
    public void buildDSystemBlock() {
        computer.setSystemBlock("Top Block");
    }

    @Override
    public void buildManipulator() {
        computer.setManipulator("keyboard+mouse+game - pad");
    }
}
