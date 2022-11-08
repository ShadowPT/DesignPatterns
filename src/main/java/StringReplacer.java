public class StringReplacer implements StringTransformer{

    private Character a;
    private Character x;
    public StringReplacer(Character a, Character x) {
        this.a = a;
        this.x = x;
    }

    public void execute(StringDrink drink) {
        String result = drink.getText();

        drink.setText(result.replace(a,x));
    }
}
