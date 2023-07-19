package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] Args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: "); //path é caminho
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		//pegar todas as pastas que estão a partir deste caminho, posso gerar uma listagem destas 5 pastas
		
		File[] folders = path.listFiles(File::isDirectory); //crio um vetor do tipo files e instancio ele fazendo uma filtragem e selecionando pastas
		//mostre somente quem for diretorio ou pasta, cria um vetor de files criando os caminhos para a pastinha
		System.out.println("Folder: ");
		
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile); //pego somente a listinha de arquivos
		System.out.println("Files: ");
		
		for(File file : files) {
			System.out.println(file);
		}
		//criar um subpasta a partir da pasta temp
		
		boolean sucess = new File(strPath + "\\subdir").mkdir(); //cria uma subpasta chamada subdir a partir desta pasta
		System.out.println("Directory created with sucessfull: " + sucess);
		sc.close();
	}
	
}
