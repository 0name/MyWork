package Calculator;

public class Accum {
    private int value;
    private Operation operation;

    public Accum(Operation operation, int value){
        this.value = value;
        this.operation = operation;
    }

    protected void accum(int someInt){
        this.value = this.operation.execute(this.value, someInt);
    }

    public int getValue(){
        return this.value;
    }

    public static void main(String[] args) {
        Accum acc = new Accum(new Plus(), 3);
        System.out.println(acc.getValue());
        acc.accum(5);
        System.out.println(acc.getValue());

        Accum min = new Accum(new Minus(), 10);
        System.out.println(min.getValue());
        min.accum(5);
        System.out.println(min.getValue());

        Accum umn = new Accum(new Proizv(), 11);
        System.out.println(umn.getValue());
        umn.accum(3);
        System.out.println(umn.getValue());

        Accum del = new Accum(new Delenie(), 924);
        System.out.println(del.getValue());
        del.accum(3);
        System.out.println(del.getValue());




    }
}
