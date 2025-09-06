class Volume {

    int side;

    void getVolume(int side) {
        this.side = side;
        System.out.println("HI");
    }
}

class Cube extends Volume {
    void getVolume(int side) {
        this.side = side;
        System.out.println(side * side * side);
    }
}
class Sphere extends Volume {
    void getVolume(int side) {
        this.side = side;
        System.out.println((4/3)* 3.14 * (side * side * side) );
    }
}

class VolumeMain {
    public static void main(String[] args) {
        Volume obj = new Cube();
        obj.getVolume(5);
        Volume obj2 = new Sphere();
        obj2.getVolume(5);
    }
}