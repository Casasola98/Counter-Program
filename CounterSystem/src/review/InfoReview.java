package review;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class InfoReview {
    
    public InfoReview(){
        
    }
    
    public static boolean isNumber(String theNumber){
        try{
            if(Integer.parseInt(theNumber)>0)
                return true;
            else
                return false;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public static boolean isTelephone(String theNumber){
        try{
            int possible = Integer.parseInt(theNumber);
            if(theNumber.length() == 8)
                return true;
            else
                return false;
        }
        catch(Exception e){
            return false;
        }
    }

    public static Date crearFecha(String laFecha){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date fecha = sdf.parse(laFecha);
            return fecha;
        }catch(Exception e){
            return null;
        }
    }
    
    public static String getStrFecha(Date fecha){
        return new SimpleDateFormat("dd-MM-yyyy").format(fecha);
    }
    
    public static boolean validDate(int dia, int mes, String anno){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = anno + "-" + String.valueOf(mes) + "-" + String.valueOf(dia) ;
            Date lFecha = sdf.parse(fecha);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public static boolean fieldIsEmpty(String evaluate){
        evaluate = evaluate.replace(" ", "");
        if(evaluate.isEmpty())
            return true;
        return false;
    }
    
    public static void errorMessage(String message){
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.WARNING_MESSAGE);
    }
    
    public static void infoMessage(String message){
        JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.INFORMATION_MESSAGE);
    }
            
}
