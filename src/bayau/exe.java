package bayau;

import java.util.*;

public class exe{

				public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
				menu(sc,0);
				
				
				}

				
				public static void menu(Scanner sc,int n){
				if(n ==0 ){
				System.out.println("Horario:");
				System.out.println("1-Introducir fecha");
								System.out.println("2-Eliminar fecha");	
												System.out.println("3-Ver horario");
																System.out.println("4-Salir");
																				System.out.println("Introduce un numero: "+sc.nextInt());																			
				
								
				}
				if(n == 1){
					menu(sc,0);
					}else if(n == 2){
					}else if(n==3){
				}else if(n == 4){
				
				}
				
				}







}