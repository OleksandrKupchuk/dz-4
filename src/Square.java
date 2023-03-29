public class Square {
    private int squareSide = 5;

    public int printAreaOfSquare(){
        int areaOfSquare = squareSide * squareSide;
        System.out.println(String.format("Area of square is %d", areaOfSquare));
        return  areaOfSquare;
    }

    public int calculationAndPrintAreaOfSquareWithGivenSide(int squareSide){
        int areaOfSquare = squareSide * squareSide;
        System.out.println(String.format("Area of square is %d", areaOfSquare));
        return  areaOfSquare;
    }
}
