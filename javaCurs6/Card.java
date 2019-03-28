import java.util.*;


public class Card{

String number;

public Card(String number){

    this.number=number;
}
@Override
public boolean equals(Object o){

    if(o==null) return false;
    
    if(o instanceof Card){
    Card c=(Card) o;
    return c.number.equals(this.number);
    }
     return false;
}


    @Override
    public int hashCode(){
        return Arrays.asList(this.number.split(""))
        .stream()
        .mapToInt(Integer::parseInt)
        .sum();
    }

    
    @Override
    public void finalize(){
    //ultimul lucru pe care l face constructorul inainte as initializeze instante e finalize
    //
    
    }
}

/* GarbageCollector mecanism de dezalocare din heap
 * Tot ce e creat ca instanta cu new ceva se duce in heap
 * orice zona de memorie care e local creata se duce in stack pe layerul pe care e construita
 * orice informatie definita ca instanta se duc ein heap 
 * mecanismul de dezalocare e automat in java
 * sa ne asiguram ca nu pastram referinte ale obiectelor, daca facem lucrul asta putem umple heapul si eroare e outofmemoryerror
 * memory leak tip de eroare in care pastram referinte catre obiecte si ele nu mai pot fi dezalocate
 * 
   
   
   
   */