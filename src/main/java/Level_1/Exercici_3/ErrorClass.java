package Level_1.Exercici_3;



public class ErrorClass {
    private int[] errorArray;

    public ErrorClass(int size) {
        this.errorArray = new int[size];
    }

    public void addData(int pos) throws ArrayIndexOutOfBoundsException{
            errorArray[pos] = 42;
            throw new ArrayIndexOutOfBoundsException();
    }
}
