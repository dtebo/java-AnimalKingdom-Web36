package animalkingdom;

public class Bird extends Animal {
    public Bird(String name, int yearDiscovered){
        super(name, yearDiscovered);
    }

    @Override
    public String move(){
        return "fly";
    }

    @Override
    public String breath(){
        return "lungs";
    }

    @Override
    public String reproduce(){
        return "eggs";
    }

    @Override
    public String toString(){
        return super.name + " " + this.reproduce() + " " + this.move() + " " + this.breath() + " " + super.yearDiscovered;
    }
}
