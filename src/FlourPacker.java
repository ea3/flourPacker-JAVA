public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigTtl = bigCount*5;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }else if((bigTtl+smallCount) < goal){
            return false;
        }else if (goal % 5 ==0 || goal % 5 <= smallCount){
            return true;
        }else {
            return false;
        }
    }
}
