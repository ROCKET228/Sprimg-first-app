package ua;

import org.springframework.stereotype.Component;


public class ClassicalMusic implements Music {
    public void doMyInt() {
        System.out.println("Init");
    }

    public void doMyDestroy() {
        System.out.println("Destroy");
    }

    @Override
    public String getSong() {
        return "Classic Music";
    }
}
