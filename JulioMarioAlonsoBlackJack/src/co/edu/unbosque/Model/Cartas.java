package co.edu.unbosque.Model;

public class Cartas  {
	
	public String [] cartaspc= new String [3];
	public String [] cartasj= new String [3];
    public int  totalj = 0;
    public int  totalpc = 0;
    public boolean maximoCartas=false;
    

 public Cartas(String[] cartaspc, String[] cartasj) {
		super();
		this.cartaspc = cartaspc;
		this.cartasj = cartasj;
	}
    public Cartas() {
//Solo tiene un ciclo for porque tiene la misma longitud   	
    	for( int i=0 ; i< cartaspc.length;i++) {
//inicializar todas las posiciones de los arreglos    		
    	cartasj[i]="";
    	
    	cartaspc[i]="";
    	}
 }
    //concatenar
    //creo el metodo barajarCarta para escoger una carta 
    //el String hace referecia al valor y simbolo que tiene cada carta
    //el int le da un valor cuantitativo
    //como hay 2 jugadores y se tiene que tener el acumulado que llevan se tiene que diferenciar
    // quien es el jugador1 y la maquina2
public String barajarCarta(int turno) {
	  String respuesta="";
	  int numero = (int) Math.floor(Math.random()*10+1);
	  if(numero==1) {
	   respuesta="as";
	   
	   if(turno==1) {
		   totalj+=11;
	   }else if(turno==2) {
		  totalpc+=11;
	   }
	   
	  }else 
	  if(numero==2) {
	   respuesta="2";
	   if(turno==1) {
		   totalj+=2;
	   }else if(turno==2) {
		  totalpc+=2;
	   }
	   
	  }else
	  if(numero==3) {
		 respuesta="3";
		 if(turno==1) {
			   totalj+=3;
		   }else if(turno==2) {
			  totalpc+=3;
		   }
	  }else
	  if(numero==4) {
		 respuesta="4";
		 if(turno==1) {
			   totalj+=4;
		   }else if(turno==2) {
			  totalpc+=4;
		   }
	  }else
	  if(numero==5) {
		  respuesta="5";
		  if(turno==1) {
			   totalj+=5;
		   }else if(turno==2) {
			  totalpc+=5;
		   }
      }else
      if(numero==6) {
    	  respuesta="6";
    	  if(turno==1) {
   		   totalj+=6;
   	   }else if(turno==2) {
   		  totalpc+=6;
   	   }
      }else
      if(numero==7) {
    	  respuesta="7";
    	  if(turno==1) {
   		   totalj+=7;
   	   }else if(turno==2) {
   		  totalpc+=7;
   	   }
      }else
      if(numero==8) {
    	  respuesta="8";
    	  if(turno==1) {
   		   totalj+=8;
   	   }else if(turno==2) {
   		  totalpc+=8;
   	   }
      }else
      if(numero==9) {
    	  respuesta="9";
    	  if(turno==1) {
   		   totalj+=9;
   	   }else if(turno==2) {
   		  totalpc+=9;
   	   }
      }else
      if(numero==10) {
    	  if(turno==1) {
   		   totalj+=10;
   	   }else if(turno==2) {
   		  totalpc+=10;
   	   }
    	  //Se hace otro random para escoger al azar las 4 letras q tienen el mismo valor
    	  int numero2 = (int) Math.floor(Math.random()*4+1);
    	  if(numero2 == 1){
    		  respuesta="10";
          }
          if(numero2 == 2) {
        	  respuesta="j";
          } 
          if(numero2 == 3) {
        	  respuesta="q";
          }
          if(numero2 == 4) {
             respuesta="k";
          }
      }
	  // se hace el mismo proceso pero solo se concatena el valor con el simbolo de la carta
	  int grupo = (int) Math.floor(Math.random()*4+1);
	  if(grupo == 1){
		  respuesta+="trebol";
      }
      if(grupo == 2) {
    	  respuesta+="pica";
      } 
      if(grupo == 3) {
    	  respuesta+="diamante";
      }
      if(grupo == 4) {
         respuesta+="corazon";
      }
      //prueba
     /* System.out.println(respuesta);*/
  return respuesta;
  
}
//true si la carta esta en juego, false si no
//verificar si las cartas estan en juego
 public boolean verificarCarta(String respuesta) {
	  int aux=0;
	  for( int i=0 ; i< cartaspc.length;i++) {
		  if(cartaspc[i].equalsIgnoreCase(respuesta)) {
			 return true;
		 }else {
			 aux++;
		 }
	}
	  for( int i=0 ; i< cartasj.length;i++) {
		  if(cartasj[i].equalsIgnoreCase(respuesta)) {
			 
			 return true;
		 }else {
			 aux++;
			//primero verifica todas las posiciones del pc y del jugador, si
			 //alguna carta esta en juego o no
			 if(i==3&&aux==8) {
				 return false;
			 }
		 }
	  }
	 return false;    
  }
 public String[] turnoPc() {
	 
	 int totalanteriorpc=totalpc;
	 String carta = barajarCarta(2);
	 for(int j= 0; j<1;j--) {
		 if(verificarCarta(carta)==true) {
			 totalpc=totalanteriorpc;
			 carta=barajarCarta(2);
			//prueba
			/* System.out.println("carta en juego"); */
			
		 }else {
			 //la carta no esta en juego y necesita volver a recorrer el arreglo
			 //para verficar que espacio esta vacio y guardar
			 for(int i=0; i<cartaspc.length;i++) {
				 if(cartaspc[i].equalsIgnoreCase("")) {
					 cartaspc[i]=carta;
					/* System.out.println("totalpc"+totalpc);*/
					 return cartaspc;
				 }else {
					 if(i==3) {
						 //rompo el ciclo infinito ya que se verfico todas las posiciones
						 j=2;	
						 maximoCartas=(true);
						 //verificar que ya estan las 8 posiciones llenas
					 }
					
				 }
				 }
		 }
	}
	 return cartaspc;
 }
 //inicializa todo el juego
 //cadena de String: retorna todas las cartas en juego del jugador
 //se crea el for infinito para verificar si la carta seleccionada esta en juego
 //
public String[] turnoJ() {
	 
	 int totalanteriorj=totalj;
	 String carta = barajarCarta(1);
	 // creo un variable j cuyo valor es 0,solo puedo tomar valores de -infinito a cero, 
	 //al final de cada iteracion j se le resta 1 hasta que la carta no este repetida
	 for(int j= 0; j<1;j--) {
		 if(verificarCarta(carta)==true) {
			 totalj=totalanteriorj;
			 carta=barajarCarta(1);
			/*System.out.println("carta en juego"); */
		 }else {
			 //verifica el arreglo de cartas hasta que una posicion este vacia
			 for(int i=0; i<cartasj.length;i++) {
				 if(cartasj[i].equalsIgnoreCase("")) {
					 cartasj[i]=carta;
					 //prueba
					 System.out.println("totalj"+totalj);
					 
					 return cartasj;
			//si el jugador ya tiene las 4 cartas que le permite el juego se rompo el ciclo
					 //for con el j=2
		}else {
			if(i==3) {
				//prueba
				System.out.println("numero maximo de cartas 4");
				j=2;
			}
		}
			
		} 
		}
	}
	 return cartasj;
 }
// verificar si gano o perdio y empato
//dado el caso que la persona saque menor a 21 el pc saque cartas hasta sacar 21
public String verificarCasos() {
	
	if(totalj==21) {
		
		return "gano";
		
	}else if(totalj>21) {
		
	return "perdio";
		
  }else if (totalj<21) {
	  for(int j= 0; j<1;j--) {
			turnoPc();
			if(totalpc==21) {
			
			return "perdio";
	}else if (totalpc>21) {
		return "gano";
	}
			else if(totalpc<21&&totalpc==totalj&&maximoCartas==true) {
					
	return "empate";	
	//si el jugador y la computadora tiene un puntaje menor a 21 y ya tienen el maximo de cartas
	//verificar quien gano y quien perdio
	}else if (totalj<21&&totalpc<21&&maximoCartas==true) {
		if(totalpc>totalj) {
			return "perdio";
		}else {
			return "gano";
		}
	}
	}
  }

	return "perdio";
}

public String[] getCartaspc() {
	return cartaspc;
}
public void setCartaspc(String[] cartaspc) {
	this.cartaspc = cartaspc;
}
public String[] getCartasj() {
	return cartasj;
}
public void setCartasj(String[] cartasj) {
	this.cartasj = cartasj;
}
  
  


}

