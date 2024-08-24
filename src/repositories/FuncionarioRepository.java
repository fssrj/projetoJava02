package repositories;

import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import entities.Funcionario;

public class FuncionarioRepository {
	
	public void exportarDados(Funcionario funcionario) {
		
		try {
			
			var fileWriter = new FileWriter("c:\\temp\\Funcionarios.txt", true);
			var printWriter = new PrintWriter(fileWriter);
			
			printWriter.write("FUNCIONARIO: ");
			printWriter.write("\nId-----------------> "+funcionario.getId());
			printWriter.write("\nNome---------------> "+ funcionario.getNome());
			printWriter.write("\nMatricula----------> "+funcionario.getMatricula());
			printWriter.write("\nAdmimissão---------> "+funcionario.getDataAdmissao());
			printWriter.write("\nTipo Contratação --> "+funcionario.getTipoContratacao());
			printWriter.write("\n");
			printWriter.flush();
			printWriter.close();
			
			JOptionPane.showMessageDialog(null, "Dados Gravados com Sucesso!");
			
		} catch (Exception e) {
			System.out.println("\nERRO-------> "+e.getMessage());
		}
		
	}

}
