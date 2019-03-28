public class MainClassGenerics {
    public static void main(String[] args) {
        BoxN<Integer> boxInteger = new BoxN<>();
        boxInteger.set(2);

        System.out.println("My box value is:" + boxInteger.get().floatValue());

        BoxN<String> boxString = new BoxN<>();
        boxString.set("My String");

        BoxO oldBOxInteger = new BoxO();
        oldBOxInteger.set(2);

        System.out.println("My box value is:" + oldBOxInteger.get());

//        System.out.println("Sum of boxes:"+);
    }
}