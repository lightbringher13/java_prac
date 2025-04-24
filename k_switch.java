class SWitch {
    public static void main(String args[]){
        //older version
        String day = "Mon";
        switch(day) {
            case "Sat","Sun": 
                System.out.println("6am");
                break;
            case "Mon":
                System.out.println("7am");
                break;
            default:
                System.out.println("love");
        }

        //new version
        switch(day) {
            case "Sat","Sun" -> System.out.println("6am");
            case "Mon" -> System.out.println("7am");
            default -> System.out.println("8am");
        }
        String res = "";
        //switch -> expression
        res = switch(day) {
            case "Sat","Sun" -> "6am";
            case "Mon" -> "7am";
            default -> "8am"; 

        };
        System.out.println(res);

        String res1 = "";
        //switch -> expression
        res1 = switch(day) {
            case "Sat","Sun" : yield "6am";
            case "Mon" : yield "7am";
            default : yield "8am"; 

        };
        System.out.println(res1);
    }
}