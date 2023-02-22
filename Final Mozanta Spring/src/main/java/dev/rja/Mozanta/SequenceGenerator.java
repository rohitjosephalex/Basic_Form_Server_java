package dev.rja.Mozanta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SequenceGenerator {
    @Autowired
    private FormRepository formRepository;

    public String create_admNo(){
        long count=formRepository.count();
        int n=countDig((count+1));
        if(n==1){
            return("R-00"+(count+1));
        }
        else if (n==2) {
            return ("R-0"+(count+1));
        }
        else {
            return("R-"+(count+1));
        }


    }
        public int countDig(long n)
        {
            int count = 0;
            while(n != 0)
            {
                n = n / 10;
                count = count + 1;
            }
            return count;
        }
}
