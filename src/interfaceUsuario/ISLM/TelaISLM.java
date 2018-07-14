package interfaceUsuario.ISLM;


import interfaceUsuario.FrameSecundario;
import interfaceUsuario.InterfaceController;
import interfaceUsuario.ISLM.islm;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class TelaISLM extends FrameSecundario {
    private javax.swing.JTextField c0, c1, T, I, G, M, P, MP;
    private javax.swing.JCheckBox zero ,one, two, three, four;

    public TelaISLM(){

    }

    public void plottar(ActionEvent e) throws Exception {
        String type;
        if (this.zero.isSelected()){
            type = "0";
        }else if (this.one.isSelected()){
            type = "1";
        }else if (this.two.isSelected()){
            type = "2";
        }else if (this.three.isSelected()){
            type = "3";
        }else {
            type = "4";
        }
        String [] args;
        args = new String[9];
        args[0] = type;
        args[1] = this.c0.getText();
        args[2] = this.c1.getText();
        args[3] = this.T.getText();
        args[4] = this.I.getText();
        args[5] = this.G.getText();
        args[6] = this.M.getText();
        args[7] = this.P.getText();
        args[8] = this.MP.getText();
        islm.criarGrafico(args);
    }
    /***************************************************************************/

    protected void voltar(javax.swing.event.MenuEvent evt) {

        JFrame telaMacroeconomia = InterfaceController.controlaTelas("TelaMacroeconomia");
        telaMacroeconomia.setVisible(true);

        dispose();
    }

    /*******************************************************************************/


    @Override
    protected void definirTexto() {
        this.textoPrincipal =
                "O modelo IS-LM (curto para investment-savings, liquidity preference-money supply) \n" +
                "é um modelo macroeconômico Keynesiano que mostra a relação entre a taxa real de \n" +
                "juros (eixo das ordenadas) e o PIB real (eixo das abscissas) de um país. A taxa real\n" +
                "de juros se trata da taxa de juros nominal menos a taxa de inflação, e o PIB real é \n" +
                "representado pela equação Y = C + I + G + NX tal que:\n" +
                "\t- C (consumo) = c0 + c1(renda disponível = Y - T)\n" +
                "\t\t- c0: consumo autônomo (gastos em necessidades básicas)\n" +
                "\t\t- c1: propensão marginal a consumir (incremento no consumo sob o acréscimo na " +
                        "\t\t\trenda disponível)\n" +
                "\t- Y: renda agregada\n" +
                "\t- T: imposto agregado\n" +
                "\t- I (investimento planejado) = F(r)\n" +
                "\t- r: taxa real de juros  \n" +
                "\t- F(r) : função proporcionalmente inversa a r\n" +
                "\t- G: despesas públicas\n" +
                "\t- NX: exportações líquidas \n" +
                "\n" +
                "Para a curva de LM, temos a seguinte equação:\n" +
                " \tM/P = F(Y, r)  tal que M é o estoque de dinheiro (money supply) \n" +
                  "\t\te P o nível de preço. Ex.: Y - 20*r";
    }
}
