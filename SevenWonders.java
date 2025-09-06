// Abstract class
abstract class Wonder {
    String name;
    String location;

    Wonder(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Abstract method to be implemented by subclasses
    abstract void displayInfo();
}

// Subclass for each wonder
class GreatWallOfChina extends Wonder {
    GreatWallOfChina() {
        super("Great Wall of China", "China");
    }

    @Override
    void displayInfo() {
        System.out.println(name + " is located in " + location + ". It is a series of fortifications made of stone, brick.");
    }
}

class Petra extends Wonder {
    Petra() {
        super("Petra", "Jordan");
    }

    @Override
    void displayInfo() {
        System.out.println(name + " is located in " + location + ". It is famous for its rock-cut architecture.");
    }
}

class ChristTheRedeemer extends Wonder {
    ChristTheRedeemer() {
        super("Christ the Redeemer", "Brazil");
    }

    @Override
    void displayInfo() {
        System.out.println(name + " is located in " + location + ". It is a massive statue of Jesus Christ in Rio de Janeiro.");
    }
}

class MachuPicchu extends Wonder {
    MachuPicchu() {
        super("Machu Picchu", "Peru");
    }

    @Override
    void displayInfo() {
        System.out.println(name + " is located in " + location + ". It is an Incan citadel set high in the Andes Mountains.");
    }
}

class ChichenItza extends Wonder {
    ChichenItza() {
        super("Chichen Itza", "Mexico");
    }

    @Override
    void displayInfo() {
        System.out.println(name + " is located in " + location + ". It is a large pre-Columbian archaeological site.");
    }
}

class RomanColosseum extends Wonder {
    RomanColosseum() {
        super("Roman Colosseum", "Italy");
    }

    @Override
    void displayInfo() {
        System.out.println(name + " is located in " + location + ". It is an ancient amphitheatre in the center of Rome.");
    }
}

class TajMahal extends Wonder {
    TajMahal() {
        super("Taj Mahal", "India");
    }

    @Override
    void displayInfo() {
        System.out.println(name + " is located in " + location + ". It is a white marble mausoleum built by Mughal emperor Shah Jahan.");
    }
}

// Main class
public class SevenWonders {
    public static void main(String[] args) {
        // Array of Wonder type, demonstrating polymorphism
        Wonder[] wonders = {
            new GreatWallOfChina(),
            new Petra(),
            new ChristTheRedeemer(),
            new MachuPicchu(),
            new ChichenItza(),
            new RomanColosseum(),
            new TajMahal()
        };

        System.out.println("Seven Wonders of the World:\n");
        for (Wonder wonder : wonders) {
            wonder.displayInfo();
            System.out.println();
        }
    }
}
