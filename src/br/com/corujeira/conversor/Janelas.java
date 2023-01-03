package br.com.corujeira.conversor;

import javax.swing.*;


public class Janelas {

    public void menuPrincipal() {
        String[] opcoes = new String[] {"Conversor de Moeda", "Conversor de Temperatura"};
        JOptionPane.showInputDialog(null, "Escolha uma opção",
                "Menu", JOptionPane.QUESTION_MESSAGE,null,
                opcoes, 0);
        inputValor();

    }

    public void inputValor() {
        String valor = (JOptionPane.showInputDialog(null,
                "Insira um valor"));
        if(valor == null || valor.equals(" ") || valor.matches("[A-Z]*") || valor.matches("[a-z]*")) {
            JOptionPane.showMessageDialog(null,"Valor inválido");
            inputValor();
        }
            opcoesDeMoeda();
    }

    public void opcoesDeMoeda() {
        String[] opcoes = new String[] {"De Reais a Dólares", "De Reais a Euros", "De Reais a Libras",
                "De Reais a Yenes", "De Reais a Won Coreanos", "De Dólares a Reais", "De Euros a Reais",
                "De Libras a Reais", "De Yenes a Reais", "De Won Coreanos a Reais"};
        JOptionPane.showInputDialog(null,
                "Escolha a moeda para qual deseja saber a conversão de valores", "Moedas",
                JOptionPane.QUESTION_MESSAGE, null, opcoes, 0);
        mensagemDoValor();
    }

    public void mensagemDoValor() {
        JOptionPane.showMessageDialog(null, "O valor da conversão é de ");
        desejaContinuar();
    }

    public void desejaContinuar() {
        int input = JOptionPane.showConfirmDialog(null, "Deseja Continuar?",
                "Selecione a opção", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE ,null);
        if(input == 0) {
            inputValor();
        }if (input == 1) {
            JOptionPane.showMessageDialog(null, "Programa finalizado",
                    "Menu", JOptionPane.OK_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "Programa concluído",
                    "Menu", JOptionPane.OK_OPTION);
        }
    }
}


