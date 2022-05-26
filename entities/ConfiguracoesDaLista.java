package entities;
import java.util.List;

public class ConfiguracoesDaLista {
	
	public String toString() {
		return "MENU INTERATIVO\n"
				+"\n"
				+ "Pressione: \n"
				+ "1 - Adicionar produtos a lista\n"
				+ "2 - Remover produtos da lista\n"
				+ "3 - Verificar os produtos da lista\n"
				+ "4 - Verificar quantos itens tem na lista\n"
				+ "------------------------------------------";	
	}
	
	public void addList(String produto, List<String> list) {

		list.add(produto);
	}
	
	public void removeList(String produto, List<String> list) {
		list.remove(produto);
	}
	
	public void sizeList(List<String> list) {
		list.size();
	}
	
	public void allList(List<String> list) {
		for (String auxiliar : list) {
			System.out.println(auxiliar);
		}
	}

}
