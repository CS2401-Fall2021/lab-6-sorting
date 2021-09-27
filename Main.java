public class ValleySort {
    public static void main(String[] args) {
      int[] input = {6,7,1,5,4,3,3};
      // Expected output should be  index 2
      System.out.println(findMinIndex(input));
      
      sortLeft(input);
      // Expected new value of input should be {7,6,1,5,4,3,3}
      // You should also change the line below to print out each value in the array. 
      // Since you will need to do this several times, it might be good to make a method
      // that prints your integer array. 
      System.out.println(input);
      
      sortRight(input);
      //Expected new value of input should be {7,6,1,3,3,4,5}
      // You should also change the line below to print out each value in the array. 
      System.out.println(input);
      
      merge(input);
      //Expected new value of input should be {1,3,3,4,5,6,7}
      // You should also change the line below to print out each value in the array. 
      System.out.println(input);
      
    }
    public static int findMinIndex(int[] input) {
        
      
    }
    // Note, you might need to change the method signature of this
    public static void sortLeft(int[] input) {
        
      
    }
    // Note, you might need to change the method signature of this
    public static void sortRight(int[] input) {
        
      
    }
    // Note, you might need to change the method signature of this
    public static void merge(int[] input) {
        
      
    }
}
