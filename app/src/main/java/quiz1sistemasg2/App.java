/*
 * This source file was generated by the Gradle 'init' task
 */
package quiz1sistemasg2;

public class App {
    
    public static void main(String[] args) {
        
       

    }


    /*  Implemente una funcion llamada calcularValorHora que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa el tipo de vehiculo (C, M o B)
            - Un entero que representa la cantidad de horas de permanencia
        * Retorna:
            - Un entero representando el valor total de las boletas
        * Controlar errores retornando -1
    */
    //------------------------------------------------------------------
    
    public static int calcularValorHora (int valorhoraspermanecidas, int nrodehoras) {
        try{
            
            int calcularValorHora = valorhoraspermanecidas * nrodehoras;
        
            return calcularValorHora;
        
        } catch (exception e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        try{
            
            String carro = "C", moto = "M", bisicleta = "B";
            int calcularValorHora = 0;
            
            int nroHorasTrabajadas = 0, valorHora = 0, porcentajeRetencion = 0;

            //Datos de Salida
            int valorboletas = 0;

            //Proceso
            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese la cantidad de horas: ");
            nroHorasTrabajadas = sc.nextInt();
            sc.nextLine();

            System.out.println("Ingrese el valor de la Hora: $");
            valorHora = sc.nextInt();
            sc.nextLine();

            System.out.println("Ingrese el valor de las horas extras:");
            porcentajeRetencion = sc.nextInt();

            
            

        
       

    }




    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularDescuento que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el valor total de las horas
            - Un entero representando la si es estudiante o no
            - Un entero represenatando la cantidad de horas
        * Retorna:
            - Un entero representando el valor del descuento
        * Controlar errores retornando -1
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularFactura que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el valor total de las horas
            - Un entero representando el valor del descuento
        * Retorna:
            - Un entero representando el valor del total de la factura incluyendo el iva
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------
}
