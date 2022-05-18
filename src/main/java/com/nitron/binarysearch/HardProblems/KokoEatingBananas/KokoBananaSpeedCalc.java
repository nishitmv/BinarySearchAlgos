package com.nitron.binarysearch.HardProblems.KokoEatingBananas;

public class KokoBananaSpeedCalc {
    public int calcEatingSpeed(int[] piles, int h) {

        long start = 0;

        long sum =0;

        for(long pileSize: piles)
            sum+=pileSize;

        long end  = sum;

        long result = -1;
        while(start<=end )
        {
            long mid = start + (end-start)/2;

            if(mid>0 &&isValid(piles, mid, h))
            {
                result = mid;
                end = mid -1;
            }
            else start = mid +1;
        }
    return (int) result;
    }

    private boolean isValid(int[] arr, long mid, int h) {

        long hours =0;

        for( long pile: arr) {
            if (pile >mid ) {
                if (pile % mid == 0)
                    hours += pile / mid;
                else
                    hours += (pile / mid) + 1;
            }
            else{
                hours+=1;
            }

            if(hours>h)
                return false;
        }
        return true;
    }
}
