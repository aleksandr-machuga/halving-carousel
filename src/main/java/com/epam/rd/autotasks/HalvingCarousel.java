package com.epam.rd.autotasks;

public class HalvingCarousel extends DecrementingCarousel {


    public HalvingCarousel(final int capacity) {
        super(capacity);
    }

    @Override
    public HalvingCarouselRun run() {
        if (!isRun){
            isRun=true;
            return new HalvingCarouselRun(elements);
        }else {
            return null;
        }
    }
}
