package java_for_coding_test;

class StringBuilderPrac {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append(" riss");

        //index,string
        sb.insert(3,"riss");

        //index
        sb.delete(3,7);

        //index one char
        sb.deleteCharAt(0);

        //replace
        sb.replace(0,4,"java");

        // show char
        sb.charAt(3);

        //repalce char index
        sb.setCharAt(1,'a');
        
        System.out.println(sb.toString());

    }
}