package animalkingdom;

public class Mammal extends Animal {
    public Mammal(String name, int yearDiscovered){
        super(name, yearDiscovered);
    }

    @Override
    public String move(){
        return "walk";
    }

    @Override
    public String breath(){
        return "lungs";
    }

    @Override
    public String reproduce(){
        return "live births";
    }

    @Override
    public String toString(){
        return super.name + " " + this.reproduce() + " " + this.move() + " " + this.breath() + " " + super.yearDiscovered;
    }
}
