public class Test {
    static boolean testPoints(Picture picture){
        if(picture.getColor(-3, 2) != Enum.SimpleColor.YELLOW){
            System.out.println("Test 1 failed");
            return false;
        } else if (picture.getColor(2, -3) != Enum.SimpleColor.GRAY) {
            System.out.println("Test 2 failed");
            return false;
        } else if (picture.getColor(6, 1) != Enum.SimpleColor.GREEN) {
            System.out.println("Test 3 failed");
            return false;
        } else if (picture.getColor(-3, -3) != Enum.SimpleColor.ORANGE) {
            System.out.println("Test 4 failed");
            return false;
        } else if (picture.getColor(-0.1, -0.8) != Enum.SimpleColor.BLUE) {
            System.out.println("Test 5 failed");
            return false;
        }
        else {
            return true;
        }

    }




}
