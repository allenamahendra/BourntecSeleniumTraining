package stringFunctions;

import org.junit.jupiter.api.Test;

public class Replace {
    @Test
    public void replace(){
        String mrp="₹39,900";
        String discount="25% off";
        String extradis="₹9901 off";

        mrp= mrp.replace("₹","");
        mrp=mrp.replace(",","");
        discount=discount.replace("%","");
        discount =discount.replace("off","");
        extradis =extradis.replace("₹","");
        extradis =extradis.replace("off","");


        String actualvalue="₹29,999";
        double expvalue;
       double mrpval = Double.parseDouble(mrp);
       double discountval = Double.parseDouble(discount);
       double extradisval = Double.parseDouble(extradis);

       expvalue=mrpval*(discountval+extradisval)/10000;

        System.out.println("mrp string value: "+mrp);
        System.out.println("mrp string vale: "+mrpval);
        System.out.println("discount value: "+discount);
        System.out.println("discount value after double: "+discountval);
        System.out.println("extra discount: "+extradisval);
        System.out.println("ecpected value: "+expvalue);


    }

    public void convertToDecimal(String val){
        val=val.replace("₹"," ");


    }

}
