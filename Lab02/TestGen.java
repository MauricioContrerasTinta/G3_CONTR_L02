package Lab02;

public class TestGen {
    public static void main(String[] args) {
        String[] v = {"Perez", "Sanchez", "Rodriguez"};
        Integer[] w = {12, 34, 56};

        System.out.println(DemoMetodoGenerico.exist(v, "Sanchez")); 
        System.out.println(DemoMetodoGenerico.exist(w, 34));        
        // System.out.println(Utilidades.exist(w, "Salas")); // Error 

        Cajoneria<Golosina> cajoneriaGolosinas = new Cajoneria<>();
        cajoneriaGolosinas.addCaja(new Caja<>("Rojo", new Golosina("Chupetin", 5.0)));
        cajoneriaGolosinas.addCaja(new Caja<>("Amarillo", new Golosina("Chinchin", 3.5)));
        cajoneriaGolosinas.addCaja(new Caja<>("Verde", new Golosina("Oleole", 3.0)));
        cajoneriaGolosinas.addCaja(new Caja<>("Azul", new Golosina("Morocha", 4.2)));
        cajoneriaGolosinas.addCaja(new Caja<>("Naranja", new Golosina("Oreo", 2.8)));

        System.out.println("Cajoneria Golosinas:");
        System.out.println(cajoneriaGolosinas);

         System.out.println("Buscar Chinchin: " + cajoneriaGolosinas.search(new Golosina("Chinchin", 3.5)));

         System.out.println("Eliminar Chupetin: " + cajoneriaGolosinas.delete(new Golosina("Chupetin", 5.0)));

         System.out.println("Después de eliminar:");
         System.out.println(cajoneriaGolosinas);
    }
    
}
 