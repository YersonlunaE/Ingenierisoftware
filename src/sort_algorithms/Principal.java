package sort_algorithms;
import java.io.*;
/**
 *
 * @author Johan Benavides Arias
 */
public class Principal {
static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        
        Sort_Algorithms sorts = new Sort_Algorithms();//sorts class call
        //Search_Algorithms search = new Search_Algorithms();//search class call
        Operations main = new Operations();//Operations class call
        int option = 0;
                
        try{
            bw.write("Ingrese números separados por ','\n\n");
                bw.flush();
                    int[] a = main.readArrayFronConsole();
            
            bw.write("\n¿CUAL METODO DE ORDENAMIENTO QUIERE USAR?\n");
                bw.write("\n1.Insertion Sort\n2.Bubble Sort\nOpcion: ");
                    bw.flush();
            while (option!=2){//menu sorting algorithms
                    String op= br.readLine();
                        option = Integer.parseInt(op);

                    if(option==1){
                        bw.write("\n.:INSERTION SORT:.\n");
                        bw.flush();
                            a = sorts.insertionSort(a);
                                main.printArray(a);
                                    break;
                    } 
                    if(option==2){
                        bw.write("\n.:BUBBLE SORT:.\n");
                        bw.flush();
                            a = sorts.bubbleSort(a);
                                main.printArray(a);
                                    break;
                    }
                    if(option!=1&&option!=2){
                        bw.write("¡OPCIÓN NO VALIDA!");
                        bw.flush();
                    }  
            }
          bw.flush();
        }catch (IOException ex){}
        
    }
    
}