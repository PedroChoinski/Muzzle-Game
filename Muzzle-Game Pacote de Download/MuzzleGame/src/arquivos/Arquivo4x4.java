package arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo4x4 {
    public static String Read4x4(String Caminho4x4){
        String conteudo4x4 = "";
        try {
            FileReader arquivo4x4 = new FileReader(Caminho4x4);
            BufferedReader lerArquivo4x4 = new BufferedReader(arquivo4x4);
            String linha4x4="";
            try {
                linha4x4 = lerArquivo4x4.readLine();
                while(linha4x4!=null){
                    conteudo4x4 += linha4x4+"\n";
                    linha4x4 = lerArquivo4x4.readLine();
                }
                arquivo4x4.close();
                return conteudo4x4;
            } catch (IOException ex) {
                System.out.println("Erro: Não foi possível ler o arquivo!");
                return "";
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: Arquivo não encontrado!");
            return "";
        }
    }
    
    public static boolean Write4x4(String Caminho4x4,String Texto4x4){
        try {
            FileWriter arquivo4x4 = new FileWriter(Caminho4x4);
            PrintWriter gravarArquivo4x4 = new PrintWriter(arquivo4x4);
            gravarArquivo4x4.println(Texto4x4);
            gravarArquivo4x4.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
