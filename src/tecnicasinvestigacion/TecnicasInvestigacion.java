package tecnicasinvestigacion;

import java.text.DecimalFormat;

import Formulas.Forms;

public class TecnicasInvestigacion {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.0");
        Forms frm = new Forms();

        System.out.println(frm.cronbach(0.5551, 1.2));
        
//        
//        System.out.println(frm.varS(4, 3, 4, 4, 5, 5, 4, 4));
//        System.out.println(frm.varS(4, 1, 5, 3, 2, 4, 4, 4));
//        System.out.println(frm.varS(3, 3, 4, 2, 4, 3, 2, 2));
//        System.out.println(frm.varS(15, 13, 25, 14, 19, 20, 19, 21));
    }

}
