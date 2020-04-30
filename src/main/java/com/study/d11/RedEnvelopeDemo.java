package com.study.d11;

public class RedEnvelopeDemo {
    public static void main(String[] args) {
        RedEnvelope re = RedEnvelope.雙親;
        System.out.println(re.getMoney());
        
        RedEnvelope[] res = {
            RedEnvelope.雙親,
            RedEnvelope.老婆,
            RedEnvelope.小孩    
        };
        
        int sum = 0;
        for(RedEnvelope r : res) {
            sum += r.getMoney();
        }
        System.out.println(sum);
        
    }
}
