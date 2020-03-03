public class Dog extends Mammal implements iSwim, iWalk {

    private boolean isPet;

    @Override
    public void swim() {
        System.out.println("I swim by doggy paddling");
    }

    @Override
    public void walk() {
        System.out.println("I walk on 4 legs");
    }
}
