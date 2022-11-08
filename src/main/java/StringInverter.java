import java.lang.StringBuilder;

public class StringInverter implements StringTransformer{

    public void execute(StringDrink drink){
        String string = drink.getText();
        StringBuilder builder = new StringBuilder(string.toString());

        builder.reverse();

        drink.setText(builder.toString());
    }
}
