package com.epam.rd.autotasks;

public class HalvingCarouselRun extends CarouselRun{
    public HalvingCarouselRun(int[] elements) {
        super(elements);
    }
    @Override
    public int next(){
        if (isFinished()){
            return -1;
        }
        if (index==elements.length){
            index=0;
        }
        int element=elements[index];
        while (element==0){
            index++;
            if (index==elements.length){
                index=0;
            }
            element=elements[index];
        }
        elements[index]=elements[index++]/2;

        return element;

    }
}
