public class JavaFibonacci {
    public static void main(String[] args) {

    }

    public static int makeFibonacci(int n) {
        int toBeAdded[] = {0, 1};
        int fibonacci = 0;

        if(n == 0){
            return 0;
        }
        if(n == 1) {
            return 1;
        }

        for(int i = 1; i < n; i++){
            fibonacci = toBeAdded[0] + toBeAdded[1];
            toBeAdded[0] = toBeAdded[1];
            toBeAdded[1] = fibonacci;
        }
        return fibonacci;

    }
}
