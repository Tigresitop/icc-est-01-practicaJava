public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");



        String cadena = "Hola Mundo";
        int edad = 10;

        System.out.println(cadena);
        System.out.println("Tamaño de la cadena ");
        System.out.println(cadena.length());
        System.out.println(cadena.split(" ")[1]);

        for (int i = 0; i < cadena.length(); i++) {
            if (i == cadena.length() - 1) {
                System.out.print(cadena.charAt(i));
            }else{
                System.out.print(cadena.charAt(i) + "-");
            }

            
        }
     //contar palabras
     int palabras = cadena.split(" ").length;
     System.out.println(palabras);

     // contar a 
     int y = 0;
     for (int i = 0; i < cadena.length(); i++) {
        if ('a' == cadena.charAt(i)) {
            y++;
        }
 
        System.out.println(y);
    }
}}

