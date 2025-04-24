package oops;

class GameLevel {
    void startLevel() {
        System.out.println("Starting the game level....");
    }

    void endLevel(){
        System.out.println("Level completed!");
    }

    void collectItems(){
        System.out.println("Items collected: Gems and Coins");
    }
}

// Subclass
class LevelOne extends GameLevel {
    void showEnemies(){
        System.out.println("Ememies is Level One: Slimes and Goblins");
    }

    void collectItems(){
        super.collectItems();
        System.out.println("Items collected: Sword, Shield, Health Potion");
    }
}

class LevelTwo extends LevelOne {

    private int coins;

    void collectItems(int coins) {
        super.collectItems();
        System.out.println("Items collected: Coins: " + coins);
        this.coins = coins;
    }
}

public class InheritanceExample {

    public static void main(String[] args) {
        LevelOne level = new LevelOne();
        level.startLevel(); // inheritance from GameLevel
        level.showEnemies();
        level.collectItems();
        level.endLevel();


        System.out.println();

        LevelTwo level2 = new LevelTwo();
        level2.collectItems(100);
    }
}
