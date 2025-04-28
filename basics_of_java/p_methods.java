class Computer {
    public void playMusic() {
        System.out.println("music is playing");
    }

    public String getMeAPen(int cost) {
        if (cost <= 10){
            return "Pen";
        }
        else {return "nothing";}
    }
}
class Methods{
    public static void main(String args[]){
        Computer com = new Computer();
        com.playMusic();
        String s = com.getMeAPen(10);
        System.out.print(s);
        
    }
}