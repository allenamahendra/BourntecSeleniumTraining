package accessModifiers;

import org.junit.jupiter.api.Test;

public class Access1 {
    private String privatevar;
    public  String publicvar;
    protected String protectedvar;
    String defaultvar;



    private void testprivate(){

    }
    public void testpublic(){

    }
    protected void testprotected(){

    }
    void testdefault(){

    }

    @Test
    public void testaccess(){
        privatevar="123";
        testprivate();


        publicvar = "123";
        testpublic();

        protectedvar="123";
        testprotected();

        defaultvar="123";
        testdefault();

    }

}
