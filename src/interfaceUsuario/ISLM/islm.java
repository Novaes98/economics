package interfaceUsuario.ISLM;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class islm {
    public static void criarGrafico(String[] args) throws Exception {
        final String dir = System.getProperty("user.dir");
        String type, c0, c1, T, I, G, M, P, MP;
        type = args[0];
        c0 = args[1];
        c1 = args[2];
        T = args[3];
        I = args[4];
        G = args[5];
        M = args[6];
        P = args[7];
        MP = args[8];
        String command = String.format("islm.exe %s %s %s %s %s %s %s %s %s", type, c0, c1, T, I, G, M, P, MP);
        ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", "/c", "cd "+dir+"/ISLM/ && " + command);
        builder.redirectErrorStream(true);
        Process p = builder.start();
        // Ler o que sair no console ao rodar o programa:
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
        }
    }
}