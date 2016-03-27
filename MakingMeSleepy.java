
package makingmesleepy;

import java.io.IOException;

public class MakingMeSleepy {

    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime();
        rt.exec("cmd.exe /c start rundll32.exe powrprof.dll,SetSuspendState 0,1,0");
    }
    
}
