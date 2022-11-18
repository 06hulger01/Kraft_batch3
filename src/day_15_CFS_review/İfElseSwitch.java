package day_15_CFS_review;

public class İfElseSwitch {
    public static void main(String[] args) {
//        if -else
//        type1
        int x = 10;
        int y = 100;
        int z = 5;

        if (x>y && x==10 || z+x>=10){
            System.out.println("ben yurudum");
        }
//        type2
        System.out.println("type2");

        if (x==y){
            System.out.println("x y ye eşittir");
        }else{
            System.out.println("x y ye eşit değildir");

        }
//          type3
        System.out.println("type3");
        if (x==y){
            System.out.println("x y ye eşittir");
        }
        if (x!=y){
            System.out.println("x y ye eşit değildir");
        }

//        type4
        System.out.println("type4");

        if (x==y){
            System.out.println("x y ye eşittir");

        } else if (x > y) {
            System.out.println("x y den buyuktr");

        }else{
            System.out.println("y x den buyuktr");

        }

//        switch1
        System.out.println("switch1");
        int button = 0;
        switch(button){
            case 0:
                System.out.println("light is on");
                break;
            case 1:
                System.out.println("light is off");
                break;
            default:
                System.out.println("no action");
                break;
        }

//        switch2
        System.out.println("switch2");

        boolean elektrik = true;
        button = -3;
        if (elektrik){

            switch(button){
                case 0:
                    System.out.println("light is on");
                    break;
                case 1:
                    System.out.println("light is off");
                    break;
                default:
                    switch (button){
                        case -1:
                            System.out.println("faz kesik");
                            break;
                        case -2:
                            System.out.println("hat arızalı");
                            break;
                    }
                    System.out.println("bilinmeyen durum");
                    break;
            }

        }else{
            System.out.println("elektrikler kesik");
            System.out.println("ısık zaten kapalı");
        }
    }
}
