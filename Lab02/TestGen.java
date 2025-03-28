package Lab02;

public class TestGen {
    public static void main(String[] args) {
        String[] v = {"Perez", "Sanchez", "Rodriguez"};
        Integer[] w = {12, 34, 56};

        System.out.println(DemoMetodoGenerico.exist(v, "Sanchez")); 
        System.out.println(DemoMetodoGenerico.exist(w, 34));        
        // System.out.println(Utilidades.exist(w, "Salas")); // Error 
    }
}
 