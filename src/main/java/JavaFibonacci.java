public class JavaFibonacci {
    public static void main(String[] args) {

    }

    public static int makeFibonacci(int n) {
        int[] toBeCalculated = {0, 1};
        int fibonacci = 0;

        if(n < -1){
          for(int i = -1; i > n; i--) {
              fibonacci = toBeCalculated[0] - toBeCalculated[1];
              toBeCalculated[0] = toBeCalculated[1];
              toBeCalculated[1] = fibonacci;
        }
          return fibonacci;
        }
        if(n == -1){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        if(n == 1) {
            return 1;
        }



        for(int i = 1; i < n; i++){
            fibonacci = toBeCalculated[0] + toBeCalculated[1];
            toBeCalculated[0] = toBeCalculated[1];
            toBeCalculated[1] = fibonacci;
        }
        return fibonacci;

    }
}
