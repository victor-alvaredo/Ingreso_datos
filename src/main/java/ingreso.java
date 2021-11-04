import java.util.Scanner;
public class ingreso {
    
   public static void main(String[] args) {
        
    String nombre = new String(); 
    String apellido = new String();
    int edad = 0;
    String hobbie = new String();
    String editor = new String();
    String os = new String();
    Scanner scan = new Scanner(System.in);
        
    System.out.println("Ingrese su nombre\n");   
        nombre = scan.nextLine();
        
    System.out.println("\nIngrese su apellido\n");   
        apellido = scan.nextLine();
        
    System.out.println("\nIngrese su edad\n");   
        edad = Integer.parseInt(scan.nextLine());    
        
    System.out.println("\nIngrese su hobbie\n");   
        hobbie = scan.nextLine();  
        
    System.out.println("\nIngrese su editor de codigo preferido\n");   
        editor = scan.nextLine();    
        
    System.out.println("\nIngrese sistema operativo que utiliza\n");   
        os = scan.nextLine();  
        
    System.out.println("\nNombre:   " + nombre + "\nApellido: " + apellido + "\nEdad:     " + edad + "\nHobbie:   " + hobbie);   
    System.out.println("Editor de codigo preferido:    " + editor + "\nSistema operativo que utiliza: " + os);   
        
        
    
    
    
    }
    
}
