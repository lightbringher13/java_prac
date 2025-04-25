class Str {
    public static void main(String args[]) {
        String name = "riss";
        System.out.println(name);

        //16bytes is always add
        StringBuffer mutable_str = new StringBuffer("riss");
        mutable_str.append(" is handsome");

        System.out.println(mutable_str);

    }
}