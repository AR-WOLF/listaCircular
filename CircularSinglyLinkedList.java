package listasEnlazadas;

import java.util.Scanner;

public class CircularSinglyLinkedList {
	public static void main(String[] args)
    {            
        Scanner scanner = new Scanner(System.in);
        /* crea un objeto de la linkedlist */
        linkedList lista = new linkedList(); 
        System.out.println("************lista enlazada circularmente********\n");          
        char cont;
        /*  operaciones de la lista */
        do
        {
            System.out.println("\nopciones para la lista circular enlazada\n");
            System.out.println("1. insertar al inicio");
            System.out.println("2. insertar al final");
            System.out.println("3. insertar por posicion");
            System.out.println("4. borrar por posicion");
            System.out.println("5. comprobar si esta vacia");
            System.out.println("6. obtener tamanio");            
            int seleccionar = scanner.nextInt();            
            switch (seleccionar)
            {
            case 1 : 
                System.out.println("ingrese un numero");
                lista.insertarAlInicio( scanner.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("ingrese un numero");
                lista.insertarAlFinal( scanner.nextInt() );                     
                break;                         
            case 3 : 
                System.out.println("ingese un numero");
                int num = scanner.nextInt() ;
                System.out.println("ingresar posicion");
                int posision = scanner.nextInt() ;
                if (posision <= 1 || posision > lista.obtenerTamanio() )
                    System.out.println("posicion no valida\n");
                else
                    lista.insertarPorPosicion(num, posision);
                break;                                          
            case 4 : 
                System.out.println("inresar posicion");
                int posicion2 = scanner.nextInt() ;
                if (posicion2 < 1 || posicion2 > lista.obtenerTamanio ())
                    System.out.println("posicion no valida\n");
                else
                    lista.eliminarPorPosicion(posicion2);
                break;
            case 5 : 
                System.out.println("vacia = "+ lista.obtenerTamanio());
                break;                   
            case 6 : 
                System.out.println("tamanio = "+ lista.obtenerTamanio() +" \n");
                break;                         
             default : 
                System.out.println("entrada incorrecta \n ");
                break;   
            }
            /*  Display List  */ 
            lista.display();
            System.out.println("\ncontinuar? (Y/N) \n");
            cont = scanner.next().charAt(0);            
        } while (cont == 'Y'|| cont == 'y');                    
    } 

}
