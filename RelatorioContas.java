package Desafio;

/*
Você precisa exibir relatórios de contas a pagar e receber, pois ajudará no controle do que tem para pagar e receber na empresa. Para isso, precisará de uma nova classe chamada RelatorioContas.
Essa nova classe deve possuir um método que recebe um array de contas e exibe o detalhamento de todas elas.

A classe RelatorioContas não deve conhecer os detalhes das subclasses de Conta (ou seja, ContaPagar e ContaReceber). Não seria uma boa prática essa classe obter os detalhes das contas para mostrá-los
na tela, por isso, temos uma excelente ideia de uso da orientação a objetos.
Na classe Conta, adicione um método abstrato (não implementado).
Ao fazer isso, você será obrigado a implementar esse novo método nas subclasses ContaPagar e ContaReceber. Então, faça isso! Esse método deve exibir todos os detalhes do objeto em um formato
legal para aparecer em um relatório.
Agora você pode voltar à classe RelatorioContas e invocar o método exibirDetalhes() durante a listagem. Veja que a classe RelatorioContas só deve conhecer o nome do método exibirDetalhes(), mais nada!
*/
public class RelatorioContas {
    void exibirListagem(Conta [] contas) {
        for (int i = 0; i < contas.length; i++) {
            System.out.println("CONTA " + contas[i].getDescricao + " com o valor de R$ " + contas[i].getValor() + " com a data de vencimento para a data: " + contas[i].getDataVencimento());
        }
    }
}
