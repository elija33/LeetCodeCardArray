package CreatingArray;

public class DvD {
    public String name;
    public int releaseyear;
    public String director;

    public DvD(int releaseyear, String name, String director) {
        this.director = director;
        this.name = name;
        this.releaseyear = releaseyear;
    }

    public String toString() {
        return this.name + ", director by " + this.director + ", releaseyear in" + this.releaseyear;
    }

    // Array with loop
    public void loopArray() {
        int squareNumber[] = new int[10];
        for (int i = 0; i < 10; i++) {
            // multiplyign a number by itself
            int sumselfnumber = (i + 1) * (i + 1);
            squareNumber[i] = sumselfnumber;
            System.out.println(squareNumber);
        }
    }

    public static void main(String[] args) {
        DvD[] numberdvd = new DvD[15];

    }
}