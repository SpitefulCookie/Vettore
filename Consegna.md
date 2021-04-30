```

Un Vettore è una sequenza lineare di numeri eterogenei tra di loro (tutti dello stesso tipo) di lunghezza finita e determinabile
Ad esempio, un vettore n-dimensionale è una sequenza di n valori.



La classe deve avere:
- Un costruttore che permette di inizializzare un vettore vuoto, definendo la sua lunghezza massima (differente dal numero di valori effettivamente contenuti)
- Un metodo per aggiungere un nuovo valore al vettore. 
- Un metodo per visualizzare tutti i valori contenuti nel vettore. ( ovvero il metodo toString() cella classe )
- Un metodo che restituisce il modulo del vettore (radice quadrata della somma dei valori al quadrato)
- Un metodo che ritorna la lunghezza della sequenza

• Scrivere la classe Vettore


• Scrivere inoltre la una classe di prova che deve permettere l'inserimento di vettori e la gestione da standard input e la gestione dell'input, secondo la seguente grammatica:

V a, b, c, d, ...        <- inserimento di un nuovo vettore
MIN                       <- restituzione del vettore con modulo minimo
MAX                     <- restituzione del vettore con modulo massimo
EXIT                      <- esce dal programma


ad es


>V 1, 1, 1, 1
>    inserimento ok
> V 2, 2, 2
>   inserimento ok
> MIN 
>  il vettore con modulo minore è [1, 1, 1, 1] (modulo 1)

> V 3, 3
>   inserimento ok
> MAX
>  il vettore con modulo maggiore è [3, 3] (modulo 4.24)

```