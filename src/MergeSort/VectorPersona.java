
package MergeSort;
import javax.swing.JOptionPane;

public class VectorPersona {
    Persona v[];
     public VectorPersona(int n){
        v=new Persona[n];
    }
     public void ingresarNoAF(){
       
        for(int i=0; i<v.length;i++){
            
              String nombre;
              nombre=JOptionPane.showInputDialog("Nombre de la persona "+ (i+1));
              Double nota=Double.parseDouble(JOptionPane.showInputDialog("Edad de "+nombre+": "));
              v[i]=new Persona(nombre,nota);
            
        }
        
        v[2].getNombre();   System.out.println(v[2].getNombre()+"termino");
    }
     @Override
    public String toString() {
       String s="\n";
       s += "NOMBRE \t EDAD\n";
       for(int i=0; i<v.length;i++){
           s +=v[i].getNombre()+"\t"+v[i].getEdad()+"\n";
       }
       s +="\n";
         System.out.println(s);
       return s;
    }
    public void mergePorEdades(int primero, int ultimo){
        int i;
        int j;
        if(ultimo>1){
            i=ultimo/2;
            j=ultimo-i;  
            mergePorEdades(primero,i);
            mergePorEdades(primero+i,j);
            merge(primero,i,j);
        }
    }

    private void merge(int primero, int i, int j) {
     Persona auxiliar[]=new Persona[i+j];
     int temp=0;
     int temp1=0;
     int temp2=0;
      while(temp1<i && temp2<j){
          if(v[primero+temp1].getEdad()<v[primero+i+temp2].getEdad()){
            auxiliar[temp++]=v[primero+(temp1++)];        
          }else{
              auxiliar[temp++]=v[primero+i+(temp2++)];
          } 
      }
      while(temp1<i){
          auxiliar[temp++]=v[primero+(temp1++)];
          
      }
      while (temp2<j){
          auxiliar[temp++]=v[primero+i+(temp2++)];
      }
    for(int k=0;k<i+j;k++){
        v[primero+k]=auxiliar[k];
    }
    }
}
