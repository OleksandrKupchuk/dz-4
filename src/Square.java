public class Square {
    private int squareSide = 5;

    public int getAreaOfSquare(){
        int areaOfSquare = squareSide * squareSide;
        System.out.println(String.format("%d", areaOfSquare));
        return  areaOfSquare;
    }
}
