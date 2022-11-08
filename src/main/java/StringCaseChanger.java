public class StringCaseChanger implements StringTransformer{

    public void execute(StringDrink drink){

        StringBuilder builder = new StringBuilder(drink.getText());
        StringBuilder result = new StringBuilder();

        for(int i = 0; i<builder.length(); i++){
            Character c = builder.charAt(i);

            if(Character.isLowerCase(c)){
                result.append(Character.toUpperCase(c));
            } else {
                result.append(Character.toLowerCase(c));
            }
        }

        drink.setText(result.toString());
    }
}
