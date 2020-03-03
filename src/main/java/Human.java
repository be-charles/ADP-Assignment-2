public class Human extends Mammal implements iSwim, iWalk{

    private String surname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void swim() {
        System.out.println("I don't swim like a fish");
    }

    @Override
    public void walk() {
        System.out.println("I walk on 2 legs");
    }
}
