public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 1");
        System.out.println("-----------");
        comparadorNumero();
        System.out.println("-----------");
        System.out.println("Ejercicio 2");
        System.out.println("-----------");
        bucleWhile();
        System.out.println("-----------");
        System.out.println("Ejercicio 3");
        System.out.println("-----------");
        bucleDoWhile();
        System.out.println("-----------");
        System.out.println("Ejercicio 4");
        System.out.println("-----------");
        bucleFor();
        System.out.println("-----------");
        System.out.println("Ejercicio 5");
        System.out.println("-----------");
        ejSwitch();
    }

    public static void comparadorNumero() {
        int numeroIf = -1;
        if (numeroIf == 0 ) {
            System.out.println("El numero " + numeroIf + " es un 0");          
        }else if (numeroIf < 0){
            System.out.println("El numero " + numeroIf + " es negativo");
        }else{
            System.out.println("El numero " + numeroIf + " es positivo");
        }
    }

    public static void bucleWhile() {
        int numWhile = -1;
        while (numWhile < 3) {
            numWhile ++;
            System.out.println(numWhile);   
        } 
    }

    public static void bucleDoWhile() {
        int numDoWhile = 2;
        do {
            numDoWhile ++;
            System.out.println(numDoWhile); 
        } while (numDoWhile > 3);
    }

    public static void bucleFor() {        
        for (int numFor = 0; numFor <= 3 ; numFor++) {
            System.out.println(numFor);
        }    
    }

    public static void ejSwitch () {
        var estacion = "verano";
        switch (estacion) {
            case "verano":
                System.out.println("Estamos en verano.");             
                break;
            case "invierno":
                System.out.println("Estamos en invierno.");
                break;
            case "primavera":
                System.out.println("Estamos en primavera.");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
            default:
                System.out.println("No existe esa estacion");
                break;
        }
    }
        
    
}
