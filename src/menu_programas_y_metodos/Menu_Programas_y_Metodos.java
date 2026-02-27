package menu_programas_y_metodos;
import java.util.Scanner;
/**
 *
 * @author THE_CHARLY
 */
public class Menu_Programas_y_Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables de los programas
        Scanner tecla = new Scanner(System.in);
        int op, opc,edad, num, p1, p2 ,p3,n,n2,n3, nt,r, nm2, nm3, sm1;
        int s=0, s1=0;
        int secreto = 5;
        int nump;
        while(true){
        System.out.println("Este programa muestra un menu de programas");
        System.out.println("Presiona: 1-Metodos(sumar, restar, multiplicar, dividir), 2-Verificar si eres mayor de edad\n"
                + "3-Indicar si el numero es positivo o negativo, 4-indicar que numero es mayor, 5-Adivina el numero, 6-Salir");
        op = tecla.nextInt();
        switch(op){
            case 1: System.out.println("En este programa puedes realizar las sigueintes actividades"); 
                    System.out.println("Presiona: 1-Sumar, 2-Restar, 3- Multiplicar, 4-Dividir"); 
                    opc = tecla.nextInt();
                switch(opc){
                    case 0: System.exit(0); break;
                    case 1: while(true){System.out.println("Ingresa el numero que deseas sumar (Para salir presiona 0)");
                    n = tecla.nextInt();
                    s = s + n;
                    if (n == 0){ System.out.println("La suma de los numeros es:" + s); break;}}
                    break; 
                
                    case 2: System.out.println("Ingresa un numero:");
                    n2 = tecla.nextInt();
                    System.out.println("Ingresa el numero a restar:");
                    n3 = tecla.nextInt();
                    s1 = n2 - n3;
                    System.out.println("La resta de:"+ n2 +"- "+ n3 + "= "+ s1); 
                    break;
            
                    case 3: System.out.println("Ingresa el primer numero:");
                    nm2 = tecla.nextInt();
                    System.out.println("Ingresa el segundo numero:");
                    nm3 = tecla.nextInt();
                    sm1 = nm2 * nm3;
                    System.out.println("La resta de:"+ nm2 +"* "+ nm3 + "= "+ sm1); 
                    break;
            
                    case 4: System.out.println("Ingresa el primer numero:");
                    nm2 = tecla.nextInt();
                    System.out.println("Ingresa el segundo numero:");
                    nm3 = tecla.nextInt();
                    sm1 = nm2 / nm3;
                    System.out.println("La resta de:"+ nm2 +"/ "+ nm3 + "= "+ sm1); 
                    break;
            
                    case 5: System.out.println("Ingresa el numero de la tabla de multiplicar que deseas ver:");
                    nt = tecla.nextInt();
                    for(int contador =1; contador<=10; contador++){
                    r = nt*contador;
                    System.out.println("El resultado es:" +nt +"*" +contador +"=" +r );
                    }
                    break;
                    
                    
                }System.exit(0);
            
            case 2: System.out.println("Este programa indica si eres mayor de edad");
            System.out.println("Escribe tu edad:");
            edad = tecla.nextInt();
            if(edad <=18 ){System.out.println("Eres menor de edad\n");}else if(edad >=18){
            System.out.println("Eres mayor de edad\n");}
            break;
            
            case 3: System.out.println("Este programa verifica si el numero es negativo o positivo");
            System.out.println("Escribe un numero:");
            num = tecla.nextInt();
            if(num == 0){
            System.out.print("El numero es: Cero");
            }else if(num <= 0) {System.out.print("El numero es: Negativo\n");
            }else if(num >= 0) {System.out.println("El numero es: Positivo\n");} 
            break;
            
            case 4:  System.out.println("Este programa indica que numero es mayor");
            System.out.println("Ingresa el primer numero:");
            p1 = tecla.nextInt();
            System.out.println("Ingresa el segundo numero:");
            p2 = tecla.nextInt();
            System.out.println("Ingresa el tercer numero:");
            p3 = tecla.nextInt();
            if(p1 > p2){System.out.println("El numero mayor es:"+p1);} else if (p2 > p3)
            {System.out.println("El numero mayor es:"+p2);}else if(p3 > p1){
            System.out.println("El numero mayor es:"+p3);}
            break;
            
            case 5: System.out.println("En este programa debes de adivinar cual es el numero secreto");
            while(true){
            System.out.println("Ingresa un numero:");
            nump = tecla.nextInt();
            if(nump == 5){
            System.out.println("El numero es correcto:"+ secreto);break;
            }else if(nump != 5){System.out.println("Intenta otra vez");}
            }
            break;
        
            case 6: System.exit(0);
            break;
            
            }
           }
        }
    }
    

