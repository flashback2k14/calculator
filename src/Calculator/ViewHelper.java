package Calculator;

import javax.swing.*;

/**
 * Created by flashback2k14 on 16.01.2015.
 */
public class ViewHelper {

    public static void setNumberInput(CounterModel counterModel, Grundrechenarten grundrechenarten, View view, String clickedNumberButton) {
        counterModel.incCounter();

        if (grundrechenarten.getOperator() != null && !grundrechenarten.isClearedAfterOperator()){
            view.clearTextfield();
            grundrechenarten.setClearedAfterOperator(true);
        }

        view.addPressedButtonToTextfeld(clickedNumberButton);
        view.setCounterToAnzeigeFeld();
    }

    public static void setOperatorInput(CounterModel counterModel, Grundrechenarten grundrechenarten, View view, String clickedOperatorButton) {
        counterModel.incCounter();

        try{
            grundrechenarten.setZahl1(Integer.parseInt(view.getTextfield()));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(view, nfe.getMessage(), "NumberFormatException", JOptionPane.ERROR_MESSAGE);
        }

        view.clearTextfield();
        view.addPressedButtonToTextfeld(clickedOperatorButton);

        grundrechenarten.setOperator(view.getTextfield());

        view.setCounterToAnzeigeFeld();
    }

    public static void setEqualInput(CounterModel counterModel, Grundrechenarten grundrechenarten, View view) {
        counterModel.incCounter();

        try{
            grundrechenarten.setZahl2(Integer.parseInt(view.getTextfield()));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(view, nfe.getMessage(), "NumberFormatException", JOptionPane.ERROR_MESSAGE);
        }

        switch (grundrechenarten.getOperator()){
            case Constants.ADD:
                grundrechenarten.setErgebnis(grundrechenarten.add());
                view.setTextfield(String.valueOf(grundrechenarten.getErgebnis()));
                break;

            case Constants.SUB:
                grundrechenarten.setErgebnis(grundrechenarten.sub());
                view.setTextfield(String.valueOf(grundrechenarten.getErgebnis()));
                break;

            case Constants.MUL:
                grundrechenarten.setErgebnis(grundrechenarten.mul());
                view.setTextfield(String.valueOf(grundrechenarten.getErgebnis()));
                break;

            case Constants.DIV:
                grundrechenarten.setErgebnis(grundrechenarten.div());
                view.setTextfield(String.valueOf(grundrechenarten.getErgebnis()));
                break;

            default:
                break;
        }

        view.setCounterToAnzeigeFeld();
    }

    public static void setResetInput(CounterModel counterModel, VerlaufModel verlaufModel, Grundrechenarten grundrechenarten, View view, String clickedResetButton) {
        counterModel.incCounter();

        verlaufModel.addItemToVerlauf(grundrechenarten.toString());

        grundrechenarten.setZahl1(0);
        grundrechenarten.setZahl2(0);
        grundrechenarten.setOperator(null);
        grundrechenarten.setClearedAfterOperator(false);

        view.clearTextfield();
        view.setCounterToAnzeigeFeld();
    }
}