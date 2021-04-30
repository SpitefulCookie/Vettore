import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStreamReader;

public class Main { 

    public static void main(String[] args) {
        
        BufferedReader br;
    
        ArrayList<Vettore> vettori = new ArrayList<>();

        String input="";

        br = new BufferedReader(new InputStreamReader(System.in));

        do{

            System.out.print("Inserire il comando da eseguire: ");

            try{

                input = br.readLine();

                if(input.toUpperCase().startsWith("V")){

                    input = input.substring(2); //rimuove la "V "
    
                    String[] valori = input.split(",");

                    Vettore v = new Vettore(valori.length);

                    try{

                        if(v.addValore(valori) == 0){

                            vettori.add(v);

                            System.out.println("Inserimento ok");

                        } else{

                            System.out.println("Inserimento fallito");

                        }                        

                    } catch (VettorePienoException F){

                        System.out.println("Il vettore è pieno!");

                    }                  
    
                } else if(input.toUpperCase().startsWith("MIN")){

                    double min = Integer.MAX_VALUE;

                    int indiceMin = 0;

                    if(!vettori.isEmpty()){

                        for( int i = 0; i< vettori.size(); i++){

                            if(vettori.get(i).getModulo() < min){

                                min = vettori.get(i).getModulo();

                                indiceMin = i;

                            }
                        
                        }

                    } else{

                        System.out.println("Non sono stati inseriti vettori!");

                    }

                    System.out.println("Il vettore con il modulo minore è ["+ vettori.get(indiceMin).toString() +"] \nModulo: ("+min+").");
                    
                } else if(input.toUpperCase().startsWith("MAX")){
                    
                    double max = Integer.MIN_VALUE;

                    int indiceMax = 0;

                    if(!vettori.isEmpty()){

                        for(int i = 0; i< vettori.size(); i++){

                            if(vettori.get(i).getModulo() > max){

                                max = vettori.get(i).getModulo();

                                indiceMax=i;

                            }
                        
                        }

                    } else{

                        System.out.println("Non sono stati inseriti vettori!");

                    }

                    System.out.println("Il vettore con il modulo minore è ["+ vettori.get(indiceMax)+"] \nModulo: ("+ max +").");
                    
                }
    
            }catch (IOException e){

                e.printStackTrace();

            }
        
        } while(!input.toUpperCase().equals("EXIT"));

		try{

			br.close();

		}catch (IOException e){

			e.printStackTrace();

		}
		
		System.out.println("Uscita programma");

    }

}

