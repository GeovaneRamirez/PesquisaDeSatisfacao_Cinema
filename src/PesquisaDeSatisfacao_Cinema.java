
import javax.swing.JOptionPane;

/*
 
Um cinema possui capacidade de 40 lugares e está sempre com ocupação total.
Certo dia, cada espectador respondeu a um questionário, no qual constava:

  - idade;
  - opinião em relação ao filme, segundo as seguintes notas:

      A - Ótimo /  B - Bom / C - Regular  / D - Ruim  / E -  Péssimo.

Elabore a codificação em JAVA para que leia os dados, calcule e exiba na tela:

 - a quantidade de respostas "ótimo";

- a média de idade das pessoas que responderam "ruim";

- a porcentagem de respostas "péssimo".
 */
public class PesquisaDeSatisfacao_Cinema {

    public static void main(String[] args) {
        
    int idade, soma_idade = 0, cont=1, otimo=0, bom=0, regular=0, ruim=0, pessimo=0;
    char opiniao;
    int clientes = 40;
    while (cont <= clientes) {
        idade = Integer.parseInt(JOptionPane.showInputDialog("Cliente " + cont + " digite sua idade: "));
        cont++;
        
        opiniao = JOptionPane.showInputDialog("Digite sua opinião:"
                + "\nA - Ótimo | B - Bom | C - Regular | D - Ruim | E - Péssimo").charAt(0);
        switch (opiniao) {
            case 'a':
            case 'A':
                otimo = otimo + 1;
                break;
            case 'b':
            case 'B':
                bom = bom + 1;
                break;
            case 'c':
            case 'C':
                regular = regular + 1;
            case 'd':
            case 'D':
                ruim = ruim + 1;
               soma_idade=idade+soma_idade;
                break;
            case 'e':
            case 'E':
                pessimo = pessimo + 1;
                break;
            default:
               JOptionPane.showMessageDialog(null, "Opção Inválida!!!");
    } } 
    
    JOptionPane.showMessageDialog(null, " A quantidade de clientes que respondeu ótimo foi: " 
            + otimo + ".\n A média das idades das pessoas que responderam ruim é: "
            + (soma_idade/ruim) + ".\n A procentagem de pessoas que responderam péssimo é: " 
            + (pessimo*100/clientes) + ".");
   
            }
}
