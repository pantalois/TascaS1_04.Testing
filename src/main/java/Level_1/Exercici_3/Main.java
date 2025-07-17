package Level_1.Exercici_3;

public class Main {
    public static void main(String[] args){
        ErrorClass errorClass = new ErrorClass(5);
          try {
              errorClass.addData(5);
          }catch (ArrayIndexOutOfBoundsException e){
              System.out.println(e.getMessage());
          }
    }
}
