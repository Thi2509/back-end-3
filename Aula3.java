import java.util.HashMap;

public class Aula3 {
public static void main(String[] args) {

HashMap<Integer, String> produtos = new HashMap<>();
produtos.put(101, "Notebook");
produtos.put(102, "Mouse");
produtos.put(103, "Teclado");
produtos.put(104, "Monitor");
produtos.put(105, "Impressora");

produtos.remove(103);
System.out.println("Depois de remover: " + produtos);
  }
}