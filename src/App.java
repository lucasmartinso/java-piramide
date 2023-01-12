public class App {
    public static void main(String[] args) throws Exception {
        int inicial = 1; 
        int termino = 9;

        for(int i=inicial; i<= termino; i++) { 
            String compilado = "";
            for(int j=1; j<=i; j++) { 
                compilado += i;
            }
            System.out.println(compilado);
            compilado = "";
        }
    }
}
