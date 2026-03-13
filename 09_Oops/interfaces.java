public class interfaces {
    public static void main(String[] args) {
    Queen q = new Queen();
    q.move();
    Rook r = new Rook();
    r.move();
    King k = new King();
    k.move(); 
    Bear b = new Bear();
    b.eatMeat();
    b.eatPlants();   
    }
}
interface Chessplayer{
    void move();
}

class Queen implements Chessplayer{
    public void move(){
        System.out.println("up , down , diagonal , left, right");
    }
}

class Rook implements Chessplayer{
    public void move(){
        System.out.println("up , down ,left, right");
    }
}

class King implements Chessplayer{
    public void move(){
        System.out.println("up , down, diagonal ,left, right (by 1 step)");
    }
}

interface Herbivore{
    void eatPlants();
}

interface Carnivore{
    void eatMeat();
}
class Bear implements Herbivore, Carnivore{
    public void eatPlants(){
        System.out.println("Eat Plants");
    }
    public void eatMeat(){
        System.out.println("Eat Meat");
    }
}