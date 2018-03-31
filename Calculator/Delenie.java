package Calculator;

public class Delenie extends Operation{
    @Override
    protected int execute (int a, int b){
        while(b==0) {
            System.out.println("Oshibka! Delenie na nol' ");
            break;
        }
        System.out.println("Delenie execute ");
        return  a/b;
    }

}
