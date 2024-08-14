/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filesdemostration;
// Figura 17.4: FileDemonstration. java
// A classe File utilizada para obter informações de arquivo e de diretório.
import java.io.File;
import java.util. Scanner;
/**
 *
 * @author Aluno
 */
public class FilesDemostration {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.print( "Enter file or directory name: " );
        analyzePath( input.nextLine() );
    }// fim de main
    // exibe informações sobre o arquivo que o usuário especifica
    public static void analyzePath( String path )
    {
        // cria o objeto File com base na entrada de usuário
        File name = new File( path );
        if (name.exists())// se o nome existir, gera saída das informações sobre ele
        {
            // exibe informações sobre o arquivo (ou diretório)
            System.out.printf(
            "%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s \n%s%s \n%s%s",
            name. getName (), " exists",
            (name. isFile() ? "is a file" : "is not a file" ),
            (name. isDirectory() ? "is a directory" :
            "is not a directory" ),
            (name. isAbsolute() ? "is absolute path" :
            "is not absolute path" ), "Last modified: ",
            name. lastModified(), "Length: ", name. length(),
            "Path:",name. getPath(), "Absolute path: ",
            name. getAbsolutePath(), "Parent: ", name.getParent() );
            if (name. isDirectory() ) // listagem de diretório de saída
            {
                String[] directory = name. list();
                System.out.println( "\n\nDirectory contents:\n" );
                for ( String directoryName : directory )
                System.out.println( directoryName );
            } // fim do if
        } // fim do if externo
        else // não for arquivo ou diretório, gera saída da mensagem de erro
        {
        System.out.printf( "%s %s", path, "does not exist." );
        } // fim de else
    } // fim do método analyzePath
} // fim da classe FileDemonstration
