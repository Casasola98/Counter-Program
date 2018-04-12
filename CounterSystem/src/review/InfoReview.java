package review;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class InfoReview {
    /**
     * Retorna si el String esta conformado por numeros
     * @param theNumber
     * @return 
     */
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
    /**
     * Retorna si el String es valido como un numero de telefono
     * @param theNumber
     * @return 
     */
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
    /**
     * Crea una fecha a base de un String
     * @param laFecha
     * @return 
     */
    public static Date crearFecha(String laFecha){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date fecha = sdf.parse(laFecha);
            return fecha;
        }catch(Exception e){
            return null;
        }
    }
    /**
     * Retorna un Date como un string
     * @param fecha
     * @return 
     */
    public static String getStrFecha(Date fecha){
        return new SimpleDateFormat("dd-MM-yyyy").format(fecha);
    }
    /**
     * retorna si los datos son validos para formar una fecha o no
     * @param dia
     * @param mes
     * @param anno
     * @return 
     */
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
    /**
     * Retorna si el String esta vacio
     * @param evaluate
     * @return 
     */
    public static boolean fieldIsEmpty(String evaluate){
        evaluate = evaluate.replace(" ", "");
        if(evaluate.isEmpty())
            return true;
        return false;
    }
    /**
     * Presenta en pantalla un mensaje de error
     * @param message 
     */
    public static void errorMessage(String message){
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.WARNING_MESSAGE);
    }
    /**
     * Presenta en pantalla un mensaje de informacion
     * @param message 
     */
    public static void infoMessage(String message){
        JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.INFORMATION_MESSAGE);
    }
            
}
