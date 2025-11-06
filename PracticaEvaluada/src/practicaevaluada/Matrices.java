/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaevaluada;
import javax.swing.JOptionPane;
/**
 *
 * @author PCadmin
 */
public class Matrices {

       
    public static void Ventas(){
        int columna=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos productos diarios hay: "));
        int fila=7;
        String[][] productos = new String [columna][fila];
        int[][] ventas = new int [columna][fila];
        
        String[] semana = {"Lunes", "Martes", "Miercoles","Jueves","Viernes","Sabado","Domingo"};
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                productos[i][j] = JOptionPane.showInputDialog("Ingrese el nombre del producto: "+ (j+1));
                ventas[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos ventas del producto hay: "+ productos[i][j]));
                
            }
        }
       
            
       
        
    }   
        
        
    
//    public static void llenarMatrix(String[][] productos, int fila, int col){
//        for (int i = 0; i < fila; i++) {
//            for (int j = 0; j < col; j++) {
//                productos[i][j]=JOptionPane.showInputDialog("Digite la posición fila: "+i +" columna: "+ j);
//            }
//        }
//    
//    }
//    
//    
//     public static void imprimeMatrix(String[][] matrix, int fila, int col){
//        String resultado = "";
//         
//        for (int i = 0; i < fila; i++) {
//            for (int j = 0; j < col; j++) {
//                resultado+= matrix[i][j]+ "-"; 
//            }
//            resultado+="\n";
//        }
//        JOptionPane.showMessageDialog(null, resultado);
//    }
}

