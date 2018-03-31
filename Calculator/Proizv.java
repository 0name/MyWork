package Calculator;

public class Proizv extends Operation {
    @Override
    protected int execute (int a, int b){
        System.out.println("Proizv execute ");
        return a*b;
    }
}
