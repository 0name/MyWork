package Patterns.BuilderClassic;

public class Director {
    public AbstractComputerBuilder computerBuilder;

    public void setComputerBuilder(AbstractComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer getComputer(){
        return computerBuilder.getComputer();
    }

    public void constractComputer(){
        computerBuilder.createComputer();
        computerBuilder.buildDisplay();
        computerBuilder.buildManipulator();
        computerBuilder.buildDSystemBlock();
    }
}
