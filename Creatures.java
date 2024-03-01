import java.util.Random;

class Creatures {
    int vitality;
    boolean lovely;
    String name;
    static Random rand = new Random();

    Creatures parentOf[] = new Creatures[5];
    int counter;

    Creatures (String name){
        this.name = name;
        this.vitality = rand.nextInt(100);
        this.lovely = rand.nextBoolean();
    }

    Creatures (String name, boolean lovely, int vitality){
        this.name = name;
        this.lovely = lovely;
        this.vitality = vitality;
    }

    public String toString (){
        String liebenswert = "lovely";
        if (lovely == false){
            liebenswert = "unlovely";
        }
        if (counter > 0){
            return name + "(" + liebenswert + "," + vitality + ")" + "\n" + "parent of ";
            for (int i = 0; i < parentOf.length; i++){
                parentOf[i].name;
                parentOf[i].liebenswert;
                parentOf[i].vitality;
            }
            
        }
        return name + "(" + liebenswert + "," + vitality + ")";

        
    }

    boolean canJoin ( Creatures other){
        if (this.vitality >= 50 && other.vitality >= 50 && this.counter < 5){
            return true;
        }
        return false;
    }

    int reduceVitality (int x){
        vitality = vitality - x;
        return vitality;
    }

    void join (Creatures other) {
        Creatures child = new Creatures(this.name + other.name, lovely, (this.vitality + other.vitality) / 2);
        this.parentOf[this.counter] = child;
        this.counter++;
    }

    


}
