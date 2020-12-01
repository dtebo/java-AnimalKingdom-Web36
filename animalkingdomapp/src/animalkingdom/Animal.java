package animalkingdom;

public abstract class Animal {
    protected static int maxID = 0;
    protected int id;
    protected int foodAmount = 0;
    protected String name;
    protected int yearDiscovered;

    public Animal(String name, int yearDiscovered){
        this.id = maxID;
        maxID++;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    public int getFoodAmount(){
        return this.foodAmount;
    }

    public String getName(){
        return this.name;
    }

    public int getYearDiscovered(){
        return this.yearDiscovered;
    }

    public void setFoodAmount(int amt){
        this.foodAmount = amt;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setYearDiscovered(int yearDiscovered){
        this.yearDiscovered = yearDiscovered;
    }

    public void eat(int amt){
        this.foodAmount += amt;
    }
    
    public String move(){
        return this.name + " is moving!";
    }

    public String breath(){
        return this.name + " is breathing!";
    }

    public String reproduce(){
        return this.name + " is reproducing!";
    }

    @Override
    public String toString(){
        return "Animals{id=" + this.id + ", name='" + this.name + "', yearNamed=" + this.yearDiscovered + "}";
    }
}
