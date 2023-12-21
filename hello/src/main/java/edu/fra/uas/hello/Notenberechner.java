package edu.fra.uas.hello;

import org.springframework.stereotype.Service;

@Service
public class Notenberechner {
    

    public double berechneDurchschnitt(double[] noten) {
        if (noten.length == 0) {
            return 0.0;
        }
        double sum = 0;
        for (double note : noten) {
            sum += note;
        }
        return (double) sum / noten.length;
    }
}
