package War;

abstract class Soldier {
    protected int health;
    protected int attackScore;

    public Soldier(int health, int attackScore){
        this.health = health;
        this.attackScore = attackScore;
    }

    public boolean isLive(){
        return health > 0;
    }

    public void attack(Soldier SoldEnemy){
        SoldEnemy.health -= this.attackScore;
    }
}

class Red extends Soldier{
    @Override
    public void attack(Soldier SoldEnemy) {
        SoldEnemy.health -= this.attackScore + 200;
    }

    int someInt;
    public Red(){
        super(200, 200);
        this.someInt = 3;
    }
}

class White extends Soldier{
    @Override
    public void attack(Soldier SoldEnemy) {
        SoldEnemy.health -= this.attackScore + 20;
    }

    public White(){
        super(300, 50);
    }
}