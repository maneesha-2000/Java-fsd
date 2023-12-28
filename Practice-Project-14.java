package tryAndCatch;

public class TryAndCatch {

	public static void main(String[] args) {
		int[] array = new int[2];
        try 
        {
            array[5] = 2;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds!"); 
        }
        finally 
        {
            System.out.println("The array of size " + array.length);
        }
    }
}

		
