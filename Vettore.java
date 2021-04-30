import java.util.ArrayList;

public class Vettore{

    private int dimMax;

    private ArrayList<Integer> valori;

    public Vettore(int dim){

        this.dimMax = dim;

        valori = new ArrayList<>();

    }

    public int addValore(String[] val) throws VettorePienoException{ //passare stringa con solo i valori da aggiungere
        
        if(val.length <= (this.dimMax - valori.size())){

            for(String s : val){ 

                try{

                    this.valori.add(Integer.parseInt(s));

                } catch(NumberFormatException f){

                    System.out.println("I valori inseriti sono invalidi!");

                    return 1;

                }
                
            }
            
        } else{

            throw new VettorePienoException();

        }        

        return 0;

    }

    @Override
    public String toString(){

        String buffer="";

        for(int i = 0; i< this.valori.size(); i++){

            //buffer.concat(String.valueOf(this.valori.get(i))+" ");

			 buffer += String.valueOf(this.valori.get(i));

			 if(i!=this.valori.size()-1){
				 
				 buffer += ", ";

			 }

        }

		return buffer;

    }

    public double getModulo(){

        double modulo = 0;

        for(int i = 0; i< this.valori.size(); i++){

            modulo += (this.valori.get(i)*this.valori.get(i));

        }

        modulo = Math.sqrt(modulo);

        return modulo;

    }

    public int getSize(){

        return this.valori.size();

    }

}