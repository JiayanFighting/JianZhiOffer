public class code_41 {
    public static void main(String[] args){
        double param_2;
        MedianFinder obj = new MedianFinder();
        obj.addNum(-1);
        param_2 = obj.findMedian();
        System.out.println(param_2);
        obj.addNum(-2);
        param_2 = obj.findMedian();
        System.out.println(param_2);
        obj.addNum(-3);
        param_2 = obj.findMedian();
        System.out.println(param_2);
        obj.addNum(-4);
        param_2 = obj.findMedian();
        System.out.println(param_2);
        obj.addNum(-5);
        param_2 = obj.findMedian();
        System.out.println(param_2);
    }


}
