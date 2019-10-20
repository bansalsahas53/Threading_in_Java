class first extends Thread{
        public void run(){
            try{
                for(int i=1;i<=15;i++){
                    System.out.println("sahas bansal------"+i);
                    sleep(1000);
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    class second extends Thread{
        public void run(){
            try{
                for(int j=50;j<90;j=j+2){
                    System.out.println(j+"-------the engineer");
                    sleep(500);
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }}
    class multi{


    public static void main(String[] args) {
        first th1 =new first();
        second th2 = new second();
        th1.start();
        th2.start();
    }}
