package arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo3x3 {
    public static String Read3x3(String Caminho3x3){
        String conteudo3x3 = "";
        try {
            FileReader arquivo3x3 = new FileReader(Caminho3x3);
            BufferedReader lerArquivo3x3 = new BufferedReader(arquivo3x3);
            String linha3x3="";
            try {
                linha3x3 = lerArquivo3x3.readLine();
                while(linha3x3!=null){
                    conteudo3x3 += linha3x3+"\n";
                    linha3x3 = lerArquivo3x3.readLine();
                }
                arquivo3x3.close();
                return conteudo3x3;
            } catch (IOException ex) {
                System.out.println("Erro: Não foi possível ler o arquivo!");
                return "";
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: Arquivo não encontrado!");
            return "";
        }
    }
    
    public static boolean Write3x3(String Caminho3x3,String Texto3x3){
        try {
            FileWriter arquivo3x3 = new FileWriter(Caminho3x3);
            PrintWriter gravarArquivo3x3 = new PrintWriter(arquivo3x3);
            gravarArquivo3x3.println(Texto3x3);
            gravarArquivo3x3.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
