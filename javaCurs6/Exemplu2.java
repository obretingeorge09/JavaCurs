public class Exemplu2{


    public static void main(String [] args){
    
        String s1 = "Hello";
        s1=s1+"world!";
    }
    
   
    
}//clasa string se foloseste mai bine doar pt operatii de parsare 
//clasa StringBuilder special construita pt modificarea stringurilor
//stringul nu se rezerva in memorie ca orice alt obiect;

//stringurile in memorie au o locatie speciala, numita spring pool, in cadrul heap ului

//daca folosesc constructor spre exemplu new String(o val) atunci nu se mai salveaza in String POOL ci in alta zona din heap, cea comuna

s