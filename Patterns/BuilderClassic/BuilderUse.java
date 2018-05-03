package Patterns.BuilderClassic;

public class BuilderUse {
    public static void main(String[] args) {
        Director director = new Director();
        AbstractComputerBuilder cheapComputerBuilder = new CheapComputerBuilder();

        director.setComputerBuilder(cheapComputerBuilder);
        director.constractComputer();

        Computer computer = director.getComputer();





    }
}
