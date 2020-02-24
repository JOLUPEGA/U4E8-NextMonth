/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NextMonth;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Jose Luis Perez
 */
public class NextMonth {
    
    private int numero;
    private Calendar fecha = new GregorianCalendar();
    
    public int getMesDia() {
        
        switch(fecha.get(Calendar.MONTH) ){
            case 0:
            case 2:
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
                    numero = 31;
                    break;
            case 3:
            case 5:
            case 8:
            case 10:
                    numero = 30;
                    break;
            case 1:
                    if((fecha.get(Calendar.YEAR)%4)==0){
                        numero = 29;
                    }
                    else{
                        numero = 28;
                    }
                    break;
            default:
                    break;
        }
        return  (numero - fecha.get(Calendar.DAY_OF_MONTH));
    }
}