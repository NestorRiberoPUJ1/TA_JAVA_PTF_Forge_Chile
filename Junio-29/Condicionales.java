public class Condicionales {

    public Double getSqrt(Double num){
        if(num==0){
            return 0.0;
        }
        else if(num>0){
            return Math.sqrt(num);
        }
        else{
            return null;
        }
    }
    public Double getSqrt(Double num, boolean useImaginary){

        if(num==0){
            return 0.0;
        }
        else if(num>0){
            return Math.sqrt(num);
        }
        else if(useImaginary==true){
            return Math.sqrt(num);
        }
        else{
            return null;
        }


    }


}
