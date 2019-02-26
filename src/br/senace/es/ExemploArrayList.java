package br.senace.es;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExemploArrayList {

    public static void main(String[] args) {
        /**
         * Declaração e Instanciação do ArrayList
         * Em vez de colchete, usa-se a notação 'diamond' < >. 
         */
        ArrayList<String> lista = new ArrayList(); //também pode ser feito assim new ArrayList<>();

        String leitura, opcao;

        do {
            opcao = JOptionPane.showInputDialog("*** **** ****  Escolha uma opção  **** **** ****\n\n"
                    + "[1] Inserir um nome do ArrayList\n"
                    + "[2] Pesquisar um nome no ArrayList\n"
                    + "[3] Alterar um nome existente no ArrayList\n"
                    + "[4] Excluir um nome do ArrayList\n"
                    + "[5] Listar os nomes do ArrayList\n"
                    + "[0] Sair do programa\n"
                    + "\n**** **** **** **** **** **** **** **** **** **** ****");
            /**
             * Bloco da opção Inserir.
             */
            if (opcao.equals("1")) {
                leitura = JOptionPane.showInputDialog("Digite o nome a ser inserido: ");
                /**
                 * o método contains() retorna true (verdadeiro) se um elemento
                 * existir e falso caso ele não exita no ArrayList.
                 */
                if (lista.contains(leitura)) {
                    JOptionPane.showMessageDialog(null, "Este nome já existe na lista, digite outro");
                } else {
                    /**
                     * o método add() insere um item no ArrayList a cada vez que
                     * add é chamado, uma nova posição é criada e o item é
                     * inserido automaticamente nesta posição; Os itens
                     * inseridos anteriormente permanacem salvos em suas
                     * respectivas posições.
                     */
                    lista.add(leitura);
                }

            } 
            /**
             * Bloco da opção Pesquisar.
             */
            else if (opcao.equals("2")) {
                leitura = JOptionPane.showInputDialog("Digite o nome a ser pesquisado: ");
                /**
                 * o método lastIndexOf() retorna a última posição de algum
                 * elemento encontrado no ArrayList, ou -1 caso este elemento
                 * não exista.
                 */
                int pos = lista.lastIndexOf(leitura);

                if (pos == -1) {
                    JOptionPane.showMessageDialog(null, "O nome não foi encontrado");
                } else {
                    JOptionPane.showMessageDialog(null, "O nome foi encontrado na posição " + pos);
                }
            }
            /**
             * Bloco da opção Alterar.
             */
            else if (opcao.equals("3")) {
                   
            } 
            /**
             * Bloco da opção Excluir.
             */
            else if (opcao.equals("4")) {

            } 
             /**
             * Bloco da opção Listar.
             */
            else if (opcao.equals("5")) {
                String saida = "";
                /**
                 * Utilizando o comando 'for' trandicional
                 * Utilizamos o método size() para obter o tamanho do ArrayList 
                 * e o método get() para obter cada item pela sua posição.
                 */
                for (int i=0; i<lista.size(); i++){
                   saida = saida + lista.get(i) + "\n";                    
                }
                
                //resetando a String saida para fazer de outro jeito
                saida = ""; 
                /**
                 * Outro jeito de fazer, de forma implícita
                 * A variável elemento (String, porque o ArrayList é de Strings) irá receber um item da lista, 
                 * um de cada vez, do primeiro até o último, automaticamente.
                 */                    
                for (String elemento : lista) {
                    saida = saida + elemento + "\n";
                }
                
                JOptionPane.showMessageDialog(null, "*** Lista de Nomes ***\n" + saida);
            } 
            /**
             * Bloco da opção Excluir.
             */
            else if (opcao.equals("0")) {
                JOptionPane.showMessageDialog(null, "Programa encerrado");
            } 
            /**
             * Bloco da opção Inválida.
             */
            else {
                JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
            //enquanto a opção escolhida for diferente de 0, repita.
        } while (!opcao.equals("0"));

    }

}
