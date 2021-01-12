package arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo5x5 {
    public static String Read5x5(String Caminho5x5){
        String conteudo5x5 = "";
        try {
            FileReader arquivo5x5 = new FileReader(Caminho5x5);
            BufferedReader lerArquivo5x5 = new BufferedReader(arquivo5x5);
            String linha5x5="";
            try {
                linha5x5 = lerArquivo5x5.readLine();
                while(linha5x5!=null){
                    conteudo5x5 += linha5x5+"\n";
                    linha5x5 = lerArquivo5x5.readLine();
                }
                arquivo5x5.close();
                return conteudo5x5;
            } catch (IOException ex) {
                System.out.println("Erro: Não foi possível ler o arquivo!");
                return "";
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: Arquivo não encontrado!");
            return "";
        }
    }
    
    public static boolean Write5x5(String Caminho5x5,String Texto5x5){
        try {
            FileWriter arquivo5x5 = new FileWriter(Caminho5x5);
            PrintWriter gravarArquivo5x5 = new PrintWriter(arquivo5x5);
            gravarArquivo5x5.println(Texto5x5);
            gravarArquivo5x5.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
