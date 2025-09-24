import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     ArrayList<String> tarefas = new ArrayList<>();

     int opcao = 0;

     while (opcao != 4) {
         System.out.println("\n--- TO-DO LIST ---");
         System.out.println("1 - Adicionar Tarefa");
         System.out.println("2 - Listar Tarefas ");
         System.out.println("3 - Remover Tarefa");
         System.out.println("4 - Sair");
         System.out.println("Escolha uma opção: ");
         opcao = scanner.nextInt();
         scanner.nextLine(); // Consumir ENTER

         switch (opcao) {
             case 1:
                 System.out.println("Digite a tarefa: ");
                 String tarefa = scanner.nextLine();
                 tarefas.add(tarefa);
                 System.out.println("Tarefa adicionada!");
                 break;

             case 2:
                 System.out.println("\n--- Tarefas ---");
                 if (tarefas.isEmpty()) {
                     System.out.println("Nenhuma tarefa cadastrada!");
                 } else {
                     int index = 1;
                     for (String t : tarefas) {
                         System.out.println(index + ". " + t);
                         index++;
                     }
                 }
                 break;

             case 3:
                 if (tarefas.isEmpty()) {
                     System.out.println("Nenhuma tarefa cadastrada!");
                 } else {
                     System.out.println("Digite o número da tarefa para remover: ");
                     int num = scanner.nextInt();
                     if (num > 0 && num <= tarefas.size()) {
                         tarefas.remove(num - 1); // ajusta para índice real
                         System.out.println("Tarefa removida!");
                     } else {
                         System.out.println("Número inválido!");
                     }
                 }
                 break;

             case 4:
                 System.out.println("Saindo...");
                 break;

             default:
                 System.out.println("Opção inválida!");
         }
     }

     scanner.close();
        }
    }